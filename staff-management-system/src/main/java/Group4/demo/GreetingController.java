package Group4.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    // GET /
    @GetMapping("/")
    public String welcome() {
        return "Welcome to the REST API!";
    }

    // GET /greet/{name}
    @GetMapping("/greet/{name}")
    public String greet( ) {
        return "Hello,  Cudoon ! Welcome to our API.";
    }
}
