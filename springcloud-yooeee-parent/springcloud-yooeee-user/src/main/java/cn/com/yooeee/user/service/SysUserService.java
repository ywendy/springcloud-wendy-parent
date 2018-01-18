package cn.com.yooeee.user.service;

import cn.com.yooeee.user.entry.SysUser;
import cn.com.yooeee.user.mapper.SysUserMapper;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/1/18.
 */
@Service
public class SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;


    public SysUser getSysUser(Long sysUserId) {
        return sysUserMapper.selectByPrimaryKey(sysUserId);
    }


    public Page<SysUser> findList(int startPage, int pageSize) {
        Page<SysUser> page = PageHelper.startPage(startPage, pageSize).doSelectPage(new ISelect() {
            public void doSelect() {
                sysUserMapper.findList();
            }
        });
        return page;
    }

}
