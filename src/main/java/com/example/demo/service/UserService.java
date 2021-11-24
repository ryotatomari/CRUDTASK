package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repositry.UserRepositry;

/**
 * ユーザー情報 Service
 */
@Service
public class UserService {

	/**
     * ユーザー情報 Repository
     */
    @Autowired
    UserRepositry userRepository;
    public List<User> searchAll() {
        // ユーザーTBLの内容を全検索
        return (List<User>) userRepository.findAll();
    }
}

