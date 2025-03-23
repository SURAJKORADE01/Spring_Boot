import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

// call by value 
// call by METHOD

public class MethodReference 
{
    public static void main(String arg[])
    {
        List<String> names = Arrays.asList("Suraj","Subhash","Korade","Rajashree","Shraddha");


        // This is by Consumer Object
        // Consumer<String> con = new Consumer<String>() 
        // {
        //     public void accept(String s)
        //     {
        //         System.out.println(s);
        //     }
        // };

        // This is called Lambda Expression
        // Consumer<String> con = s -> System.out.println(s); 

        // names.forEach(con);

        names.forEach(System.out :: println);
    }    
}