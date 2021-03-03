package com.dingyufei.apei.controller;

import com.dingyufei.apei.entity.BotMessage;
import com.dingyufei.apei.entity.ResponseMsg;
import com.dingyufei.apei.util.JsonUtils;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "机器人API接口")
@RequestMapping("/api")
public class APeiController {
    public static String Robot_wxid = "wxid_4hgbdexg83pg22";

    @PostMapping("/")
    public String sayHello(@RequestBody String msgJson) {
        System.out.println("程序收到消息 -->" + msgJson);
        BotMessage msg = JsonUtils.jsonTOBean(msgJson, BotMessage.class);
        ResponseMsg res = new ResponseMsg();
        res.setSuccess(true);
        String[] ss = new String[0];
        res.setData(ss);
        res.setMessage("successful!");
        res.setEvent("SendTextMsg");
        res.setRobot_wxid(Robot_wxid);
        res.setTo_wxid(msg.getFrom_wxid());
        res.setMember_name(msg.getFrom_name());
        res.setMember_wxid(msg.getFrom_wxid());
        res.setGroup_wxid("");
        res.setMsg("测试成功！！！");
        String json = JsonUtils.beanToJson(res);
        System.out.println("返回消息 -->" + json);


        return json;
    }
}
