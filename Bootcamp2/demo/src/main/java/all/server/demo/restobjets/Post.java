package all.server.demo.restobjets;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="POSTS")
public class Post {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPost;
    private String username;//AUTHOR USER OF THE POST

    //DEFAULT VALUES FOR THESE PARAMETERS
    private int likes=0;    
    private int shares=0;
    private String description="";

    public Post(){}

    public Post(String username, String description,int likes,int shares) throws IllegalArgumentException{
        this.username=username;
        this.description = description == null ? "" : description;
        this.likes =likes;
        this.shares = shares;
    }

    //GETTERS
    public Long getIdPost()            {return this.idPost;}
    public String getUsername()        {return this.username;}

    public int getLikes()              {return this.likes;}
    public int getShares()             {return this.shares;}
    public String getDescription()     {return this.description;}

    //SETTERS
    public void setUsername(String username)        {this.username=username;}
    public void setLikes(int likes)                 {this.likes=likes;}
    public void setShares(int shares)               {this.shares=shares;}
    public void setDescription(String description)  {this.description=description;}
}
