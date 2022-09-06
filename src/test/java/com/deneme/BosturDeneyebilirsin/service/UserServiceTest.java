package com.deneme.BosturDeneyebilirsin.service;

import com.deneme.BosturDeneyebilirsin.Entity.User;
import com.deneme.BosturDeneyebilirsin.Repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.util.Assert;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
   private UserRepository userRepository;
    // private AutoCloseable autoCloseable;
   private UserService userService;

    void setUp() {
        // autoCloseable = MockitoAnnotations.openMocks(this);
        userService = new UserService(userRepository);
    }

    @Test
    void canAddNewUser() {
        // GIVEN
        User user = new User();

        // WHEN
        userService.addNewUser(user);

        // THEN
        ArgumentCaptor<User> userArgumentCaptor = ArgumentCaptor.forClass(User.class);

        verify(userRepository).save(userArgumentCaptor.capture());

        User capturedUser = userArgumentCaptor.getValue();
        // Assert.assertThat(capturedUser).isEqualTo(user);
    }

    @Test
    void canGetAllUser() {
        // WHEN
        userService.getAllUser();

        // THEN
        verify(userRepository).findAll();
    }

    @Test
    void getUserById() {
        userService.getUserById(123L);
        verify(userRepository).getUserById(123L);
    }

    @Test
    void updateUser(User user) {
        userService.updateUser(user);
        verify(userRepository).updateUserById(user);
    }

    @Test
    void deleteUserById(Long id) {
        userService.deleteUserById(id);
        verify(userRepository).deleteById(id);
    }
}
