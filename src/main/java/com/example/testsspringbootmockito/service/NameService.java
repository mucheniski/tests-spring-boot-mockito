package com.example.testsspringbootmockito.service;

import org.springframework.stereotype.Service;

@Service
public class NameService {

    public String getUserName(String id) {
        return "Real User Name";
    }

}
