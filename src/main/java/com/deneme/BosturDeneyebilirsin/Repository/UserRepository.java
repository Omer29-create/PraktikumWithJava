package com.deneme.BosturDeneyebilirsin.Repository;


import com.deneme.BosturDeneyebilirsin.Entity.User;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    void deleteUserById(Long id);
   /* @Query("SELECT r FROM User")
    List<User> findAllUsersWithBooks();*/



}


