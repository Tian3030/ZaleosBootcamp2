package all.server.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import all.server.demo.repositories.*;
import all.server.demo.restobjets.User;

@Component
public class DataLoader {

    private UserRepository userRepository;

    @Autowired
    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
        LoadUsers();
    }

    private void LoadUsers() {
        userRepository.save(new User("yaGOD", "YagoGamer", "Me gusta el hardware y el opensource"));
    }

}