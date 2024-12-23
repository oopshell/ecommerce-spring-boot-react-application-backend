package me.tiantian_li.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "me.tiantian_li.ecommerce.model")
@EnableJpaRepositories(basePackages = "me.tiantian_li.ecommerce.repository")
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

}
