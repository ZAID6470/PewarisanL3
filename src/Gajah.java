public class Gajah extends Hewan
{
    public static void testClassMethod()
    {
        System.out.println("The class method in hewan");
    }
    
    public void testInstanceMethod
    {
        System.out.println("The class method in hewan");
    }
    public static void main(String[] args)
    {
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah();
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}