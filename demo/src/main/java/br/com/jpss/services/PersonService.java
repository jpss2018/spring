package br.com.jpss.services;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("people")
@Produces(MediaType.APPLICATION_JSON)
public interface PersonService {	
	@POST
	public Response create(String body);
	
	@PUT
	@Path("/{id}")
	public Response update(@PathParam("id") Long id, String body);
	
	@GET
	@Path("/{id}")
	public Response find(@PathParam("id") Long id);
	
	@GET	
	public Response list(@QueryParam("name") String name);
	
	@DELETE
	@Path("/{id}")
	public Response delete(Long id);
}