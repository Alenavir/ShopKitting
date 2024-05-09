//package com.example.Shop.ShopKnitting.services;
//
//import com.example.Shop.ShopKnitting.config.MyUserDetails;
//import com.example.Shop.ShopKnitting.domain.User;
//import com.example.Shop.ShopKnitting.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class UserDetailService implements UserDetailsService {
//
//    private final UserRepository userRepository;
//
//    @Autowired
//    public UserDetailService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//
//    @Override
//    public  MyUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        // Получаем пользователя из таблицы person по логину с формы аутентификации
//        User user = userRepository.findByEmail(username);
//
//        // Если пользователь не был найден
//        if(user == null){
//            // Выбрасываем исключение что данный пользователь не найден
//            // Данное исключение будет поймано спринг секьюрити и сообщение будет выведено на страницу
//            throw new UsernameNotFoundException("Пользователь не найден");
//        }
//        // Возвращаем объект пользователя
//        return new MyUserDetails(user.());
//    }
//}
