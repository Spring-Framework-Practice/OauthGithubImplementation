package com.zubair.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class OauthGithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthGithubApplication.class, args);
	}

}
