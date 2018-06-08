package com.robert.service;

import com.robert.dao.AuthorDAO;
import com.robert.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorDAO authorDAO;

    public List<Author> findAll(){
        return authorDAO.findAll();
    }

}
