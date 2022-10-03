package br.com.darthlogus.tacocloud.service;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.com.darthlogus.tacocloud.model.User;
import br.com.darthlogus.tacocloud.repository.UserRepository;

public class UserDetailsServiceImpl {

    @Bean
    public UserDetailsService userDetailsService(UserRepository userRepo) {
        return username -> {
            User user = userRepo.findByUsername(username);
            if (user != null)
                return user;

            throw new UsernameNotFoundException("User '" + username + "' not found");
        };
    }

}
