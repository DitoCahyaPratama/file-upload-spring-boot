package com.example.fileuploadspringboot;

import com.example.fileuploadspringboot.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})

public class FileUploadSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUploadSpringBootApplication.class, args);
	}

}
