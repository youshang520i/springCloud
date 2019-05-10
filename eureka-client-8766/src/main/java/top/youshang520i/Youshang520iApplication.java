package top.youshang520i;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Youshang520iApplication {

    public static void main(String[] args) {
        SpringApplication.run(Youshang520iApplication.class, args);
    }

}
