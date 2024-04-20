package com.example.Shop.ShopKnitting.services.products;

import com.example.Shop.ShopKnitting.domain.Product;
import com.example.Shop.ShopKnitting.domain.User;
import com.example.Shop.ShopKnitting.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public List<User> getListProducts() {
        return userRepository.findAll();
    }

    public User saveProduct(User user) {
        return userRepository.save(user);
    }
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User findById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);
    }
    public User updateProduct(User user) {
        return userRepository.save(user);
    }

    public void deleteProduct(Long id) {
        userRepository.deleteById(id);
    }

}
