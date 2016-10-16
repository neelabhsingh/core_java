package commandline;

/**
 * Created by neelabhsingh on 09/10/16.
 */
public class CommnadLineDemo {
    public static void main(String [] args){
        for(String s: args){
            System.out.print("Arguments "+ s );
        }
    }
}
