package com.mysite.sbb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 모든 프로그램에는 시작을 담당하는 파일이 있다.
// '프로젝트명 + Application.java'.
// 스프링 부트에서는 아래와 같은 어노테이션을 활용할 수 있다.
@SpringBootApplication
public class SbbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbbApplication.class, args);
	}

}
