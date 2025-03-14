package all.server.demo.controller;

import all.server.demo.repositories.UserRepository;
import all.server.demo.restobjets.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private UserRepository userRepo;

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

    //GET method for the 'users' resource.
    //Takes the users id (username) from the URL.
    //Returns the user that matches the given username from the database.
    //Error Control:
    //      - A non-existent user cannot be modified.
    @GetMapping("/{username}")
    public User getUser(@PathVariable String username) {
        return userRepo.findById(username).orElseThrow(() -> new IllegalArgumentException("ERROR 404: User not found"));
    }

    //GET method for the 'users' resource.
    //Can have query parameters for better filtering.
    //Returns the user that matches the given username from the database.
    //Error Control:
    //      - A non-existent user cannot be modified.
    @GetMapping
    public List<User> getUsers(@RequestParam(required = false, defaultValue = "") String name,
                               @RequestParam(required = false, defaultValue = "") String header) {
        if(!name.isEmpty())
            return userRepo.findByName(name);
        else if(!header.isEmpty())
            return userRepo.findByHeader(header);
        else
            return userRepo.findAll();
    }

    //DELETE method for the 'users' resource.
    //Takes the users id (username) from the URL.
    //Deletes the user that matches the given username from the database.
    //Error Control:
    //      - A non-existent user cannot be deleted.
    @DeleteMapping("/{username}")
    public void deleteUser(@PathVariable String username) {

        if (!userRepo.existsById(username))
            throw new IllegalArgumentException("ERROR 404: User not found");

        userRepo.deleteById(username);
    }

    //PUT method for the 'users' resource.
    //Takes the users id (username) from the URL and the new attributes from the request body.
    //Changes whole information of they requested user except their id (username).
    //Error Control:
    //      - A non-existent user cannot be modified.
    //      - The id of the user (username) has to be the same in the URL and in the request body.
    @PutMapping("/{username}")
    public User editUser(@PathVariable String username, @RequestBody User userNew) {

        if(!userRepo.existsById(username))
            throw new IllegalArgumentException("ERROR 404: User not found");

        if(!userNew.getUsername().equals(username))
            throw new IllegalArgumentException("ERROR 400: Username missmatch");

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
