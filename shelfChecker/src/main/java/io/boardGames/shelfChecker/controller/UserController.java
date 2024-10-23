package io.boardGames.shelfChecker.controller;
import io.boardGames.shelfChecker.entity.User;
import io.boardGames.shelfChecker.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    UserService userService;

    // Constructor
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Metoder
    @GetMapping ("/user")
    public User getUserByID(){
        return userService.getUserById(1);
    }
}
