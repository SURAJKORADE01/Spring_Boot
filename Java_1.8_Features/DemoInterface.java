class DemoInterface 
{
    public static void main(String arg[])
    {
        Phone aobj = new Android();
        aobj.call();
        aobj.message();
    }
}

interface Phone
{
    void call();
    
    default void message()
    {
        System.out.println("Message is defined successfully...");
    }
}

class Android implements Phone
{
    public void call()
    {
        System.out.println("Calling...");
    }
}