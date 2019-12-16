package com.karvy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.karvy.modal.Artical;

@Repository
public interface HomeDao extends JpaRepository<Artical, Integer> {
	
//	public List<Artical> addArticle(Artical artical);
	
	@Query("select t from Artical t where t.id=1")
	public List<Artical> getArticle(Integer id);
	
	
}
