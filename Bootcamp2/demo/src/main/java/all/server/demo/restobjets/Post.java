package all.server.demo.restobjets;
import java.util.ArrayList;
import java.util.List;

public class Post {

    final String VOID_IMAGE_PATH = "images/voidImage";

    private int id_Post;
    private int likes;
    private int reposts;
    private String description;
    private List<Comment> comments;    
    private String imagePath;   

    public Post(int id_Post, String imagePath, String postComment, ArrayList<Comment> comments,int likes,int reposts) throws IllegalArgumentException{
        if(id_Post == 0){ 
            throw new IllegalArgumentException("This id_Post is not allowed");
        }
        this.id_Post = id_Post;
        this.imagePath = imagePath == null ? VOID_IMAGE_PATH : imagePath;
        this.description = description == null ? "" : description;
        this.comments = comments == null ? new ArrayList<Comment>(0) : comments;
        this.likes =likes;
        this.reposts = reposts;
    }

    //GETTERS
    public int getId_Post(){ return this.id_Post; }
    public int getLikes(){ return this.likes; }
    public int getReposts(){ return this.reposts; }
    public String getDescription(){ return this.description; }
    public List<Comment> getComments(){ return this.comments; }
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
