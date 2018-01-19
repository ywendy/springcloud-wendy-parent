package cn.com.yooeee.error;

import cn.com.yooeee.service.SysUserService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/18.
 */
@Component
public class SysUserServiceFeignHytric implements SysUserService {
    public Map<String, Object> getUser(@PathVariable("sysUserId") Long sysUserId) {
        Map<String, Object> map = new HashMap();
        map.put("code", "00001");
        map.put("message", "sorry:" + sysUserId);
        return map;
    }

    public  Map<String,Object>  findList(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize) {
        return new HashMap<String,Object>();
    }
}
