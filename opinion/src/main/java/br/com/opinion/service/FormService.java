package br.com.opinion.service;

import br.com.opinion.model.Curso;
import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;

/**
 * Created by arcosta on 30/04/15.
 */
@Path("/form")
public class FormService {

    @GET
    @Path("/{param}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCurso(@PathParam(value="param") String nome) {
        Curso curso = new Curso(nome, "Primeiro curso criado", new Date());
        return Response.status(Response.Status.OK).entity(new Gson().toJson(curso)).build();
    }
}

