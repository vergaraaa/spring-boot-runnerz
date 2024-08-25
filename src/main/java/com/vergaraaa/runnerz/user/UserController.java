package com.vergaraaa.runnerz.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
class UserController {

    private final UserHttpClient client;

    UserController(UserHttpClient client) {
        this.client = client;
    }

    @GetMapping("")
    List<User> findAll() {
        return client.findAll();
    }

    @GetMapping("/{id}")
    User findById(@PathVariable Integer id) {
        return client.findById(id);
    }

}