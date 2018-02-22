/**
 * This is a service class to facilitate imports to Neo4j spatial
 */
package org.neo4j.extensions.spatial.services;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.neo4j.string.UTF8;

@Path("/import")
public class ImporterService
{
  @GET
  @Path("/hello")
  public Response hello()
  {
    return Response.status(Status.OK).entity(UTF8.encode("Hello World")).build();
  } // hello
} // class
