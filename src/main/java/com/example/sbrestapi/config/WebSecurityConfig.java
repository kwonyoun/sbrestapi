// package com.example.sbrestapi.config;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
// // import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.web.SecurityFilterChain;

// import jakarta.servlet.DispatcherType;

// @Configuration
// @EnableWebSecurity
// public class WebSecurityConfig{

// 	private final Logger log = LoggerFactory.getLogger(getClass());

// 	@Bean
// 	public PasswordEncoder getPasswordEncoder() {
// 		return new BCryptPasswordEncoder();
// 	}

// 	@Bean
// 	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
// 			// 인증 거부 관련 처리
// 			http.csrf(csrf -> csrf 
// 					.disable()
					
// 			);

// 			http.authorizeHttpRequests(request -> request
//                         .dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
//                         .dispatcherTypeMatchers(DispatcherType.INCLUDE).permitAll() //header,footer include하기
//                         // .requestMatchers(new AntPathRequestMatcher("/order")).hasAnyRole("USER")
//                         .requestMatchers("/home").permitAll()
//                         .anyRequest().authenticated()	// 어떠한 요청이라도 인증필요
// 			);

// 			http.formLogin(login -> login
//                 .loginPage("/")	// [A] 커스텀 로그인 페이지 지정
//                 .failureUrl("/test") // 로그인 실패 후 이동 페이지
//                 .loginProcessingUrl("/login-process")	// [B] submit 받을 url
//                 .usernameParameter("memId")	// [C] submit할 아이디
//                 .passwordParameter("memPw")	// [D] submit할 비밀번호
//                 .defaultSuccessUrl("/", true)
//                 .permitAll()
// 			);

// 			return http.build();

// 	}
// }