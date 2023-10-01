package ch.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginApi {

    @RequestMapping("/test")
    public String test(){
        System.out.println("hello world!");
        return "hello world";
    }

}
