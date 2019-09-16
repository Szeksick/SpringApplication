package codes.szeksick.springimagehostapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

    @GetMapping("/test1")
    public String test(){
        return"Hello test1";
    }
    @GetMapping("/test2")
    public String test1(){
        return"Hello test2";
    }
    @GetMapping("/test3")
    public String test2(){
        return"Hello test3";
    }

}
