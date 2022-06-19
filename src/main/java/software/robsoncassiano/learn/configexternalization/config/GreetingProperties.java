package software.robsoncassiano.learn.configexternalization.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

@ConfigurationProperties("greeting")
public record GreetingProperties(@DefaultValue("hello") String salutation) {
}

