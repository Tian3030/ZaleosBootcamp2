package all.server.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

@Controller
@RequestMapping("/api/images")
public class ImageController {

    @CrossOrigin(origins = "*")  // Permite solicitudes CORS desde este origen
    @GetMapping(value = "/{username}", produces = "image/png") 
    public @ResponseBody byte[] getImage(@PathVariable String username) throws IOException {
        
        if (!username.matches("^[a-zA-Z0-9_-]+$")) {
            throw new IllegalArgumentException("Invalid username");
        }

        InputStream in = getClass()
        .getResourceAsStream("/images/"+username+".png");
        if(in==null){
            in=getClass().getResourceAsStream("/images/"+username+".jpg");
        }
        if(in==null){
            in=getClass().getResourceAsStream("/noimage.jpg");
        }
        return IOUtils.toByteArray(in);
    }
    
}
