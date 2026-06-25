// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
        //input
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        
        // System.out.println(x + "*" + "1" + "=" + x * 1);
        // System.out.println(x + "*" + "2" + "=" + x * 2);
        // System.out.println(x + "*" + "3" + "=" + x * 3);
        // System.out.println(x + "*" + "4" + "=" + x * 4);
        // System.out.println(x + "*" + "5" + "=" + x * 5);
        // System.out.println(x + "*" + "6" + "=" + x * 6);
        // System.out.println(x + "*" + "7" + "=" + x * 7);
        // System.out.println(x + "*" + "8" + "=" + x * 8);
        // System.out.println(x + "*" + "9" + "=" + x * 9);
        // System.out.println(x + "*" + "10" + "=" + x* 10);
        
    //    for (int i = 1; i <= 10; i++) {
    //        System.out.println(x + "*" + i + "=" + i * x);
    //    }

        // int age = sc.nextInt();
        // if(age > 18){
        //     System.out.println("adult");
        // }
        // else{
        //     System.out.println("not adult");
        // }

    //      int x = sc.nextInt();

    //     if ( x % 2 == 0){
    //          System.out.println("number is even");
    //     }
    //     else {
    //         System.out.println("number is odd");
    //     }

    // int a = sc.nextInt();
    // int b = sc.nextInt();

    // if(a == b){
    //     System.out.println("a is equal");
    // }
    // else if (a > b)
    // {
    //     System.out.println("a is greater");
    // }
    // else
    // {
    //     System.out.println("a is lesser");
    // }

    // int btn = sc.nextInt();

    // if(btn == 1) {
    //     System.out.println("hello");
    // }
    // else if(btn == 2){
    //     System.out.println("namaste");
    // }
    // else if(btn == 3){
    //     System.out.println("bonjour");
    // }
    // else{
    //     System.out.println("bye");
    // }

    // int button = sc.nextInt();
    // switch(button) {
    //     case 1: System.out.println("hello");
    //     break;
    //     case 2: System.out.println("namaste");
    //     break;
    //     case 3: System.out.println("bonjour");
    //     break;
    //     default: System.out.println("invalid");
    // }

//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int operator = sc.nextInt();
    
//     switch(operator){
    
    
//     case 1: System.out.println(a+b);
//     break;

   
//     case 2:System.out.println(a - b);
//     break;

    
//     case 3:System.out.println( a * b);
//     break;

//     case 4: if(b == 0){
//              System.out.println("invalid division");
//     }else{
//     System.out.println(a / b);
//     }
//     break;

//     case 5: if(b == 0){
//         System.out.println("invalid division");
//     }else{
//     System.out.println(a % b);
//     }
//     break;
  
//     default: {
//     System.out.println("invalid operator");
//     }
//   }


// Scanner sc = new Scanner(System.in);
// int mn = sc.nextInt();

// switch(mn){

//     case 1: 
//     System.out.println("january");
//     break;

//     case 2:
//         System.out.println("february");
//         break;

//     case 3:
//         System.out.println("march");
//         break;

//     case 4:
//         System.out.println("april");
//         break;

//     case 5:
//         System.out.println("may");
//         break;

//     case 6:
//         System.out.println("june");
//         break;

//     case 7:
//         System.out.println("july");
//         break;

//     case 8:
//         System.out.println("august");
//         break;

//     case 9:
//         System.out.println("september");
//         break;

//     case 10:
//         System.out.println("october");
//         break;

//     case 11:
//         System.out.println("november");
//         break;

//     case 12:
//         System.out.println("december");
//         break;

//     default:
//         System.out.println("invalid month");

// }

// for(int i=0; i<=10; i++){
//       System.out.println("hello world");

// }

// for (int i=0; i<=10;i++){
//     System.out.println(i);
// }

// int i=0;
// while(i<11){
//     System.out.println(i);
//     i++;
// }

// int i=0;
// do { 
//     System.out.println(i);
//     i++;
// } while (i<11);


// int i=12;
// while(i<11){
//     System.out.println("hello");
// }
// do { 
//     System.out.println("hello");
// } while (i<11);

// print n natural number

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// for (int i=1; i<=n; i++){
//     if(i % 2 == 0){
//         System.out.println(i);
//     }
// }

// for(int i=1;i<=10;i++) {
//     System.out.println(n + "*" + i + "=" + i*n);
// }

// for (; ;){
//     System.out.println("hello");
// }

// Scanner sc = new Scanner(System.in);
// int input;

// do {

//     int marks = sc.nextInt();
//         if(marks >=90){
//             System.out.println("This is good");
//         }
//         else if(marks >= 60){
//             System.out.println("This is also Good");
//         }
//         else if(marks >=0){
//             System.out.println("This is Good as well");
//         }
//         else{
//             System.out.println("nothing to print");
//         }
//         break;

   
//          System.out.println("STOP");
//         input = sc.nextInt();


// }while(input == 1);



//  Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         boolean isPrime = true;
//         for(int i=2; i<n/2; i++){
//             if(n % i == 0){
//                 isPrime = false;
//                 break;
//             }
//         }
//        if(isPrime){
//         if(n == 1){
//             System.out.println("this is neither prime not composite");
//         }
//         else{
//             System.out.println("this is a prime number");
//         }
//        }
//         else{
//             System.out.print("this is not a prime number");
//         }




//        }
//     }



