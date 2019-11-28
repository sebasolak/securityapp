package pl.sebastian.securityapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello!1!!11!";
    }
    @GetMapping("/hello2")
    public String sayHello2() {
        return "hello!1!!11! YOU MADE IT!!!";
    }


}
