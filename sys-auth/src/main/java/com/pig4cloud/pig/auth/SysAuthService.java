package com.pig4cloud.pig.auth;


import com.platform.cloud.common.security.annotation.EnablePigFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author 颜金星
 * @date 2020年03月13日
 * 认证授权中心
 */
@SpringCloudApplication
@EnablePigFeignClients
public class SysAuthService {

	public static void main(String[] args) {
		SpringApplication.run(SysAuthService.class, args);
	}
}
