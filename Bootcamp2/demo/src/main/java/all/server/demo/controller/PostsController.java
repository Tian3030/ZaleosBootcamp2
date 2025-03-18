package all.server.demo.controller;

import all.server.demo.restobjets.Post;
import all.server.demo.services.PostsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/posts")
public class PostsController {

    @Autowired
    private PostsService postsService;

/*
 * Endpoint: POST /api/posts
 * Description: Creates a new post. The request body must include post details, and the post's author must exist.
 * Returns the created post object or throws an error if the post cannot be created.
 */
    @PostMapping
    public String createPost(@RequestBody Post post, Model model) {
        model.addAttribute("post", postsService.createPost(post));
        return "postPost";
    }

/*
 *  Endpoint: GET /api/posts
 *  Description: Gets all the posts. You can also filter per username assigned with the argument username. 
 *  username (optional): The username of the author whose posts should be retrieved.
 *  Returns a list of posts.
 */
    @GetMapping
    public String getPosts(@RequestParam(required = false) String username, Model model) {
        model.addAttribute("posts", postsService.getPosts(username));
        return "getPosts";
    }
/*
 * Endpoint: GET /api/posts/{idPost}
 * Description: Retrieves a single post by its ID. 
 * Returns the post object.
 */
    @GetMapping("/{idPost}")
    public String getPost(@PathVariable Long idPost, Model model) {
        model.addAttribute("post", postsService.getPost(idPost));
        return "getPost";
    }

/*
 * Endpoint: DELETE /api/posts/{idPost}
 * Description: Deletes a post by its ID. 
 * Returns the deleted post object. Throws an error if the post cannot be found.
 */
    @DeleteMapping("/{idPost}")
    public String deletePost(@PathVariable Long idPost, Model model) {
        model.addAttribute("post", postsService.deletePost(idPost));
        return "deletePost";
    }

/*
 * Endpoint: GET /api/posts/{idPost}/like
 * Description: Increments the likes on a post by its ID.
 * Returns the updated post object with incremented likes. Throws an error if the post cannot be found.
 */
    @GetMapping("/{idPost}/like")
    public String likePost(@PathVariable Long idPost, Model model) {
        model.addAttribute("post", postsService.likePost(idPost));
        return "putPost";
    }
/*
 * Endpoint: GET /api/posts/{idPost}/dislike
 * Description: Decrements the likes on a post by its ID.
 * Returns the updated post object with decremented likes. Throws an error if the post cannot be found.
 */
    @GetMapping("/{idPost}/dislike")
    public String dislikePost(@PathVariable Long idPost, Model model) {
        model.addAttribute("post", postsService.dislikePost(idPost));
        return "putPost";
    }

/*
 * Endpoint: GET /api/posts/{idPost}/share
 * Description: Increments the shares on a post by its ID.
 * Returns the updated post object with incremented shares. Throws an error if the post cannot be found.
 */
    @GetMapping("/{idPost}/share")
    public String sharePost(@PathVariable Long idPost, Model model) {
        model.addAttribute("post", postsService.sharePost(idPost));
        return "putPost";
    }
/*
 * Endpoint: GET /api/posts/{idPost}/unshare
 * Description: Decrements the shares on a post by its ID.
 * Returns the updated post object with decremented shares. Throws an error if the post cannot be found.
 */
    @GetMapping("/{idPost}/unshare")
    public String unsharePost(@PathVariable Long idPost, Model model) {
        model.addAttribute("post", postsService.unsharePost(idPost));
        return "putPost";
    }
}
