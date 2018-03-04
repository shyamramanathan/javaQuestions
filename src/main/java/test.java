import java.util.Date;

public class test {
    public static void method(){
        System.out.println("Static before main");
    }
    public static void main(String args[]){
        method1();
        {
            System.out.println("First block without anything");
        }
        {
            System.out.println("Second block without anything");
        }
        {
            System.out.println("Fifth block without anything");
        }
        {
            System.out.println("Third block without anything");
        }
        test test = new test();
        test.normalMethod();
        method();
        System.out.println("Second object being created");
        test test1 = new test("Hello World");
        Date date;
        date = new Date();
        System.out.println(date);
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        String c = "animals";
        System.out.println(c.substring(0,1));           // Displays a
        System.out.println(c.substring(0,2));           // Displays an
        System.out.println(c.substring(0,3));           // Displays ani
        System.out.println(c.substring(0,4));           // Displays anim
        System.out.println(c.substring(0,5));           // Displays anima
        System.out.println(c.substring(0,6));           // Displays animal
        System.out.println(c.substring(0,7));           // Displays animals
        String[] stringArray = {"Hello World", "Java World", "Work World"};
    }
    {
        System.out.println("Without anything");
    }
    public static void method1(){
        System.out.println("Static after main");
    }
    public void normalMethod(){
        System.out.println("Normal Method");
    }
    public test(String a){
        System.out.println(a);
    }

    public test(){
        System.out.println("Test Constructor");
    }
    {
        System.out.println("Without anything2");
    }
}
