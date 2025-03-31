package com.scm.repsitories;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//we take user type and type which user id has
public interface UserRepo extends JpaRepository<User, String> {

    //extra methiods db relatedoperations
    
    //custom query
    //custom finder methods



}
