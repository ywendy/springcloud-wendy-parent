package cn.com.yooeee.user.web;

import cn.com.yooeee.user.entry.SysUser;
import cn.com.yooeee.user.service.SysUserService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/18.
 */
@RestController
@RequestMapping("/sys/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;
    @RequestMapping(value = "/{sysUserId}",method = RequestMethod.GET)
    public SysUser get(@PathVariable("sysUserId") Long sysUserId){

        return sysUserService.getSysUser(sysUserId);
    }
    @RequestMapping("/list")
    public Map<String, Object> list(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize){

        Page<SysUser> page =  sysUserService.findList(pageNum,pageSize);
        Map<String, Object> result = new HashMap<String,Object>();
        result.put("result",page.getResult());
        System.err.println(JSON.toJSON(page.getResult()));
        return result;
    }


}
