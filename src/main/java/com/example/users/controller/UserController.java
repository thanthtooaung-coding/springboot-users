package com.example.users.controller;

import com.example.users.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@CrossOrigin(origins = {
        "http://localhost:5173",
        "http://localhost:3000",
        "https://corporate-banking-app-frontend.vercel.app"
})
@RestController
public class UserController {

    @GetMapping("/users")
    public BaseResponse<User> getUsers() {
        List<User> userList = Arrays.asList(
                new User(1, "Alice Johnson", "1990-05-14", 1, "alice@example.com", "2023-01-01T10:00:00Z", "2023-06-01T12:00:00Z"),
                new User(2, "Bob Smith", "1985-08-22", 2, "bob@example.com", "2023-02-01T11:00:00Z", "2023-07-01T13:00:00Z")
        );

        Pagination pagination = new Pagination(1, userList.size(), 10);

        return new BaseResponseWithPagination<>(
                200,
                "Success",
                userList,
                pagination
        );
    }

    @GetMapping("")
    public String getIndex() {
        return "Hello Java!";
    }
}
