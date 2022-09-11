package com.deneme.BosturDeneyebilirsin.Repository;

import com.deneme.BosturDeneyebilirsin.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
