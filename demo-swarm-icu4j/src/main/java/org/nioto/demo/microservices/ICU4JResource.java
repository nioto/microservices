package org.nioto.demo.microservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import java.util.Locale;

import com.ibm.icu.text.RuleBasedNumberFormat;

@Path("/spellout")
public class ICU4JResource {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String convert(@QueryParam("input") Integer value, @QueryParam("locale") String loc) {
    Locale locale = Locale.US;
    if ( loc != null && loc.length()>0){
      String[] tmp =loc.split( "_" );
      if( tmp[1] !=null) {
        locale = new Locale(tmp[0], tmp[1]);
      } else{
        locale = new Locale(tmp[0]);
      }
    }
    RuleBasedNumberFormat formatter = new RuleBasedNumberFormat( locale, 
        RuleBasedNumberFormat.SPELLOUT);
    
    String result = formatter.format(value);
    return result;
  }
}