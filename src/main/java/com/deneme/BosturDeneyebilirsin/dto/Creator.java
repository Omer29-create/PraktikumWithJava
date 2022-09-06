package com.deneme.BosturDeneyebilirsin.dto;

import com.deneme.BosturDeneyebilirsin.Repository.UserRepository;
import com.deneme.BosturDeneyebilirsin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;


public class Creator {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    String pattern = "yyyy-MM-dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
}
