package com.digital.processorderservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
//    @Bean
//    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests((authorize) ->
//                authorize.anyRequest().authenticated())
////        http.authorizeRequests()
////                .antMatchers("/my-anon-page").permitAll()
////                .anyRequest().authenticated()
////                .and().oauth2Client()
////                .and().oauth2Login();
//        return http.build();
//    }
}
