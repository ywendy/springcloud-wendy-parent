package cn.com.yooeee.user.mapper

import cn.com.yooeee.user.entry.SysUser
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

/**
 * Created by Administrator on 2018/1/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
 public class SysUserMapperTest {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
  public   void testInsert() {
        SysUser sysUser = new SysUser();
        sysUser.setLoginName("wendy_01");
        sysUser.setNickName("温迪001")
       int result =  sysUserMapper.insert(sysUser);

        Assert.assertTrue(result == 1);


    }

  public   void testSelectByPrimaryKey() {

    }
}
