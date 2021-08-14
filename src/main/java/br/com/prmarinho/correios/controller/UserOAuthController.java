package br.com.prmarinho.correios.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserOAuthController extends WebSecurityConfigurerAdapter {

	@GetMapping("/user")
	public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
		
		
		Map<String, Object> propeties = new HashMap<String, Object>();
		propeties.put("name", principal.getAttribute("name"));
		propeties.put("avatar", principal.getAttribute("avatar_url"));
		
//		return Collections.singletonMap("name", principal.getAttribute("name"));
		return propeties;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// @formatter:off
		http.authorizeRequests(
				a -> a.antMatchers("/", "/error", "/**").permitAll().anyRequest().authenticated())
				.logout(l -> l.logoutSuccessUrl("/").permitAll())
				.csrf(c -> c.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()))
				.exceptionHandling(e -> e.authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED)))
				.oauth2Login();
		// @formatter:on
	}

	
}
