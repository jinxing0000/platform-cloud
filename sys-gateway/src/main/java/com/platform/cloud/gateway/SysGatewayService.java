package com.platform.cloud.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author 颜金星
 * @date 2020年03月13日
 * <p>
 * 网关应用
 */
@SpringCloudApplication
@ConfigurationPropertiesScan
public class SysGatewayService {

	public static void main(String[] args) {
		SpringApplication.run(SysGatewayService.class, args);
	}
}
