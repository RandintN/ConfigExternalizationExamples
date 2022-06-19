package software.robsoncassiano.learn.configexternalization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import software.robsoncassiano.learn.configexternalization.config.GreetingProperties;

@SpringBootApplication
@EnableConfigurationProperties(GreetingProperties.class)
public class ConfigExternalizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigExternalizationApplication.class, args);
    }

}
