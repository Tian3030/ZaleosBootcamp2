package all.server.demo.services;

import all.server.demo.repositories.PostRepository;
import all.server.demo.repositories.UserRepository;
import all.server.demo.restobjets.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class PostsService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private PostRepository postRepo;

    public PostsService(UserRepository userRepo, PostRepository postRepo){
        this.userRepo=userRepo;
        this.postRepo=postRepo;
    }

    //Creates and saves a new post if the author exists.
    public Post createPost(Post post) {
        if (!userRepo.existsById(post.getUsername())) {
            throw new IllegalArgumentException("The author of the post does not exist");
        } else
            return postRepo.save(post);
    }

    //Retrieves all posts or filters by username.
    public List<Post> getPosts(String username) {
        if (username == null)
            return postRepo.findAll();
        return postRepo.findByUsername(username);
    }

    //Fetches a specific post by idPost. Throws an error if not found.
    public Post getPost(Long idPost) {
        return postRepo.findById(idPost).orElseThrow(() -> new IllegalArgumentException("ERROR 400: Post not found"));
    }

    //Deletes a post by idPost and returns the deleted post.
    public Post deletePost(Long idPost) {
        Post post = postRepo.findById(idPost).orElseThrow(() -> new IllegalArgumentException("ERROR 404: Post not found."));
        postRepo.deleteById(idPost);
        return post;
    }

    //Increments the like count of a post.
    public Post likePost(Long idPost) {

        Post post = postRepo.findById(idPost)
                .orElseThrow(() -> new IllegalArgumentException("ERROR 400: Post not found"));
        int likes = post.getLikes();
        post.setLikes(likes + 1);

        return postRepo.save(post);
    }

    //Decrements the like count if it's greater than zero.
    public Post dislikePost(Long idPost) {
        Post post = postRepo.findById(idPost)
                .orElseThrow(() -> new IllegalArgumentException("ERROR 400: Post not found"));

        int likes = post.getLikes();
        if (likes > 0)
            post.setLikes(likes - 1);

        return postRepo.save(post);
    }

    //Increments the share count of a post.
    public Post sharePost(Long idPost) {

        Post post = postRepo.findById(idPost)
                .orElseThrow(() -> new IllegalArgumentException("ERROR 400: Post not found"));
        int shares = post.getShares();
        post.setShares(shares + 1);
        return postRepo.save(post);
    }
    //Decrements the share count if it's greater than zero.
    public Post unsharePost(@PathVariable Long idPost) {
        Post post = postRepo.findById(idPost)
                .orElseThrow(() -> new IllegalArgumentException("ERROR 400: Post not found"));

        int shares = post.getShares();
        if (shares > 0)
            post.setShares(shares - 1);
        return postRepo.save(post);
    }
}