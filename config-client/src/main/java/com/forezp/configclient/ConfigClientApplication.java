package com.forezp.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConfigClientApplication.class, args);
		System.out.println("【【【【【【 ConfigClientRefreshBus微服务 】】】】】】已启动.");
	}

}
