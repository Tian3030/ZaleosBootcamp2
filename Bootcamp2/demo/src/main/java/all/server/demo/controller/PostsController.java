package all.server.demo.controller;

import all.server.demo.repositories.PostRepository;
import all.server.demo.repositories.UserRepository;
import all.server.demo.restobjets.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostsController {

    @Autowired
    private PostRepository postRepo;

    @Autowired
    private UserRepository userRepo;

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        if (!userRepo.existsById(post.getUsername())) {
            throw new IllegalArgumentException("The author of the post does not exist");
        } else
            return postRepo.save(post);
    }

    /*
     * GETS ALL THE POSTS. YOU CAN FILTER PER username ASSIGNED using the argument
     * 
     * @{username}
     */
    @GetMapping
    public List<Post> getPosts(@RequestParam(required = false) String username) {
        if (username == null)
            return postRepo.findAll();
        return postRepo.findByUsername(username);
    }

    @GetMapping("/{idPost}")
    public Post getPost(@PathVariable Long idPost) {
        return postRepo.findById(idPost).orElseThrow(() -> new IllegalArgumentException("ERROR 400: Post not found"));
    }

    @DeleteMapping("/{idPost}")
    public void deletePost(@PathVariable Long idPost) {

        if (!postRepo.existsById(idPost))
            throw new IllegalArgumentException("ERROR 400: Post not found");
        postRepo.deleteById(idPost);
    }

    // INCREMENTS THE LIKES ON A POST
    @GetMapping("/{idPost}/like")
    public Post likePost(@PathVariable Long idPost) {

        Post post = postRepo.findById(idPost)
                .orElseThrow(() -> new IllegalArgumentException("ERROR 400: Post not found"));
        int likes = post.getLikes();
        post.setLikes(likes + 1);

        return postRepo.save(post);
    }

    @GetMapping("/{idPost}/dislike")
    public Post dislikePost(@PathVariable Long idPost) {
        Post post = postRepo.findById(idPost)
                .orElseThrow(() -> new IllegalArgumentException("ERROR 400: Post not found"));

        int likes = post.getLikes();
        if (likes > 0)
            post.setLikes(likes - 1);

        return postRepo.save(post);
    }

    // INCREMENTS THE SHARES ON A POST
    @GetMapping("/{idPost}/share")
    public Post sharePost(@PathVariable Long idPost) {

        Post post = postRepo.findById(idPost)
                .orElseThrow(() -> new IllegalArgumentException("ERROR 400: Post not found"));
        int shares = post.getShares();
        post.setShares(shares + 1);
        return postRepo.save(post);
    }

    @GetMapping("/{idPost}/unshare")
    public Post unsharePost(@PathVariable Long idPost) {
        Post post = postRepo.findById(idPost)
                .orElseThrow(() -> new IllegalArgumentException("ERROR 400: Post not found"));

        int shares = post.getShares();
        if (shares > 0)
            post.setShares(shares - 1);
        return postRepo.save(post);
    }
}
