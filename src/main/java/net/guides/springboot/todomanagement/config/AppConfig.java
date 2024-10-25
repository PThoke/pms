package net.guides.springboot.todomanagement.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@SpringBootConfiguration
@Configuration
public class AppConfig {
	
	@Bean
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate(HikariDataSource hikariDataSource) {
		return new NamedParameterJdbcTemplate(hikariDataSource);
	}

}
