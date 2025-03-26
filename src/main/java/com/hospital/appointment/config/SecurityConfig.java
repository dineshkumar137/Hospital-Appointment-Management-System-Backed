package com.hospital.appointment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/", "/login", "/default-ui.css").permitAll() // Allow login page & CSS
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginPage("/login")  // Custom login page
                .permitAll()
            )
            .logout(logout -> logout
                .logoutUrl("/logout")
                .permitAll()
            )
            .csrf(csrf -> csrf.disable());  // TEMPORARY: Disable CSRF for testing

        return http.build();
    }
}