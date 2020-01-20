package br.com.fredericci.devoctans.springinitializertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringinitializerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringinitializerTestApplication.class, args);
    }

}


@RestController
class HomeController {

    @GetMapping("/")
    public String index(@RequestParam("name") String name) {
        return "Ola, " + name;
    }

}
