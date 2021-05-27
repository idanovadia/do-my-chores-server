package com.domychoresserver.domychoresserver.Repositories;

import com.domychoresserver.domychoresserver.Enteties.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,Integer> {
}
