import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
//cualquier clase que se pueda recorrer con iterador se puede recorer con for-each
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
    private HashSet<String> faq;
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
       
       this.faq=new HashSet<>();
       faq.add("free app");
       faq.add("problem linux crash");
       faq.add("coche");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> question)
    {
        String answer= null;
        boolean exist=false;
       
        String find=null;
        int cont=0;
        
          for(String ans: question)
          {
            
            if(find == null && (answers.containsKey(ans)))
            {
                find = answers.get(question);
                exist=true;
            }
          }
          
          if(exist == true)
          {
                      
               answer= answers.get(question);        
               exist=true;
          }
          else
          {
            
            int num = (rnd.nextInt(5));
            answer=(a.get(num));
             
          }
         
        
        return answer;
    }
    
    
}
