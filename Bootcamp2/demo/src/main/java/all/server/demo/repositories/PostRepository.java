package all.server.demo.repositories;

import all.server.demo.restobjets.Post;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findByUsername(String username);
}
