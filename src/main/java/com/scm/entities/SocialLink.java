package com.scm.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "social_link")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SocialLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String link;
    private String title;
    
    @ManyToOne
    private Contact contact;
 
}
