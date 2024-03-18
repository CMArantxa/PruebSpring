package com.ceica.PruebaSpring;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
    public User findAllByUsername(String username);
}
