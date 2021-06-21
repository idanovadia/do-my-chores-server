package com.domychoresserver.domychoresserver.Enteties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * admin with ROLE_ADMIN
 * moderator with ROLE_MODERATOR and ROLE_USER
 * bezkoder with ROLE_USER
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    @Id
    private String id;

    private ERole name;

    public Role(ERole name) {
        this.name = name;
    }
}
