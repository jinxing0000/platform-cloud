package com.platform.cloud.monitor;


import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author 颜金星
 * @date 2020年03月13日
 * 监控中心
 */
@EnableAdminServer
@SpringCloudApplication
public class SysMonitorService {

	public static void main(String[] args) {
		SpringApplication.run(SysMonitorService.class, args);
	}
}
