package cn.shenan.upms.rpc.service.impl;

import cn.shenan.upms.dao.model.UpmsUser;
import cn.shenan.upms.dao.model.UpmsUserExample;
import cn.shenan.upms.rpc.api.UpmsUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import java.util.List;

/**
 * 单元测试
 * Created by shenan on 2017/2/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:applicationContext.xml",
        "classpath:META-INF/spring/applicationContext-jdbc.xml",
        "classpath:META-INF/spring/applicationContext-listener.xml"
})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class test {

    @Autowired
    private UpmsUserService upmsUserService;

    @Test
    public void index() {
        UpmsUser upmsUser = new UpmsUser();
        upmsUser.setName("shenan");
        upmsUser.setPassword("123456");
        upmsUserService.insertSelective(upmsUser);
        System.out.println(upmsUser.getName());
    }

    @Test
    public void query() {
        UpmsUserExample ex = new UpmsUserExample();
        ex.createCriteria().andNameEqualTo("shenan");
        List<UpmsUser> result = upmsUserService.selectByExample(ex);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).getName());
        }
    }
}
