package kr.hs.dgsw.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    
    @GetMapping("/")
    public String getString() {
        return "!";
    }
    
    @GetMapping("/hello")
    public String getHelloString() {
        return "Hello world!";
    }
}
