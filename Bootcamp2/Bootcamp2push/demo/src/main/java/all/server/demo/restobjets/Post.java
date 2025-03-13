package all.server.demo.restobjets;

import java.util.ArrayList;

public class Post {
    private int id;
    private int likes;
    private int reposts;
    private String description;
    private ArrayList<String> comments;    
    private String imagePath;   

    public Post(int id, String imagePath, String postComment, ArrayList<String> comments,int likes,int reposts) throws IllegalArgumentException{
        if(id == 0){ 
            throw new IllegalArgumentException("This id is not allowed");
        }
        this.id = id;
        this.imagePath = imagePath == null ? "images/voidImage" : imagePath;
        this.description = description == null ? "" : description;
        this.comments = comments == null ? new ArrayList<String>(0) : comments;
        this.likes =likes;
        this.reposts = reposts;
    }

    //GETTERS
    public int getId(){
        return this.id;
    }
    public String getImagePath(){
        return this.imagePath;
    }
    public String getDescription(){
        return this.description;
    }
    public ArrayList<String> getComments(){
        return this.comments;
    }

    //SETTERS
    
    public void addComment(String comment){
        comments.add(comment);
    }

}
