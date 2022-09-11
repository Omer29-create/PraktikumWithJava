package com.deneme.BosturDeneyebilirsin.Entity;

import lombok.*;
import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "abc")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "user_book",
            joinColumns = {
                    @JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {
            @JoinColumn(name = "book_id", referencedColumnName = "id")})
    private Book book;

    private Date createdDate;
    private int securityNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String mobilePhoneNumber;
    private boolean isSingle;


    public User(Date createdDate, int securityNumber, String firstName, String lastName, String email, String address, String mobilePhoneNumber, boolean isSingle) {

        this.createdDate = createdDate;
        this.securityNumber = securityNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.isSingle = isSingle;
    }


}
