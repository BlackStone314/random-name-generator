package org.acme.quickstart;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Random;

@Path("/randomname")
public class GreetingResource {
    Random intGenerator = new Random();

    //Arrays of popular/well known names in the US
    String[] firstNameList = {"Emma", "Olivia", "Ava", "Isabella", "Sophia", "Liam", "Noah", "Benjamin", "Logan", "Lucas"};
    String[] lastNameList = {"Smith", "Johnson", "Jackson", "Taylor", "Brown", "Jones", "Miller", "Melville", "Eliot", "Davis"};

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String nameGenerator()
    {
        //Generates random number between 0 and 9
        int randomInt_f = intGenerator.nextInt(10);
        int randomInt_l = intGenerator.nextInt(10);
        //Setting a random first name and last name
        String firstName = firstNameList[randomInt_f];
        String lastName = lastNameList[randomInt_l];
        return firstName + " " + lastName;
    }
}