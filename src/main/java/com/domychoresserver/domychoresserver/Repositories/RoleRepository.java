package com.domychoresserver.domychoresserver.Repositories;

import com.domychoresserver.domychoresserver.Enteties.ERole;
import com.domychoresserver.domychoresserver.Enteties.Role;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

@Document(collection = "roles")
public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
