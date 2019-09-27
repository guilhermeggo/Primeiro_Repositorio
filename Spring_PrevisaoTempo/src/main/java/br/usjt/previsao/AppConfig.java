package br.usjt.previsao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.usjt.previsao.interceptor.LoginInterceptor;
import br.usjt.previsao.model.Local;

@Configuration
public class AppConfig implements WebMvcConfigurer {
	@Bean
	public Local getLocal() {
		return new Local();
	}
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor()).
		addPathPatterns("/**").
		excludePathPatterns("/login", "/", "/fazerLogin");
	}
}
