package top.youshang520i8767.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: youshang
 * @Description:
 * @Date: Created in 13:54 2019/5/10
 * @Modified By:
 */
@RestController
@EnableEurekaClient
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hello")
    public String hello(){
        return "这是另外一个项目，项目端口为："+port;
    }
}
