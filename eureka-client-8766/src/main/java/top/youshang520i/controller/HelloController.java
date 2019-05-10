package top.youshang520i.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: youshang
 * @Description:
 * @Date: Created in 13:36 2019/5/10
 * @Modified By:
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "str")String str){
        return "这是另外一个项目，项目端口为："+port;
    }

}
