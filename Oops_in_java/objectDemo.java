
class Calculator
{
    int a;
    public int performAdd(int n1, int n2)
    {
        int r = n1 + n2;
        System.out.println(" add");
        return r;

    }
}

public class objectDemo
 {
    public static void main(String[] args) 
    {
        // Create an object of the class
         
         int num1 = 2;
         int num2 = 5;

         Calculator Calc = new Calculator();
         
         int result = Calc.performAdd(num1, num2);

        //  int result = num1 + num2;

         System.out.println(result);
    }
         
 }