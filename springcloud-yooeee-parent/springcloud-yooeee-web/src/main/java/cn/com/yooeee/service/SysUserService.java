package cn.com.yooeee.service;

import cn.com.yooeee.error.SysUserServiceFeignHytric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by Administrator on 2018/1/18.
 */
@FeignClient(value = "springcloud-yooeee-user", fallback = SysUserServiceFeignHytric.class)
public interface SysUserService {

    @RequestMapping("/sys/user/{sysUserId}")
    Map<String, Object> getUser(@PathVariable("sysUserId") Long sysUserId);

    @RequestMapping("/sys/user/list")
    Map<String,Object> findList(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize);


}
