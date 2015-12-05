package org.nioto.demo.microservices;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/icu4j")
public class ICU4JApplication extends Application {
  public ICU4JApplication() {
  }
}