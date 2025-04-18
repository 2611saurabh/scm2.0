package com.scm.entities;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Contact {

    @Id
    private String id;
    private String name;
    private String phoneNumber;
    private String address;
    private String picture;
    @Column(length = 1000)
    private String description;
    private boolean favourite = false;
    private String websiteLink;

    // private List<String > socialLinks = new ArrayList<>();  
    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<SocialLink> links = new ArrayList<>();

    @ManyToOne //contact has only one user while one user has many contacts
    private User user;

}
