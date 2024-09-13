package com.programming.techie.discoveryserver;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.Customizer;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // CSRF'yi devre dışı bırakıyoruz
            .authorizeHttpRequests(auth -> auth
                .anyRequest().authenticated() // Tüm isteklerin doğrulanmasını sağlıyoruz
            )
            .httpBasic(Customizer.withDefaults()); // Varsayılan HTTP Basic kimlik doğrulaması

        return http.build();
    }
}
