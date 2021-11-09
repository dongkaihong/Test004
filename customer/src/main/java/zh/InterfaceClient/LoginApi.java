package zh.InterfaceClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("provider")
public interface LoginApi {

    @RequestMapping("login/test")
    public String test();

}
