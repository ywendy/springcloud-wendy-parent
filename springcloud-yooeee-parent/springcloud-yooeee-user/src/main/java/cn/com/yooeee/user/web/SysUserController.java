package cn.com.yooeee.user.web;

import cn.com.yooeee.user.entry.SysUser;
import cn.com.yooeee.user.service.SysUserService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Page<SysUser> list(@RequestParam("pageNum") Integer pageNum,@RequestParam("pageSize") Integer pageSize){

        return sysUserService.findList(pageNum,pageSize);
    }


}
