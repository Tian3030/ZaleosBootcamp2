package all.server.demo.service.restobjects;

import java.util.ArrayList;

public class User {
    private String username; //@manolo
    private String description;
    private ArrayList<Post> posts;  //We'll load all the posts from the user

    public User(String username, String description, ArrayList<Post> posts) throws IllegalArgumentException{
        if(username == null){ 
            throw new IllegalArgumentException("Wrong username");
        }
        this.username = username;
        this.description = description == null ? "" : description;
        this.posts = posts == null ? new ArrayList<Post>(0) : posts;
    }


}

