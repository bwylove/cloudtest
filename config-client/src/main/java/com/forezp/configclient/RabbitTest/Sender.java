///**
// * Copyright (C), 2015-2018, XXX有限公司
// * FileName: Sender
// * Author:   92406
// * Date:     2018/3/13 22:36
// * Description: 创建消息生产者
// * History:
// * <author>          <time>          <version>          <desc>
// * 作者姓名          修改时间           版本号             描述
// */
//
//
//package com.forezp.configclient.RabbitTest;
//
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.integration.amqp.dsl.Amqp;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//
///**
// * @author baijh
// * @version V1.0
// * @Description: ${todo}
// * @date 2018/3/13 22:36
// */
//@Component
//public class Sender {
//
//    @Autowired
//    private AmqpTemplate rabbitTemplate;
//
//    public void send(){
//        String msg = "hello rabbitmq:"+new Date();
//        System.out.println("Sender:"+msg);
//        this.rabbitTemplate.convertAndSend("hello", msg);
//    }
//
//}
