package all.server.demo.controller;

import all.server.demo.repositories.UserRepository;
import all.server.demo.restobjets.User;

import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpStatusCodeException;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private UserRepository userRepo;

//    public UsersController(UserRepository userRepo){
//        this.userRepo = userRepo;
//    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        if (userRepo.existsById(user.getUsername()))
            throw new IllegalArgumentException("ERROR 400: Username already exists");

        else if (user.getUsername().length() < 4)
            throw new IllegalArgumentException("ERROR 400: Username too short");

        else if (user.getName().length() < 4)
            throw new IllegalArgumentException("ERROR 400: Name too short");

        else
            return userRepo.save(user);
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable String username) {
        return userRepo.findById(username).orElseThrow(() -> new IllegalArgumentException("ERROR 400: User not found"));
    }

    @GetMapping
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @DeleteMapping("/{username}")
    public void deleteUser(@PathVariable String username) {

        if (!userRepo.existsById(username))
            throw new IllegalArgumentException("ERROR 400: User does not exist");

        userRepo.deleteById(username);
    }

    @PutMapping("/{username}")
    public User editUser(@PathVariable String username, @RequestBody User userNew) {

        if(!userNew.getUsername().equals(username))
            throw new IllegalArgumentException("ERROR 400: Username missmatch");

        if(userRepo.existsById(userNew.getUsername()))
            throw new IllegalArgumentException("ERROR 400: Cannot modify a non existant user");

        if(userRepo.existsById(username))
            throw new IllegalArgumentException("ERROR 404: User not found");

        return userRepo.save(userNew);
    }

//    @PatchMapping("/{username}")
//    public User editName (@PathVariable String username, @RequestBody User userNew){
//
//        User userOld = userRepo.findById(username).orElseThrow(() -> new IllegalArgumentException("ERROR 400: User not found"));
//
//        if(userNew.getName() != null) {
//            if (userNew.getName() == null || userNew.getName().isBlank())
//                throw new IllegalArgumentException("ERROR 400: Unable to modify the users name, please provide a valid name");
//            userOld.setName(userNew.getName());
//        }
//
//        if(userNew.getHeader() != null) {
//            userOld.setHeader(userNew.getHeader());
//        }
//
//        if(userNew.getPosts() != null){
//            userOld.getPosts().addAll(userNew.getPosts());
//        }
//
//        return userRepo.save(userOld);
//    }
}
