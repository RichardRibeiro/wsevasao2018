/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.LinkedList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author gilson
 */
@Path("aluno")
public class WSEvasao2018 {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public WSEvasao2018() {
    }

    /**
     * Retrieves representation of an instance of principal.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Aluno> retornaListaAlunosJson() {
        Aluno a1 = new Aluno();
        a1.setNome("Gilson");
        a1.setCpf("10");
        Aluno a2 = new Aluno();
        a2.setNome("Richard");
        a2.setCpf("11");
        
        List<Aluno> listAluno = new LinkedList();
        listAluno.add(a1);
        listAluno.add(a2);
        return listAluno;
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void recebeListaAlunosJson(List<Aluno> listAlunos) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        a1 = listAlunos.get(0);
        a2 = listAlunos.get(1);
        System.out.println(a1.getNome());
        System.out.println(a2.getNome());
    }
}
