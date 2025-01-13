// src/main/java/com/example/demo/controller/UserController.java
package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.entity.Users; // Userモデルをインポート
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!"; // 例としての挨拶
    }

    @GetMapping("/")
    public String index(Model model) {
        // ユーザーリストを取得してモデルに追加
        List<Users> users = userService.findAll();
        model.addAttribute("users", users);
        model.addAttribute("greeting", "Welcome to the User List!"); // 挨拶メッセージ
        return "index"; // index.htmlを返す
    }
}