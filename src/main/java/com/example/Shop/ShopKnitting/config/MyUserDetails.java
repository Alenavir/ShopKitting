package com.example.Shop.ShopKnitting.config;


import com.example.Shop.ShopKnitting.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class MyUserDetails implements UserDetails {

    private final User user;

    @Autowired
    public MyUserDetails(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // возвращает лист из одного элемента
        return Collections.singletonList(new SimpleGrantedAuthority(user.getRoles()));
    }

    //  Позволяет получить пароль пользователя
    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    // Позволяет получить логин пользователя
    @Override
    public String getUsername() {
        return this.user.getEmail();
    }

    // Аккаунт действителен
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    // Аккаунт не заблокирован
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    // Пароль являеться действительным/валидным
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    // Аккаунт активен
    @Override
    public boolean isEnabled() {
        return true;
    }

    // Метод по получанию объект пользователя
    public User getPerson(){
        return this.user;
    }
}