package org.acme;

import java.util.List;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.MediaType;

@Path("/all")
public class PersonAPI {

@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Person> all() {
        System.out.println("REST says: ");
        return Person.listAll();
}

@Transactional
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public Response newPerson(Person person) {
    person.id = null;
    person.persist();
    return Response.status(Status.CREATED).entity(person).build();
}


}
