public class LambdaExpression 
{
    public static void main(String arg[])
    {
        // A obj = new Xyz();
        // obj.show();

        A obj; 
        // = new A() {
        //     public void show()
        //     {
        //         System.out.println("Hello...");
        //     }
        // };
        
        // This is called Lmabda Expression
        obj = (int i) -> 
        {
            System.out.println("Mobile: " + i);
        };

        obj.show(11);
    }    
}

interface A 
{
    void show(int iValue);
}

// class Xyz implements A
// {
//     public void show()
//     {
//         System.out.println("Hello...");
//     }
// }