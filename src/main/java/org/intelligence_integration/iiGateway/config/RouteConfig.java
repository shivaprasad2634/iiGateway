package org.intelligence_integration.iiGateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class RouteConfig {

    @Autowired
    private Environment env;

    @Bean
    public RouterFunction<ServerResponse> reRouteToMicroServices(){
        return RouterFunctions.route()
                .GET("/knowledge/**", HandlerFunctions.forward("lb://"+env.getProperty(CustomPropertyKeys.IIKnowledgebasePathPrefix)))
                .build();
    }
}
