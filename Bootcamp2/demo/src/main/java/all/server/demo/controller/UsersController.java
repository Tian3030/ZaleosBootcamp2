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

    //POST method for the 'users' resource.
    //Takes the users attributes from the request body.
    //Creates a new user with the attributes obtained, stores it in the database and returns it.
    //Error Control:
    //      - Cannot create a new user with the same id (username) as an existent user.
    //      - The id of the user (username) must be at least 4 characters long.
    //      - The name of the user must be at least 4 characters long.
    @PostMapping
    public User createUser(@RequestBody User user) {
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

    //GET method for the 'users' resource.
    //Takes the users id (username) from the URL.
    //Returns the user that matches the given username from the database.
    //Error Control:
    //      - Cannot search for a non-existent user.
    @GetMapping("/{username}")
    public User getUser(@PathVariable String username) {
        return userRepo.findById(username).orElseThrow(() -> new IllegalArgumentException("ERROR 404: User not found"));
    }

    //GET method for the 'users' resource.
    //Can have query parameters for better filtering and are obtained by the URL.
    //Returns the user that matches the given username from the database.
    @GetMapping
    public List<User> getUsers(@RequestParam(required = false, defaultValue = "") String name,
                               @RequestParam(required = false, defaultValue = "") String header,
                               @RequestParam(required = false) Integer followers,
                               @RequestParam(required = false) Integer followed) {
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
            throw new IllegalArgumentException("ERROR 400: Username mismatch");

        return userRepo.save(userNew);
    }

    //PATCH method for the 'users' resource.
    //Takes the users id (username) from the URL and the new attributes from the request body.
    //It only changes the number of followers and followed
    //Error Control:
    //      - A non-existent user cannot be modified.
    @PatchMapping("/{username}")
    public User editName (@PathVariable String username, @RequestBody User userNew){

        User userOld = userRepo.findById(username).orElseThrow(() -> new IllegalArgumentException("ERROR 404: User not found"));

        if(userNew.getFollowers() != null) {
            userOld.setFollowers(userNew.getFollowers());
        }

        if(userNew.getFollowed() != null) {
            userOld.setFollowed(userNew.getFollowed());
        }

        return userRepo.save(userOld);
    }
}
