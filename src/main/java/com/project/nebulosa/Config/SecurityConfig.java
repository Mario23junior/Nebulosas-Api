package com.project.nebulosa.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.project.nebulosa.Service.ServiceBase.SecurityService;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
   
	@Autowired
	private SecurityService securityService;

 	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.
		   userDetailsService(securityService)
		   .passwordEncoder(passwordEncoder());
 	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web
		  .ignoring()
		  .antMatchers("/h2-console/**");
 	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		   .csrf().disable()
		   .authorizeRequests()
		    .antMatchers("/v1/api/nebulosa/**") 
		      .hasRole("ADMIN")
		    .antMatchers("/v1/api/fatosInformacao/**") 
		      .hasAnyRole("USER","ADMIN") 
		    .antMatchers("/v1/api/baseRelato/**") 
		      .hasAnyRole("USER","ADMIN")
		    .antMatchers("/v1/api/listall/**") 
		      .hasAnyRole("USER","ADMIN")
		    .antMatchers(HttpMethod.POST,"/v1/api/usuario/**")  
		      .permitAll()
		      .anyRequest().authenticated()
 		.and()
		    .httpBasic();
 	}
	
}
