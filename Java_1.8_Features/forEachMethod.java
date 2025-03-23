import java.util.Arrays;
import java.util.List;

public class forEachMethod 
{
    public static void main(String arg[])
    {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // External Loop
        // for(int iCnt = 0; iCnt < values.size(); iCnt++)
        // {
        //     System.out.println(values.get(iCnt));
        // }

        // for(int iCnt : values)
        // {
        //     System.out.println(iCnt);
        // }

        // Internal Loop -> more faster than normal for loop

        values.forEach(i -> System.out.println(i));
    }    
}