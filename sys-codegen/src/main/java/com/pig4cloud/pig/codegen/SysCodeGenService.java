package com.pig4cloud.pig.codegen;

import com.pig4cloud.pig.common.security.annotation.EnablePigFeignClients;
import com.pig4cloud.pig.common.security.annotation.EnablePigResourceServer;
import com.pig4cloud.pigx.common.swagger.annotation.EnablePigSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author 颜金星
 * @date 2020/3/13
 * 代码生成模块
 */
@EnablePigSwagger2
@EnablePigFeignClients
@EnablePigResourceServer
@SpringCloudApplication
public class SysCodeGenService {

	public static void main(String[] args) {
		SpringApplication.run(SysCodeGenService.class, args);
	}
}
