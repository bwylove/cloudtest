/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: SchedualServiceHiHystric
 * Author:   92406
 * Date:     2018/3/12 23:31
 * Description: 需要实现SchedualServiceHi 接口，并注入到Ioc容器中
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间           版本号             描述
 */


package com.forezp.sericefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author baijh
 * @version V1.0
 * @Description: ${todo}
 * @date 2018/3/12 23:31
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
