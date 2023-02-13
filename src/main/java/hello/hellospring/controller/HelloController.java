package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")    // GetMapping의 Get은 get/post의 get이다.
    public String hello(Model model){
        model.addAttribute("data","hello!!");
        return "hello"; // hello.html로 가라는 뜻
        // 기본적으로 'resources/templates/' 에서 찾음
    }
}
