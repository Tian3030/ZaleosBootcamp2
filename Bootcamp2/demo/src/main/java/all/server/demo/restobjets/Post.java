package all.server.demo.restobjets;
import java.util.ArrayList;


public class Post {

    final String VOID_IMAGE_PATH = "images/voidImage";

    private int id;
    private int likes;
    private int reposts;
    private String description;
    private ArrayList<Comment> comments;    
    private String imagePath;   

    public Post(int id, String imagePath, String postComment, ArrayList<Comment> comments,int likes,int reposts) throws IllegalArgumentException{
        if(id == 0){ 
            throw new IllegalArgumentException("This id is not allowed");
        }
        this.id = id;
        this.imagePath = imagePath == null ? VOID_IMAGE_PATH : imagePath;
        this.description = description == null ? "" : description;
        this.comments = comments == null ? new ArrayList<Comment>(0) : comments;
        this.likes =likes;
        this.reposts = reposts;
    }

    //GETTERS
    public int getId(){ return this.id; }
    public int getLikes(){ return this.likes; }
    public int getReposts(){ return this.reposts; }
    public String getDescription(){ return this.description; }
    public ArrayList<Comment> getComments(){ return this.comments; }
    public String getImagePath(){ return this.imagePath; }

    //SETTERS
    public void setLikes(int likes) { this.likes=likes; }
    public void setReposts(int reposts) { this.reposts=reposts; }
    public void setDescription(String description) { this.description=description; }
    public void setComments(ArrayList<Comment> comments) { this.comments=comments; }
    public void setImagePath(String imagePath) { this.imagePath=imagePath; }

    //FUNCTIONALITIES
    public void addComment(Comment comment){ this.comments.add(comment); }
    public void increaseLikes(){ this.likes++; }
    public void decreaseLikes(){ this.likes--; }

}
