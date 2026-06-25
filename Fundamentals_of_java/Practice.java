// import java.util.Scanner;

// public class practice {
    

   //PRINT AVERAGE
    // public static double printAverage(int a , int b , int c){
    //      return a + b + c / 3.0;
        
    // }
  
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int c = sc.nextInt();

    //     double avg = printAverage(a,b,c);
    //     System.out.println(avg);
    // }

//SUM OF ALL ODD NUMBERS FROM 1 TO N
import java.util.Scanner;

public class practice {

public static int sumofOdd(int n){
      
    int sum = 0;

    for(int i=1; i<=n; i++){
         if(i % 2 != 0){
            sum += i ;
      }   
}
return sum;
}
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

     System.out.println("Sum of all odd number : " + sumofOdd(n));

     }

 }
