package cn.itheima.service.impl;

import cn.itheima.Entity.DemoEntity;
import cn.itheima.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author yangjie
 * @Create 2019-06-17 09:46
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public DemoEntity find() {
        DemoEntity demoEntity=new DemoEntity();
        demoEntity.setName("张三");
        demoEntity.setId(1);
        return demoEntity;
    }
}
