package all.server.demo.controller;

import all.server.demo.restobjets.Post;
import all.server.demo.services.PostsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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
    public Post createPost(@RequestBody Post post) {
        return postsService.createPost(post);
    }

/*
 *  Endpoint: GET /api/posts
 *  Description: Gets all the posts. You can also filter per username assigned with the argument username. 
 *  username (optional): The username of the author whose posts should be retrieved.
 *  Returns a list of posts.
 */
    @GetMapping
    public List<Post> getPosts(@RequestParam(required = false) String username) {
        return postsService.getPosts(username);
    }
/*
 * Endpoint: GET /api/posts/{idPost}
 * Description: Retrieves a single post by its ID. 
 * Returns the post object.
 */
    @GetMapping("/{idPost}")
    public Post getPost(@PathVariable Long idPost) {
        return postsService.getPost(idPost);
    }

/*
 * Endpoint: DELETE /api/posts/{idPost}
 * Description: Deletes a post by its ID. 
 * Returns the deleted post object. Throws an error if the post cannot be found.
 */
    @DeleteMapping("/{idPost}")
    public Post deletePost(@PathVariable Long idPost) {
       return postsService.deletePost(idPost);
    }

/*
 * Endpoint: GET /api/posts/{idPost}/like
 * Description: Increments the likes on a post by its ID.
 * Returns the updated post object with incremented likes. Throws an error if the post cannot be found.
 */
    @GetMapping("/{idPost}/like")
    public Post likePost(@PathVariable Long idPost) {
        return postsService.likePost(idPost);
    }
/*
 * Endpoint: GET /api/posts/{idPost}/dislike
 * Description: Decrements the likes on a post by its ID.
 * Returns the updated post object with decremented likes. Throws an error if the post cannot be found.
 */
    @GetMapping("/{idPost}/dislike")
    public Post dislikePost(@PathVariable Long idPost) {
        return postsService.dislikePost(idPost);
    }

/*
 * Endpoint: GET /api/posts/{idPost}/share
 * Description: Increments the shares on a post by its ID.
 * Returns the updated post object with incremented shares. Throws an error if the post cannot be found.
 */
    @GetMapping("/{idPost}/share")
    public Post sharePost(@PathVariable Long idPost) {
        return postsService.sharePost(idPost);
    }
/*
 * Endpoint: GET /api/posts/{idPost}/unshare
 * Description: Decrements the shares on a post by its ID.
 * Returns the updated post object with decremented shares. Throws an error if the post cannot be found.
 */
    @GetMapping("/{idPost}/unshare")
    public Post unsharePost(@PathVariable Long idPost) {
        return postsService.unsharePost(idPost);
    }
}
