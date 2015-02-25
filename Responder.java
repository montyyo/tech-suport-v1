import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
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
    private HashMap<String,String> answers;
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
         
         
       this.answers = new HashMap<>();
       answers.put("hello" , "hi good day");
       answers.put( "question" ,  " have you got any question?");
       answers.put( "answer" ,  " i think you need more help ");
       answers.put( "bye" ,  " don´t have nay questions?");
       answers.put( "thank´s" ,  " you are welcome");
       
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String question)
    {
        String answer= null;
        
        if(answers.containsKey(question) == true)
        {
                      
               answer= answers.get(question);        
            
        }
        else
        {
            
            int num = (rnd.nextInt(5));
            answer=(a.get(num));
             
        }
        return answer;
    }
    
    
}
