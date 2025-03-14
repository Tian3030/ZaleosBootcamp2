package all.server.demo.repositories;

import all.server.demo.restobjets.Comment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
    List<Comment> findByIdPost(Long idPost);
}
