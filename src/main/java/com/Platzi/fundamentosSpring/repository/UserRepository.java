package com.Platzi.fundamentosSpring.repository;

import com.Platzi.fundamentosSpring.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    //consulta hqpl a traves de bojetos
    @Query(value = "select * from users u where u.email=?1", nativeQuery = true)
    Optional<User> findByUserEmail(String email);


}
