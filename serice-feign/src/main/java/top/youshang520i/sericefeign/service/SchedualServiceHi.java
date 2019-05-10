package top.youshang520i.sericefeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**通过@ FeignClient（“服务名”），来指定调用哪个服务
 * @Author: youshang
 * @Description:
 * @Date: Created in 10:10 2019/5/10
 * @Modified By:
 */
@FeignClient(value = "eureka-client",fallback = SchedualServiceHi.class)
@Service
public interface SchedualServiceHi {


    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiformClientOne(@RequestParam(value = "name")String name);

    /*@RequestMapping(value = "/test",method = RequestMethod.GET)
    Map<String, Object> getTest(Map<String,Object> map);*/

}
