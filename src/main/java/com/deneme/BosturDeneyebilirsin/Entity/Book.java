package com.deneme.BosturDeneyebilirsin.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Book_Table")
public class Book {

    @Id
    @Column(name = "bookId", nullable = false)
    private Long bookId;
    @Column(name = "writer")
    private String writer;
    @Column(name = "publishDate")
    private Date publishDate;
    @Column(name = "bookPageCount")
    private String bookPageCount;
    @Column(name = "bookVersion")
    private int bookVersion;
    @Column(name = "isEpubVersionExist")
    private boolean isEpubVersionExist;

}
