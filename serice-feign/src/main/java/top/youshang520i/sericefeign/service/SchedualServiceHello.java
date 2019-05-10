package top.youshang520i.sericefeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**通过@ FeignClient（“服务名”），来指定调用哪个服务
 * @Author: youshang
 * @Description:
 * @Date: Created in 10:10 2019/5/10
 * @Modified By:
 */
@FeignClient("eureka-client2")
public interface SchedualServiceHello {


    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String helloformClientOne(@RequestParam(value = "str") String str);

    /*@RequestMapping(value = "/test",method = RequestMethod.GET)
    Map<String, Object> getTest(Map<String,Object> map);*/

}
