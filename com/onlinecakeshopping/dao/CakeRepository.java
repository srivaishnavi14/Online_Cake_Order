package com.onlinecakeshopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinecakeshopping.model.Cake;

//it is used to indicate the class provides crud opretions by extending to the jpa
@Repository
public interface CakeRepository extends JpaRepository<Cake, Integer> {

}
