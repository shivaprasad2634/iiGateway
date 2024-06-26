package org.intelligence_integration.iiGateway.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:iiConfig.properties")
@Getter
public class CustomPropertyKeys {

    public static final String IIKnowledgebasePathPrefix = "path.prefix.iiknowledgebase";

}
