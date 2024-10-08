package kr.re.kitri.devopsdemoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "안녕하세요";
    }

    @GetMapping("/about")
    public String about() {
        return "DevOps Ex";
    }

    @GetMapping("/add")
    public String add() {
        return "추가";
    }
}
