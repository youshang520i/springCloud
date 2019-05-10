package top.youshang520i.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    /**
     * 配置hystrix断路器注解
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){
        return restTemplate.getForObject("http://EUREKA-CLIENT/hi?name="+name,String.class);
    }
    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }


    @HystrixCommand(fallbackMethod = "helloError")
    public String helloService(String str){
        return restTemplate.getForObject("http://EUREKA-CLIENT/hello?str="+str,String.class);
    }
    public String helloError(String str){
        return "hi,"+str+",sorry,error!";
    }
}
