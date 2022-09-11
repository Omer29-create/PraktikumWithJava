package com.deneme.BosturDeneyebilirsin.service;

import com.deneme.BosturDeneyebilirsin.Entity.User;
import com.deneme.BosturDeneyebilirsin.Repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {


    @Mock
    private UserRepository userRepository;

    @Mock
    private UserService underTest;

    @BeforeEach
    void setUp(){
        underTest = new UserService(userRepository);
    }

    @Test
    void canAddNewUser() {
        //given
        User user = new User();

        //when
        underTest.addNewUser(user);

        //then
        ArgumentCaptor<User> userArgumentCaptor =
        ArgumentCaptor.forClass(User.class);

        verify(userRepository).save(userArgumentCaptor.capture());

        User capturedUser = userArgumentCaptor.getValue();
        assertThat(capturedUser).isEqualTo(user);


    }

    @Test
    void canGetAllUser() {
        //when
        underTest.getAllUser();
        //then
        verify(userRepository).findAll();
    }

    @Test
    void canGetUserById() {
        Long id = 12L;
       User result = new User();
       result.setId(id);
       when(userRepository.findById(id)).thenReturn(Optional.of(result));
       underTest.getUserById(id);
       verify(userRepository).findById(id);

    }

    @Test
    void updateUser() {
        User user = new User();

       user.setEmail("abc@gmail.com");


       when(userRepository.save(user)).thenReturn(user);
        underTest.updateUser(user);
       verify(userRepository).save(user);


    }

    @Test
    void deleteUserById() {
        Long id = 15L;

        User user = new User();
        underTest.deleteUserById(id);
        verify(userRepository).deleteById(15L);

    }
}