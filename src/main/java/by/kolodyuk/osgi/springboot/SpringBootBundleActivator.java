package by.kolodyuk.osgi.springboot;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@Import(AppConfig.class)
@SpringBootConfiguration
@EnableAutoConfiguration
public class SpringBootBundleActivator implements BundleActivator {

    ConfigurableApplicationContext appContext;

    @Override
    public void start(BundleContext bundleContext) {
        Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());
        appContext = SpringApplication.run(SpringBootBundleActivator.class);
    }

    @Override
    public void stop(BundleContext bundleContext) {
        SpringApplication.exit(appContext, () -> 0);
    }
}
