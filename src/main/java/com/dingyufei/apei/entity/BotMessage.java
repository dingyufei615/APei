package com.dingyufei.apei.entity;

import lombok.Data;

@Data
public class BotMessage {

    private String event;
    private String robot_wxid;
    private String robot_name;
    private int type;
    private String from_wxid;
    private String from_name;
    private String final_from_wxid;
    private String final_from_name;
    private String to_wxid;
    private String msg;
    private double money;


}
