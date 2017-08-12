package com.nishant.springcloudhelper.springcloudconfighelper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class SpringCloudConfigHelperApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigHelperApplication.class, args);
	}
}
