package com.boutiqueEnLigne.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boutiqueEnLigne.entities.Article;

public interface IArticleDao extends JpaRepository<Article, Long>{

}
