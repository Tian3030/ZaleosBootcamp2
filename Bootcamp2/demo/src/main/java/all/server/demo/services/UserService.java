package all.server.demo.services;

import all.server.demo.repositories.UserRepository;
import all.server.demo.restobjets.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepo;

    @Autowired
    public UserServices(UserRepository userRepository){
        userRepo = userRepository;
    }

    //POST
    public User createUser(User user) {
        if (userRepo.existsById(user.getUsername()))
            throw new IllegalArgumentException("ERROR 400: Username already exists");

        else if (user.getUsername().length() < 4)
            throw new IllegalArgumentException("ERROR 400: Username too short");

        else if (user.getName().length() < 4)
            throw new IllegalArgumentException("ERROR 400: Name too short");

        else {
            user.setFollowers(0);
            user.setFollowed(0);
            return userRepo.save(user);
        }
    }

    //GET user
    public User getUser(String username) {
        return userRepo.findById(username).orElseThrow(() -> new IllegalArgumentException("ERROR 404: User not found"));
    }

    //GET users
    public List<User> getUsers(String name, String header, Integer followers, Integer followed) {
        if(!name.isEmpty())
            return userRepo.findByName(name);
        else if(!header.isEmpty())
            return userRepo.findByHeader(header);
        else if(followers != null)
            return userRepo.findByFollowers(followers);
        else if(followed != null)
            return userRepo.findByFollowed(followed);
        else
            return userRepo.findAll();
    }

    //PUT users
    public User editUser(String username, User userNew) {

        if(!userRepo.existsById(username))
            throw new IllegalArgumentException("ERROR 404: User not found");

        if(!userNew.getUsername().equals(username))
            throw new IllegalArgumentException("ERROR 400: Username mismatch");

        return userRepo.save(userNew);
    }

    //PATCH user
    public User patchUser (String username, User userNew){

        User userOld = userRepo.findById(username).orElseThrow(() -> new IllegalArgumentException("ERROR 404: User not found"));

        if(userNew.getFollowers() != null) {
            userOld.setFollowers(userNew.getFollowers());
        }

        if(userNew.getFollowed() != null) {
            userOld.setFollowed(userNew.getFollowed());
        }

        return userRepo.save(userOld);
    }

    //DELETE user
    public void deleteUser(String username) {

        if (!userRepo.existsById(username))
            throw new IllegalArgumentException("ERROR 404: User not found");

        userRepo.deleteById(username);
    }

}
