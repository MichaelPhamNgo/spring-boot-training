package com.springboot.app.dao;

import com.springboot.app.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MongoRepositoryExample extends MongoRepository<User, String> {
    List<User> findUserByUsername(String username);

    @Query(value = "{password: ?0}", fields = "{id: 0, username: 1, password: 1}")
    List<User> findUserByPassword(String password);
}
