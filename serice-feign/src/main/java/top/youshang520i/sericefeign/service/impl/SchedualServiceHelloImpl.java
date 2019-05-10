package top.youshang520i.sericefeign.service.impl;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import top.youshang520i.sericefeign.service.SchedualServiceHello;

/**
 * @Author: youshang
 * @Description:
 * @Date: Created in 10:10 2019/5/10
 * @Modified By:
 */
@Component
public class SchedualServiceHelloImpl implements SchedualServiceHello {

    @Override
    public String helloformClientOne(String str) {
        return "sorry "+str;
    }


}
