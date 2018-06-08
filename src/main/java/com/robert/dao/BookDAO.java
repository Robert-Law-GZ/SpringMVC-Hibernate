package com.robert.dao;

import com.robert.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class BookDAO {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public void create(Book book){
        hibernateTemplate.saveOrUpdate(book);
    }

}
