package com.ppzeff.dehssisfs;

import com.ppzeff.dehssisfs.LOTO.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class DehssisfsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DehssisfsApplication.class, args);
	}

}
