package com.ssh.ssh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SshApplication {

	public static void main(String[] args) {
		SpringApplication.run(SshApplication.class, args);
	}
}
