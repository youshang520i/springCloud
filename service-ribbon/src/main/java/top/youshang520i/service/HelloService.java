package top.youshang520i.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: youshang
 * @Description:
 * @Date: Created in 14:29 2019/5/9
 * @Modified By:
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name){
        return restTemplate.getForObject("http://EUREKA-CLIENT/hi?name="+name,String.class);
    }
}
