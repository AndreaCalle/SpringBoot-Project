package io.javabrains.bootquickstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//annotation to make this class become rest controller, request to certain methods  
public class HelloController {
    @RequestMapping("/hello")//default method /get reuest . part of the url and the say hi will be return back , no need for http 
    public String sayHi(){//this mthod need to become called , need to mapping 
        return "Hi";
    }
//spring will start up and find these annotations and register it before it run up. 
}
