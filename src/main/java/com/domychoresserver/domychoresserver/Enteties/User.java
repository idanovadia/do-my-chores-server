package com.domychoresserver.domychoresserver.Enteties;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import javax.validation.constraints.Email;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User {

    @Id
    @EqualsAndHashCode.Include
    private String userName;

    private String firstName;
    private String lastName;
    private int rank;
    private int numberOfPost;
    private Date creationDate;
    @Email(message = "Email should be valid")
    private String Email;
    List<Post> postList = new LinkedList<>();
}
