package io.boardGames.shelfChecker.service;
import io.boardGames.shelfChecker.entity.User;
import io.boardGames.shelfChecker.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository;

    // Constructor
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Metoder
    public User getUserById(int id){
        return userRepository.findById(id).get();
    }
}
