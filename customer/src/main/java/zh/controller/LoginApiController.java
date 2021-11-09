package zh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zh.InterfaceClient.LoginApi;

@RestController
@RequestMapping("login")
public class LoginApiController {

    @Autowired
    private LoginApi loginApi;

    @RequestMapping("/testApi")
    public String testApi(){

        String str = loginApi.test();
        return str;

    }

}
