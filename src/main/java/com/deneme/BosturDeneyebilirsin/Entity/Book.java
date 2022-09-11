package com.deneme.BosturDeneyebilirsin.Entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tbl_book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(mappedBy = "book")
    private User user;


    private String writer;
    private Date publishDate;
    private int pageCount;
    private String bookVersion;
    private boolean isEpubVersionExist;


    public Book(String writer, Date publishDate, int pageCount, String bookVersion, boolean isEpubVersionExist) {
        this.writer = writer;
        this.publishDate = publishDate;
        this.pageCount = pageCount;
        this.bookVersion = bookVersion;
        this.isEpubVersionExist = isEpubVersionExist;
    }


}
