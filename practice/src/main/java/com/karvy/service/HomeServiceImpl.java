package com.karvy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karvy.dao.AuthorDao;
import com.karvy.dao.HomeDao;
import com.karvy.modal.Artical;
import com.karvy.modal.AuthorEntity;

@Service
public class HomeServiceImpl implements HomeServiceI{

	@Autowired
	HomeDao homeDao;
	
	@Autowired
	AuthorDao authorDao;
	
	@Override
	public AuthorEntity addAuthor(AuthorEntity author) {
//		homeDao.save(artical); // save or merge and nothin returnig
//		System.out.println(homeDao.count());
		
		
//		System.out.println(homeDao.getArticle(1).size());
		
//		return homeDao.saveAndFlush(artical); // returns saved entity object
		
//		return homeDao.count();
		
//		return authorDao.saveAndFlush(author);
		authorDao.save(author);
		
//		homeDao.save(author.getArticlList().get(0));
//		homeDao.save(author.getArticlList().get(1));

		return author;
	}

}
