package all.server.demo.restobjets;

 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="COMMENTS")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long comment_id;
    private String username;
    private String comment;
    private Long idPost;

    public Comment(){
        
    }
    public Comment(String username, String comment, Long idPost) throws IllegalArgumentException{

        if (comment == null || comment.equals("")) throw new IllegalArgumentException("Illegal comment");
        this.username = username;
        this.comment = comment;
        this.idPost = idPost;
    }

    // GETTERS
    public Long getComment_Id()                 {return this.comment_id;}
    public String getUsername()                 {return this.username;}
    public String getComment()                  {return this.comment;}
    public Long getIdPost()                     {return this.idPost;}

    //SETTERS
    public void setUsername(String username)    {this.username = username;}
    public void setComment(String comment)      {this.comment = comment;}
    public void setIdPost(Long idPost)      {this.idPost = idPost;}
}