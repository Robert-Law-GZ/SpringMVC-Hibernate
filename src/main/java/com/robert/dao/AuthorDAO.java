package com.robert.dao;

import com.robert.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AuthorDAO {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public void create(Author author){
        hibernateTemplate.saveOrUpdate(author);
    }

    @Transactional
    public void deleteById(Author author){
        hibernateTemplate.delete(author);
    }

    @Transactional
    public List<Author> findAll(){
        return (List<Author>) hibernateTemplate.find("from Author");
    }

}
