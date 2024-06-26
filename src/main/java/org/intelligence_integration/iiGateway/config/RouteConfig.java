package org.intelligence_integration.iiGateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class RouteConfig {

    @Autowired
    private Environment env;

    @Bean
    public RouteLocator reRouteToMicroServices(RouteLocatorBuilder builder){

        return builder.routes()
                        .route("KnowledgeBase Routing",r->
                            r.path("/**").uri("lb://"+env.getProperty(CustomPropertyKeys.IIKnowledgebasePathPrefix))
                        )
                .build();

    }
}
