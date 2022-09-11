package com.deneme.BosturDeneyebilirsin.service;

import com.deneme.BosturDeneyebilirsin.Entity.User;
import com.deneme.BosturDeneyebilirsin.Repository.UserRepository;
import com.deneme.BosturDeneyebilirsin.exception.UserNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //add user
    public User addNewUser(User user) {
        return userRepository.save(user);
    }

    //get user all
    public List<User> getAllUser() {
        return userRepository.findAll();
    }


    //get user by id
    public User getUserById(Long id) {

        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
    }

    //update user
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    //delete user by id
    public void deleteUserById(Long id) {

        userRepository.deleteById(id);
    }

    //create random user
    public void addRandomUser() {
        Faker fakeUser = new Faker();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            long id = random.nextLong();
            Date createdDate = fakeUser.date().past(2017, TimeUnit.DAYS);
            int securityNumber = fakeUser.number().numberBetween(100000, 101000);
            String firstName = fakeUser.name().firstName();
            String lastName = fakeUser.name().lastName();
            String email = fakeUser.internet().emailAddress();
            String address = fakeUser.address().city();
            String mobilePhoneNumber = fakeUser.phoneNumber().cellPhone();
            Boolean isSingle = fakeUser.random().nextBoolean();
            User user = new User(createdDate, securityNumber, firstName, lastName, email, address, mobilePhoneNumber, isSingle);
            userRepository.save(user);

        }

    }

    /*//get User With Book
    public List<User> getAllUsersWithBooks() {
        return userRepository.findAllUsersWithBooks();
    }*/

}
