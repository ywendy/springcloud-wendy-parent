package cn.com.yooeee.user.service;

import cn.com.yooeee.user.entry.SysUser;
import cn.com.yooeee.user.mapper.SysUserMapper;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/1/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SysUserServiceTest {
    @Autowired
    private SysUserService sysUserService;

    @Test
    public void findList() throws Exception {
        Page<SysUser> page = sysUserService.findList(1, 5);
        List<SysUser> list = page.getResult();
        System.err.println(JSON.toJSON(list));
    }

}