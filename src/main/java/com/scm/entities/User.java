package com.scm.entities;

import java.util.*;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name = "user")
//by default name of table is User but you want to change name
//use @Table annotation by which you change name of table
@Table(name = "users") //now table name be users
//here we use lombok so we declare getter setter here and 
//constructor also lombok take care of this no need to create getter seeter manuaully 
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// @Builder //The @Builder annotation is handy for creating immutable objects or when you have a large number of optional parameters to set.
public class User {

    //this @Id annotation make userId primary key in database
    @Id
    private String userId;

    @Column(name = "user_name", nullable = false) //using @column annotation we change name of column 
    private String name;

    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    
    @Column(length = 1000)
    private String about;
    @Column(length = 1000)
    private String profilePic;

    private String phoneNumber;

    //information
    private boolean enabled = false;
    private boolean emailVerified = false;
    private boolean phoneVerified = false;


    //SELF, Google, Facebook, Twitter, Linkedin,Github
    private Providers provider = Providers.SELF;
    private String providerUserId;

    //add more feilds if needed

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true) //one user have multiple contacts 
    private List<Contact> contacts = new ArrayList<>();
    

    //The cascade attribute is used to specify the set of cascade operations to be applied to the child entity.
    //CascadeType.ALL means that all operations (persist, merge, remove, refresh, detach) will be cascaded to the
    // associated Contact entities. This means that any operation performed on a User entity will be propagated to its associated Contact entities
    //The orphanRemoval attribute in JPA (Java Persistence API) is used to automatically remove child entities when they are disassociated from their
    // parent entity. When orphanRemoval is set to true, it means that if a child entity is removed from the parent entity's collection, it will be automatically deleted from the database.

} 