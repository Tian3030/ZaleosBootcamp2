package all.server.demo.restobjets;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="POSTS")
public class Post {
    
    final String VOID_IMAGE_PATH = "images/voidImage";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPost;
    private String username;//AUTHOR USER OF THE POST

    //DEFAULT VALUES FOR THESE PARAMETERS
    private int likes=0;    
    private int shares=0;
    private String description="";
    //private List<Comment> comments=new ArrayList<>();    
    //private String imagePath;   

    public Post(){}

    public Post(Long idPost, String imagePath, String postComment, ArrayList<Comment> comments,int likes,int shares) throws IllegalArgumentException{
        if(idPost == 0){ 
            throw new IllegalArgumentException("This idPost is not allowed");
        }
        this.idPost = idPost;
        //this.imagePath = imagePath == null ? VOID_IMAGE_PATH : imagePath;
        this.description = description == null ? "" : description;
        //this.comments = comments == null ? new ArrayList<Comment>(0) : comments;
        this.likes =likes;
        this.shares = shares;
    }

    //GETTERS
    public Long getIdPost()            {return this.idPost;}
    public String getUsername()        {return this.username;}

    public int getLikes()              {return this.likes;}
    public int getShares()             {return this.shares;}
    public String getDescription()     {return this.description;}
    //public List<Comment> getComments()  {return this.comments;}
    //public String getImagePath(){ return this.imagePath; }

    //SETTERS
    public void setUsername(String username)        {this.username=username;}
    public void setLikes(int likes)                 {this.likes=likes;}
    public void setShares(int shares)               {this.shares=shares;}
    public void setDescription(String description)  {this.description=description;}
    //public void setComments(ArrayList<Comment> comments){this.comments=comments;}
    //public void setImagePath(String imagePath) { this.imagePath=imagePath; }
}
