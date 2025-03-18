package all.server.demo.controller;

import all.server.demo.restobjets.User;

import all.server.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private UserService userService;

    //POST method for the 'users' resource.
    //Takes the users attributes from the request body.
    //Creates a new user with the attributes obtained, stores it in the database and returns it.
    //Error Control:
    //      - Cannot create a new user with the same id (username) as an existent user.
    //      - The id of the user (username) must be at least 4 characters long.
    //      - The name of the user must be at least 4 characters long.
    @PostMapping
    public String createUser(@RequestBody User user, Model model) {
        model.addAttribute("user",userService.createUser(user));
        return "postUser";
    }

    //GET method for the 'users' resource.
    //Takes the users id (username) from the URL.
    //Returns the user that matches the given username from the database.
    //Error Control:
    //      - Cannot search for a non-existent user.
    @GetMapping("/{username}")
    public String getUser(@PathVariable String username, Model model) {
        model.addAttribute("user", userService.getUser(username));
        return "getUser";
    }

    //GET method for the 'users' resource.
    //Can have query parameters for better filtering and are obtained by the URL.
    //Returns the user that matches the given username from the database.
    @GetMapping
    public String getUsers(@RequestParam(required = false, defaultValue = "") String name,
                               @RequestParam(required = false, defaultValue = "") String header,
                               @RequestParam(required = false) Integer followers,
                               @RequestParam(required = false) Integer followed, Model model) {
        model.addAttribute("users", userService.getUsers(name,header,followers,followed));
        return "getUsers";
    }

    //DELETE method for the 'users' resource.
    //Takes the users id (username) from the URL.
    //Deletes the user that matches the given username from the database.
    //Error Control:
    //      - A non-existent user cannot be deleted.
    @DeleteMapping("/{username}")
    public String deleteUser(@PathVariable String username, Model model) {
        model.addAttribute("user",userService.getUser(username));
        userService.deleteUser(username);
        return "deleteUser";
    }

    //PUT method for the 'users' resource.
    //Takes the users id (username) from the URL and the new attributes from the request body.
    //Changes whole information of they requested user except their id (username).
    //Error Control:
    //      - A non-existent user cannot be modified.
    //      - The id of the user (username) has to be the same in the URL and in the request body.
    @PutMapping("/{username}")
    public String editUser(@PathVariable String username, @RequestBody User userNew, Model model) {
        model.addAttribute("user",userService.editUser(username,userNew));
        return "putpatchUser";
    }

    //PATCH method for the 'users' resource.
    //Takes the users id (username) from the URL and the new attributes from the request body.
    //It only changes the number of followers and followed
    //Error Control:
    //      - A non-existent user cannot be modified.
    @PatchMapping("/{username}")
    public String patchUser (@PathVariable String username, @RequestBody User userNew, Model model){
        model.addAttribute("user", userService.patchUser(username,userNew));
        return "putpatchUser";
    }
}
