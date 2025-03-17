package all.server.demo.controller;

import all.server.demo.restobjets.Comment;
import all.server.demo.services.CommentsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentsController {

    @Autowired
    private CommentsService commentsService;

/*
 * Endpoint: POST /api/comments
 * Description: Creates a new comment. The request body must include comment details.
 * Returns the created comment object. Throws error if fails.
 */
    @PostMapping
    public Comment createComment(@RequestBody Comment comment) {
        return commentsService.createComment(comment);
    }


/*
 * Endpoint: GET /api/comments
 * Description: Retrieves all comments. If an idPost query parameter is provided, it returns comments associated with that post.
 * idPost (optional): The ID of the post whose comments should be retrieved.
 * Returns a list of comments.
 */
    @GetMapping
    public List<Comment> getComments(@RequestParam(required = false) Long idPost) {
        return commentsService.getComments(idPost);
    }
/*
 * Endpoint: GET /api/comments/{comment_id}
 * Description: Retrieves a single comment by its ID.
 * comment_id: The ID of the comment to retrieve.
 * Returns the comment object.
 */
    @GetMapping("/{comment_id}")
    public Comment getComment(@PathVariable Long comment_id) {
        return commentsService.getComment(comment_id);
    }

/*
 * Endpoint: DELETE /api/comments/{comment_id}
 * Description: Deletes a comment by its ID.
 * Returns the deleted comment object.
 */
    @DeleteMapping("/{comment_id}")
    public Comment deleteUser(@PathVariable Long comment_id) {
        return commentsService.deleteUser(comment_id);
    }
}
