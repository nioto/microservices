package org.nioto.demo.microservices;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class DemoApplication extends Application {
    public DemoApplication() {
    }
}