/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: HelloService
 * Author:   92406
 * Date:     2018/3/12 22:42
 * Description: 通过之前注入ioc容器的restTemplate来消费service-hi服务的“/hi”接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间           版本号             描述
 */


package com.forezp.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author baijh
 * @version V1.0
 * @Description: ${todo}
 * @date 2018/3/12 22:42
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
