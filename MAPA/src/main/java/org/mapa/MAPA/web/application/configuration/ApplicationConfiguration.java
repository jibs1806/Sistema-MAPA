package org.mapa.MAPA.web.application.configuration;

import org.mapa.MAPA.persistence.repositories.surgery.CentreRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@Configuration
@EnableJpaRepositories(basePackages = "org.mapa.MAPA.persistence.repositories")
@EntityScan(basePackages = {"org.mapa.MAPA.domain", "org.mapa.MAPA.persistence.PKClasses"})
@ComponentScan(basePackages =
    {
        "org.mapa.MAPA.persistence.repositories",
        "org.mapa.MAPA.web.controllers", "org.mapa.MAPA.services"
    })
public class ApplicationConfiguration {

}
