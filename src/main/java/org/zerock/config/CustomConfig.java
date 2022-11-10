package org.zerock.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

@Configuration
@ImportResource("/WEB-INF/spring/root-context.xml")
public class CustomConfig {

	@Bean
	public S3Client s3Client() {
		return S3Client.builder().region(Region.AP_NORTHEAST_2).build();
	}
}
