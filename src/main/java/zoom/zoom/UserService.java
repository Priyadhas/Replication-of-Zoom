package zoom.zoom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zoom.zoom.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
