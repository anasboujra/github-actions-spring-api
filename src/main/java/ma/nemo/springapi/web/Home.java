package ma.nemo.springapi.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping
    String home() {
        return "Welcome.\nthis is the home page";
    }
}
