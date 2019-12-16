package com.karvy.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class AuthorEntity {

	@Id
	@Column(name = "author_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int authorId;
	
	@Column(name = "author_name")
	private String name;
	
//	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//	@OneToMany(mappedBy = "author")
//	private List<Artical> articlList;

	public int getAuthorId() {
		
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public List<Artical> getArticlList() {
//		return articlList;
//	}
//	
//	public void setArticlList(List<Artical> articlList) {
//		this.articlList = articlList;
//	}
	
	
	
	
	
	
	
	
	
}
