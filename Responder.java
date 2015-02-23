import java.util.Random;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random rnd;
    private  ArrayList<String> a;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        this.rnd=new Random();
        this.a= new ArrayList<>();
        a.add("That sounds interesting. Tell me more...");
        a.add("Tell me more...");
        a.add("incredible i need more information");
        a.add("it´s not good");
        a.add("such a pity");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int num= (rnd.nextInt(5));
       String answer=(a.get(num));
        return answer;
    }
    
    
}
