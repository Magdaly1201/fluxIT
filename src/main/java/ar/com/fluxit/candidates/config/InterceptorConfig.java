package ar.com.fluxit.candidates.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import ar.com.fluxit.candidates.interceptor.Interceptor;


@Configuration
public class InterceptorConfig extends WebMvcConfigurationSupport {

	@Bean
	public Interceptor defaultInterceptor() {
		return new Interceptor();
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedMethods("*").allowedOrigins("*").allowCredentials(true);
	}

}
