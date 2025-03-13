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
    private String username; //@manolo, funcionara como id

    private String name;
    private String header;

    public User(String username, String name, String header) throws IllegalArgumentException{
        this.name = name;
        this.username = username;
        this.header = header == null ? "" : header;
    }

    public User(){
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

