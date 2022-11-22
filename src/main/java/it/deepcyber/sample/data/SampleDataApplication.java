package it.deepcyber.sample.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan("it.deepcyber.sample.data.entities")
@EnableJpaRepositories("it.deepcyber.sample.data.repositories")
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class SampleDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleDataApplication.class, args);
	}
	
}
