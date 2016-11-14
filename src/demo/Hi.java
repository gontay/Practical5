package demo;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 * Created by 153085T on 11/14/2016.
 */
@Path("/hi")
public class Hi {
    @GET
    @Produces(MediaType.TEXT_XML)
    public String getMessage(){
        return "<hi>Hi World!</hi>";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getPlainMessage() {
        return "Hi World!";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHTMLMessage() {
        return "<b>Hi World!</b>";
    }
}
