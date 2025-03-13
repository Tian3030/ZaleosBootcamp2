package all.server.demo.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//We need to declare this class as an instanciated class. to do this we use @Component. But with Spring we can use @Service so we are more specific
@Service
public class HelloService {
    
    public String hello(){
        return "Hello World";
    }
}
