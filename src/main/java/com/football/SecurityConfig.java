package com.football;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.football.service.AuthenticationService;

@Configuration
//@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private AuthenticationService authenticationService;
	@Autowired
	private PasswordEncoder passwordEncoder;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	http.csrf().disable();
        http.authorizeRequests()
	        	.antMatchers("/login/login.jsp").permitAll()
	        	.anyRequest().authenticated()
	        	.and()
        	.formLogin()
	            .loginPage("/login/login.jsp")
	            .loginProcessingUrl("/login")
	            .failureUrl("/login/login.jsp?error")
	            .permitAll()
	        .and()
				.logout().logoutSuccessUrl("/login/login.jsp?logout"); 
    }
    
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    	auth
          .inMemoryAuthentication()
              .withUser("user").password("password").roles("ADMIN");
        auth.userDetailsService(authenticationService).passwordEncoder(passwordEncoder);
    }
}
