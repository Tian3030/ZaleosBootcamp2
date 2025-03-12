package all.server.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController //Combines the @Controller and thre @ResponseBody annotations. This allows to return the string data rather than a full view
@RequestMapping("/api")    //If we want to make it a post, we can type:  @RequestMapping("/url",method= RequestMethod.POST),by default it is get 

public class HelloController {

    private final HelloService helloService;
    
    @Autowired
    public HelloController (HelloService helloService){
        this.helloService=helloService;
    }

    //RESOURCE TO BE ATTENDED
    @GetMapping
    public String hello(){
        return helloService.hello();
    }
    
}
