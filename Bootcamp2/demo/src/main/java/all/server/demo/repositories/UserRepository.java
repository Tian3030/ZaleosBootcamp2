package all.server.demo.repositories;

import all.server.demo.restobjets.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    List<User> findByName(String name);
    List<User> findByHeader(String header);
    List<User> findByFollowers(Integer followers);
    List<User> findByFollowed(Integer followed);
}
