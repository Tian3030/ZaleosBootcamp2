package all.server.demo.controller;

import all.server.demo.repositories.CommentRepository;
import all.server.demo.repositories.UserRepository;
import all.server.demo.restobjets.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentsController {

    @Autowired
    private CommentRepository commentRepo;

    @Autowired
    private UserRepository userRepo;

    @PostMapping
    public Comment createComment (@RequestBody Comment comment){

        System.out.println(comment.getUsername());

        if(comment.getComment().length() <= 0 || comment.getComment().length() > 255){
            throw new IllegalArgumentException("Comment size not allowed");
        }
        else if(!userRepo.existsById(comment.getUsername())){
            throw new IllegalArgumentException("The author of the comment does not exist");
        }
        else{return commentRepo.save(comment);}
        }

    
    @GetMapping("/{comment_id}")
    public Comment getComment (@PathVariable Long comment_id){
        return commentRepo.findById(comment_id).orElseThrow(() -> new IllegalArgumentException("Comment not found"));
    }

    /*
     * GETS ALL THE COMMENTS. YOU CAN ALSO FILTER PER idPost ASSIGNED WITH THE ARGUMENT
     * idPost
     */
    @GetMapping
    public List<Comment> getComments (@RequestParam(required= false )  Long idPost){
        if(idPost == null) return commentRepo.findAll();
        return commentRepo.findByIdPost(idPost);
    }


    @DeleteMapping("/{comment_id}")
    public void deleteUser (@PathVariable Long comment_id){

        if(!commentRepo.existsById(comment_id))
            throw new IllegalArgumentException("Comment does not exist");
        commentRepo.deleteById(comment_id);
    }
}
