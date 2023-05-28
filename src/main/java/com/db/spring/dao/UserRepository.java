package com.db.spring.dao;
import com.db.spring.entities.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer>{

}
