package com.scm.forms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class UserForm {

    //form input fields attribute tha are present on form there are also intiataed here to get data

    private String name;

    private String email;
    private String password;
    private String about;
    private String phoneNumber;

}
