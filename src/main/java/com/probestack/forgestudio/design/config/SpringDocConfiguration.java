package com.probestack.forgestudio.design.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "com.probestack.forgestudio.design.config.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Data Residency Guard")
                                .description("Data sovereignty and cross-border transfer enforcement for the ForgeSphere  platform. Ensures every byte of customer data stays within its legally  mandated geographic boundary. Blocks unauthorized cross-region movement,  enforces GDPR/Schrems II/DPDP/HIPAA/PIPL data residency rules, and generates  audit-grade compliance evidence for regulators and enterprise customers. ")
                                .contact(
                                        new Contact()
                                                .name("ForgeSphere Data Sovereignty Team")
                                                .email("data-sovereignty@forgesphere.example.com")
                                )
                                .version("1.0.0")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("bearerAuth", new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                                )
                )
        ;
    }
}
