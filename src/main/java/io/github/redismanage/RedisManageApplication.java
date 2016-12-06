package io.github.redismanage;

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
public class RedisManageApplication {

    @RequestMapping("/")
    String index(){
        System.out.println("hello");
        return "hello world!";
    }

    public static void main(String[] args){
        SpringApplication application = new SpringApplication(RedisManageApplication.class);
        application.run(args);

    }
}
