package br.com.jpss;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import br.com.jpss.services.PersonService;

@Component
public class JerseyConfig extends ResourceConfig{
	
	public JerseyConfig() {
		register(PersonService.class);
	}

}
