package io.github.zhanyr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
@SpringBootApplication
public class SpringBootStudyApplication {

    @RequestMapping("/")
    String index(){
        return "hello world!";
    }

    public static void main(String[] args){
        SpringApplication application = new SpringApplication(SpringBootStudyApplication.class);
        application.run(args);

    }
}
