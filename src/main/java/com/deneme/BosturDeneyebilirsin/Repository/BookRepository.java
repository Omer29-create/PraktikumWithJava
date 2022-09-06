package com.deneme.BosturDeneyebilirsin.Repository;

import com.deneme.BosturDeneyebilirsin.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
