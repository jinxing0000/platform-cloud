/*
 *  Copyright (c) 2019-2020, 冷冷 (wangiegie@gmail.com).
 *  <p>
 *  Licensed under the GNU Lesser General Public License 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  <p>
 * https://www.gnu.org/licenses/lgpl.html
 *  <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pig4cloud.pig.common.core.constant;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * @author lengleng
 * @date 2018年06月22日16:41:01
 * 服务名称
 */
public interface ServiceNameConstants {
	/**
	 * 认证服务的SERVICEID
	 */
	String AUTH_SERVICE = "sys-auth";

	/**
	 * UMPS模块
	 */
	String UMPS_SERVICE = "sys-brace-service";


	public static void main(String[] args) {
		BasicTextEncryptor encryptor = new BasicTextEncryptor();
		encryptor.setPassword("pig");
		// encrypt root
//		System.out.println(encryptor.encrypt("root"));
//		System.out.println(encryptor.encrypt("root"));
//		System.out.println(encryptor.encrypt("root"));
		// decrypt, the result is root
//		System.out.println(encryptor.decrypt("UP/yojB7ie3apnh3mLTU7w=="));
//		System.out.println(encryptor.decrypt("ik9FE3GiYLiHwchiyHg9QQ=="));
		System.out.println(encryptor.decrypt("8Hk2ILNJM8UTOuW/Xi75qg=="));
	}

}
