package com.karvy.modal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "artical")
public class Artical {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "category")
	private String category;
	
//	@ManyToOne(fetch = FetchType.LAZY, optional = false)
//	@ManyToOne
//	@JoinColumn(name = "author_id")
//	private AuthorEntity author;
	
	@Column(name = "title")
	private String title;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Artical() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Artical(int id, String category, String title) {
		super();
		this.id = id;
		this.category = category;
		this.title = title;
	}
//	public AuthorEntity getAuthor() {
//		return author;
//	}
//	public void setAuthor(AuthorEntity author) {
//		this.author = author;
//	}
	
	
	
	
	
	
}
