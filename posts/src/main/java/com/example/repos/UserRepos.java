package com.example.repos;

import com.example.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepos extends CrudRepository<User, Integer> {
}
