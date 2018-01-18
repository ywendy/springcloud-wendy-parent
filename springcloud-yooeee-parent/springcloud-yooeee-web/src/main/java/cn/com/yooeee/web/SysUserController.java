package cn.com.yooeee.web;

import cn.com.yooeee.service.SysUserService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/18.
 */
@RestController
public class SysUserController {


    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/sys/user/{sysUserId}")
    public Map<String,Object> getUser(@PathVariable("sysUserId") Long sysUserId){
        return sysUserService.getUser(sysUserId);
    }


    @RequestMapping("/sys/user/list")
    public List<Map<String,Object>> list(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize){
        List<Map<String,Object>> page =  sysUserService.findList(pageNum,pageSize);

        return page;
    }

}
