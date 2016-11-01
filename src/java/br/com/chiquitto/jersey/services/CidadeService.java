package br.com.chiquitto.jersey.services;

import br.com.chiquitto.aula.jdbcescola.vo.Cidade;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cidade")
public class CidadeService {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Cidade listar() {
        return new Cidade();
    }
    
}
