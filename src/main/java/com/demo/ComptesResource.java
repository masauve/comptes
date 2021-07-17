package com.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import io.smallrye.mutiny.Uni;


@Path("/compte")
public class ComptesResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String desactivation() {
        Comptes compte = new Comptes("msauve","Martin Sauve","msauve@redhat.com","equipe");
        Uni.createFrom().item(compte.toJSON())
        .subscribe().with(
            item -> System.out.println(item));
        return ("done");
    }
}