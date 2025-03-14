package all.server.demo.restobjets;

import all.server.demo.repositories.UserRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.ArrayList;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    private String username;

    private String name;
    private String header;
    private Integer followers;
    private Integer followed;

    public User(String username, String name, String header){
        this.name = name;
        this.username = username;
        this.header = header == null ? "" : header;
        this.followers = 0;
        this.followed = 0;
    }

    public User(){
    }

    public String getUsername() {
        return username;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFollowed() {
        return followed;
    }

    public void setFollowed(Integer followed) {
        this.followed = followed;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }
}

