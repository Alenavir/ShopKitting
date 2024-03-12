package com.example.Shop.ShopKnitting.repository;

import com.example.Shop.ShopKnitting.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepos extends CrudRepository<User, Long> {

}
