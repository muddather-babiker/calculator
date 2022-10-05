import java.util.Scanner;;
public class App{
    static final Scanner inputscanner = new Scanner(System.in) ;
    private static String getString(String prompt) {
        System.out.println(prompt);
        String inputstr= inputscanner.nextLine();
        return(inputstr) ;
    }
    private static double getDouble(String promptd) {
        System.out.println(promptd);
        double inputdouble = inputscanner.nextDouble();
        return(inputdouble);
    }
    public static void main(String []args) {
        Calculator cal= new Calculator();
        cal.add(5.0,3.0);
        String promptmsg="Enter Your Name";
        String prompdtmsg="Enter Your number";
   System.out.println("your name is :" + getString(promptmsg));
   System.out.println("your name is :" + getDouble(prompdtmsg));


     }
}