package cn.itheima.controller;

import cn.itheima.Entity.DemoEntity;
import cn.itheima.service.DemoService;
import cn.itheima.util.HttpUtil;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author yangjie
 * @Create 2019-06-17 09:49
 */
@Controller
public class DemoController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DemoService demoService;

    @RequestMapping("/find3")
    @ResponseBody
    public String find3(@RequestBody String s) {

        return s;
    }

    /**
     * find4调用find3传递字符串
     *
     * @return
     */
    @RequestMapping("/find4")
    @ResponseBody
    public String find4() {
        String s = null;
        try {
            s = HttpUtil.doPost("http://localhost:8080/find3", "哈哈哈");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }


    /**
     * find5调用find6，传递po对象
     *
     * @return
     */
    @RequestMapping("/find5")
    @ResponseBody
    public String find5() {
        //请求参数
        String fileServiceUrl = "http://localhost:8080";
        //发送请求，获取结果
        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setName("bb");
        demoEntity.setId(22);
        String jsonString = JSON.toJSONString(demoEntity);
        String result = null;
        try {
            result = HttpUtil.doPost(fileServiceUrl + "/find6", jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping("/find6")
    @ResponseBody
    public String find6(@RequestBody DemoEntity demoEntity) {
        System.out.println(demoEntity);
        return demoEntity.toString();
    }
}
