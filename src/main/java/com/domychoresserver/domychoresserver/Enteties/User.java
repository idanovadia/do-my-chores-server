package com.domychoresserver.domychoresserver.Enteties;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @EqualsAndHashCode.Include
    private String id;

    @NotBlank
    @Size(max = 20)
    private String username;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    private Date creationDate = new Date();

    @NotBlank
    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$", flags = Pattern.Flag.UNICODE_CASE)
    private String password;

    @NotBlank
    @Email(message = "Email should be valid")
    private String email;

    @DBRef
    private Set<Role> roles = new HashSet<>();

    public User(@NotBlank @Size(max = 20) String username,
                @NotBlank String firstName,
                @NotBlank String lastName,
                @NotBlank @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$", flags = Pattern.Flag.UNICODE_CASE) String password,
                @NotBlank @Email(message = "Email should be valid") String email, Date creationDate) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.creationDate = creationDate;
    }
}
