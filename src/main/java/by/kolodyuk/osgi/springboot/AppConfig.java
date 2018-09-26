package by.kolodyuk.osgi.springboot;

import by.kolodyuk.osgi.springboot.controller.ControllerConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ControllerConfig.class)
public class AppConfig {

}
