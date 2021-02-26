package org.ecc.configurations;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private DataSource dataSource;
	
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
		 
		 http.csrf().disable(); //disable spring security default login page
		 
		 http.authorizeRequests().anyRequest().permitAll();
	 }
	 
	 
	/*
	 * public void addResourceHandlers(ResourceHandlerRegistry registry) { if
	 * (!registry.hasMappingForPattern("/fonts/**")) {
	 * registry.addResourceHandler("/fonts/**") .addResourceLocations(
	 * "classpath:/META-INF/resources/webjars/bootstrap-glyphicons/bdd2cbfba0/fonts/"
	 * ); } }
	 */
}
