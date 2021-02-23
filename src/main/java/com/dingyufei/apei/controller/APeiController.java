package com.dingyufei.apei.controller;

import com.dingyufei.apei.entity.BotMessage;
import com.dingyufei.apei.entity.Msg;
import com.dingyufei.apei.entity.ResponseMsg;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class APeiController {
    @PostMapping("/")
    public ResponseMsg sayHello(@RequestBody BotMessage msg) {
        System.out.println(msg);

        ResponseMsg res = new ResponseMsg();
        res.setSuccess(true);
        res.setMessage("successful");
        res.setEvent("SendImageMsg");
        res.setRobot_wxid("wxid_4hgbdexg83pg22");
        res.setTo_wxid(msg.getFrom_wxid());
        res.setMessage("");
        res.setMember_name("");
        res.setGroup_wxid("");
        Msg msg1 = new Msg();
        msg1.setName("https:\\/\\/b3logfile.com\\/bing\\/20201024.jpg");
        msg1.setName("aaa.jpg");
        res.setMsg(msg1);
        return res;
    }
}
