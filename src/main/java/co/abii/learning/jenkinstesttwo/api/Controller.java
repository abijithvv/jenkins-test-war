package co.abii.learning.jenkinstesttwo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("springboottwo")
public class Controller {

    @GetMapping("/welcome/{name}")
    public String welcome(@PathVariable String name){
        return "Welcome! "+name+ " to the CI/CD pipeline managed by Jenkins. Developed and configured by Abijith";
    }
}
