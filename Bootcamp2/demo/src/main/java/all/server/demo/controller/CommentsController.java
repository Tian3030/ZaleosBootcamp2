package all.server.demo.controller;

import all.server.demo.restobjets.Comment;
import all.server.demo.services.CommentsService;

import all.server.demo.services.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/comments")
public class CommentsController {

    @Autowired
    private CommentsService commentsService;

    @Autowired
    private PostsService postsService;

/*
 * Endpoint: POST /api/comments
 * Description: Creates a new comment. The request body must include comment details.
 * Returns the created comment object. Throws error if fails.
 */
    @PostMapping
    public String createComment(@RequestBody Comment comment, Model model) {
        model.addAttribute("comment", commentsService.createComment(comment));
        model.addAttribute("post", postsService.getPost(comment.getIdPost()));
        return "postComment";
    }


/*
 * Endpoint: GET /api/comments
 * Description: Retrieves all comments. If an idPost query parameter is provided, it returns comments associated with that post.
 * idPost (optional): The ID of the post whose comments should be retrieved.
 * Returns a list of comments.
 */
    @GetMapping
    public String getComments(@RequestParam(required = false) Long idPost, Model model) {
        model.addAttribute("comments", commentsService.getComments(idPost));
        model.addAttribute("post", postsService.getPost(idPost));
        return "getComments";
    }
/*
 * Endpoint: GET /api/comments/{comment_id}
 * Description: Retrieves a single comment by its ID.
 * comment_id: The ID of the comment to retrieve.
 * Returns the comment object.
 */
    @GetMapping("/{comment_id}")
    public String getComment(@PathVariable Long comment_id, Model model) {
        Comment aux = commentsService.getComment(comment_id);
        model.addAttribute("comment", aux);
        model.addAttribute("post", postsService.getPost(aux.getIdPost()));
        return "getComment";
    }

/*
 * Endpoint: DELETE /api/comments/{comment_id}
 * Description: Deletes a comment by its ID.
 * Returns the deleted comment object.
 */
    @DeleteMapping("/{comment_id}")
    public String deleteComment(@PathVariable Long comment_id, Model model) {
        model.addAttribute("comment", commentsService.deleteComment(comment_id));
        return "deleteComment";
    }
}
