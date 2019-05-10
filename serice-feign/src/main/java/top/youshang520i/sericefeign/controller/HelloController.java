package top.youshang520i.sericefeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.youshang520i.sericefeign.service.SchedualServiceHello;
import top.youshang520i.sericefeign.service.SchedualServiceHi;

/**
 * @Author: youshang
 * @Description:
 * @Date: Created in 10:13 2019/5/10
 * @Modified By:
 */
@RestController
public class HelloController {

    @Autowired
    private SchedualServiceHello serviceHi;

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "str")String str){
        return serviceHi.helloformClientOne(str);
    }
    /*@RequestMapping("/test")
    public Map<String, Object> getMap(){
        Map<String, Object> map = new ConcurrentHashMap<String, Object>();
        map.put("test1",new Integer(2));
        map.put("test2",new Double(2));
        map.put("test3",new BigDecimal(2));
        serviceHi.getTest(map);
        return map;
    }*/




}
