package com.deneme.BosturDeneyebilirsin.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "User_Table")
@ToString
@Data
public class User {

    @Id
    @Column(name = "userId", nullable = false)
    private Long userId;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "address")
    private String address;
    @Column(name = "mobilePhoneNumber")
    private int mobilePhoneNumber;
    @Column(name = "Date")
    private Date createdDate;
    @Column(name = "securityNumber")
    private int securityNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "isSingle")
    private boolean isSingle;



    @OneToMany(targetEntity = Book.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk", referencedColumnName = "userId")
    private List<Book> books;


}