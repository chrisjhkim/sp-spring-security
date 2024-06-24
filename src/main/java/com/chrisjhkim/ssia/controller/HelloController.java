package com.chrisjhkim.ssia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	/**
	 * spring 기동 시 나오는 로그 중에서 아래와 같은 부분 검색해서 사용
	 * Using generated security password: 64b35f69-4d1f-4e52-b427-090ed79e8365
	 * <p>
	 * curl -u user:64b35f69-4d1f-4e52-b427-090ed79e8365 http://localhost:8080/hello -v
	 * curl -u user:14d6cb12-0091-4466-90e8-242af8ddd2bc https://localhost:8080/hello -k
	 * <p>
	 *     -k option : 인증서 신뢰성 테스트 생략
	 *     -v option : curl 결과가 상세하게 보이게
	 * </p>
	 */
	@SuppressWarnings("JavadocLinkAsPlainText")
	@GetMapping("/hello")
	public String hello(){
		return "Hello";
	}
}
