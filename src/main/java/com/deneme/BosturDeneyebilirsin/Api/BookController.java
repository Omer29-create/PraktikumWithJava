package com.deneme.BosturDeneyebilirsin.Api;

import com.deneme.BosturDeneyebilirsin.Entity.User;
import com.deneme.BosturDeneyebilirsin.Repository.BookRepository;
import com.deneme.BosturDeneyebilirsin.Repository.UserRepository;
import com.deneme.BosturDeneyebilirsin.dto.BookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/placeOrder")
    public User placeOrder(@RequestBody BookRequest request) {
        return userRepository.save(request.getUser());
    }

    @GetMapping("/findAllOrders")
    public List<User> findAllOrders() {
        return userRepository.findAll();
    }
}
