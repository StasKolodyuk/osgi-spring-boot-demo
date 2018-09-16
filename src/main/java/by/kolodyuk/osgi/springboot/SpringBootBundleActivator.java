package by.kolodyuk.osgi.springboot;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBundleActivator implements BundleActivator {

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        SpringApplication.run(SpringBootBundleActivator.class);
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {

    }
}
