package all.server.demo.services;

import all.server.demo.repositories.CommentRepository;
import all.server.demo.repositories.PostRepository;
import all.server.demo.repositories.UserRepository;
import all.server.demo.restobjets.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsService {

    @Autowired
    private CommentRepository commentRepo;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private PostRepository postRepo;

    public CommentsService(CommentRepository commentRepo,UserRepository userRepo, PostRepository postRepo){
        this.commentRepo=commentRepo;
        this.userRepo=userRepo;
        this.postRepo=postRepo;
    }

    //Creates and returns a new comment
    public Comment createComment(Comment comment) {
        System.out.println(comment.getUsername());

        if (!postRepo.existsById(comment.getIdPost())) {
            throw new IllegalArgumentException("ERROR 404: Post not found");
        } else if (comment.getComment().length() <= 0 || comment.getComment().length() > 255) {
            throw new IllegalArgumentException("ERROR 400: Illegal comment length.");
        } else if (!userRepo.existsById(comment.getUsername())) {
            throw new IllegalArgumentException("ERROR 404: The author of the comment does not exist");
        } else {
            return commentRepo.save(comment);
        }
    }

    //Retrieves all comments; optionally filters by idPost
    public List<Comment> getComments(Long idPost) {
        if (idPost == null)
            return commentRepo.findAll();
        return commentRepo.findByIdPost(idPost);
    }

    //Fetches a specific comment by its comment_id.
    public Comment getComment(Long comment_id) {
        return commentRepo.findById(comment_id).orElseThrow(() -> new IllegalArgumentException("ERROR 404: Comment not found."));
    }

    //Deletes a comment by its comment_id.
    public Comment deleteComment(Long comment_id) {
        Comment comment = commentRepo.findById(comment_id).orElseThrow(() -> new IllegalArgumentException("ERROR 404: Comment not found."));
        commentRepo.deleteById(comment_id);
        return comment;
    }
}
