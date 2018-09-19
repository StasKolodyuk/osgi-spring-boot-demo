package by.kolodyuk.osgi.springboot;

import by.kolodyuk.osgi.springboot.controller.SimpleController;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;
import org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

// @Import(EmbeddedServletContainerAutoConfiguration.EmbeddedTomcat.class)
@Import(SimpleController.class)
@SpringBootApplication(exclude = {SpringDataWebAutoConfiguration.class, SecurityAutoConfiguration.class, TransactionAutoConfiguration.class})
public class SpringBootBundleActivator implements BundleActivator {

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());
        SpringApplication.run(SpringBootBundleActivator.class);
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {

    }
}
