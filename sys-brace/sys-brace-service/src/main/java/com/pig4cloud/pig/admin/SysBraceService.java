package com.pig4cloud.pig.admin;


import com.pig4cloud.pig.common.security.annotation.EnablePigFeignClients;
import com.pig4cloud.pig.common.security.annotation.EnablePigResourceServer;
import com.pig4cloud.pigx.common.swagger.annotation.EnablePigSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author 颜金星
 * @date 2020年03月13日
 * 用户统一管理系统
 */
@EnablePigSwagger2
@EnablePigResourceServer
@EnablePigFeignClients
@SpringCloudApplication
public class SysBraceService {
	public static void main(String[] args) {
		SpringApplication.run(SysBraceService.class, args);
	}

}
