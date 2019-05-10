package top.youshang520i.sericefeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.youshang520i.sericefeign.service.SchedualServiceHi;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: youshang
 * @Description:
 * @Date: Created in 10:13 2019/5/10
 * @Modified By:
 */
@RestController
public class HiController {

    @Autowired
    private SchedualServiceHi serviceHi;

    @RequestMapping("/hi")
    public String sayHi(@RequestParam(value = "name")String name){
        return serviceHi.sayHiformClientOne(name);
    }






}
