package com.sportyshoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.sportyshoes.service.AppUserDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
    private UserDetailsService userDetailsService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.
			csrf().disable()
			.authorizeRequests().antMatchers("/login").permitAll()
			.anyRequest().authenticated()
			.and()
			.formLogin()
			.loginPage("/login").permitAll()
			.and()
			.logout().invalidateHttpSession(true)
			.clearAuthentication(true)
			.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
			.logoutSuccessUrl("/login").permitAll();
	}
	
	
	
	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return provider;
	}
	
	
//	@Bean
//	@Override
//	public UserDetailsService userDetailsService() {
//		List<UserDetails> users = new ArrayList<>();
//		users.add(User.withDefaultPasswordEncoder().username("sonali").password("1234").roles("USER").build());
//		
//		return new InMemoryUserDetailsManager(users);
//	}
// 
//
//	@Bean
//	@Override
//	public UserDetailsService userDetailsService() {
//		UserDetails user = User.
//			 withDefaultPasswordEncoder()
//				.username("user")
//				.password("password")
//				.roles("ADMIN")
//				.build();
//
//		return new InMemoryUserDetailsManager(user);
//	}
	
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
////		http.authorizeRequests()
//////			 antMatchers("/", "/home").permitAll().anyRequest()
////			.antMatchers("/*").permitAll().anyRequest()
////			 .authenticated().and().formLogin()
////			 .loginPage("/login").permitAll().and().logout().permitAll();
//		http.csrf().ignoringAntMatchers("/nocsrf","/ignore/startswith/**");
//
//	}

//	@Bean
//	@Override
//	public UserDetailsService userDetailsService() {
//		UserDetails user = User.
//			 withDefaultPasswordEncoder()
//				.username("user")
//				.password("password")
//				.roles("ADMIN")
//				.build();
//
//		return new InMemoryUserDetailsManager(user);
//	}
}