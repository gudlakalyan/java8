package com.karvy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karvy.modal.AuthorEntity;

public interface AuthorDao extends JpaRepository<AuthorEntity, Integer>{

	
}
