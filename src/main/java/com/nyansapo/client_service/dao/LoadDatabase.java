package com.nyansapo.client_service.dao;

//importing necessary libraries

import com.nyansapo.client_service.models.Client;
import com.nyansapo.client_service.repository.ClientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ClientRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Client("john doe", "example@io.com", "123456")));
            log.info("Preloading " + repository.save(new Client("kofi mike", "test@io.com", "123456")));
        };
    }
}
