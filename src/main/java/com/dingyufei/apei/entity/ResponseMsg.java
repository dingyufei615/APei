package com.dingyufei.apei.entity;

import lombok.Data;

@Data
public class ResponseMsg {

    private boolean success;
    private String message;
    private String event;
    private String robot_wxid;
    private String to_wxid;
    private String member_wxid;
    private String member_name;
    private String group_wxid;
    private Msg msg;


}

