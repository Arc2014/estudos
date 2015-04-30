package br.com.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Created by arcosta on 30/04/15.
 */
@Path(value = "/form")
public class FormService {

    @GET
    @Path(value = "/{param}")
    public Response getMessage(@PathParam(value="param") String message) {
        String output = "Jersey says " + message;
        return Response.status(200).entity(output).build();
    }
}

