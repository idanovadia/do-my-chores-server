package com.domychoresserver.domychoresserver.Payload.Request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class SignupRequest {

    @NotBlank
    @Size(max = 20)
    private String userName;

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

    private Set<String> roles;
}
