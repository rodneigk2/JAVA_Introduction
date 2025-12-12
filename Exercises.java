// 1
// import java.util.Scanner;

// public class Exercises{

//     public static void main(String[] args){

//         Scanner input = new Scanner(System.in);

//         int first;
//         int second;
//         int result;

//         first = input.nextInt();
//         second = input.nextInt();
//         result = first + second;
        
//         System.out.printf("The sum between %d and %d = %d", first, second, result);
   
//         input .close();

//     }

// }


// 2
// import java.util.Locale;
// import java.util.Scanner;

// public class Exercises {

//     public static void main(String[]args){
//         Locale.setDefault(Locale.US);
//         Scanner input = new Scanner(System.in);

//         double radius;
//         double result;
//         double formula;
    
//         formula = 3.14159;
//         radius = input.nextDouble();
//         result = (radius * radius) * formula;
            
//         System.out.printf("%.4f = %.5f * %.1f²", result, formula, radius);

//         input.close();

//     }

// }


// 3

// import java.util.Scanner;

// public class Exercises{
//     public static void main(String[]args){
//         Scanner input = new Scanner(System.in);

//         int A;
//         int B;
//         int C;
//         int D;
//         int result;

//         A = input.nextInt();
//         B = input.nextInt();
//         C = input.nextInt();
//         D = input.nextInt();

//         result = A * B - C * D;

//         System.out.print(A + " * " + B + " - " + C + " * " + D + " = ");
//         System.out.println(result);

//         input.close();
//     }
// }


// 4
// import java.util.Locale;
// import java.util.Scanner;

// public class Exercises{
//     public static void main(String[]args){
//     Locale.setDefault(Locale.US);

//     Scanner input = new Scanner(System.in);

//     int number;
//     int hoursWage;
//     double hoursWorked;
//     double result;
        
//     number = input.nextInt();
//     hoursWage = input.nextInt();
//     hoursWorked = input.nextDouble();

//     result = hoursWorked * hoursWage;

//     System.out.println(number);
//     System.out.println(result);
//     System.out.println(" ");

//     input.close();
//     }
// }


// 5

// import java.util.Locale;
// import java.util.Scanner;

// public class Exercises{
//     public static void main(String[]args){
//     Locale.setDefault(Locale.US);
//     Scanner input = new Scanner(System.in);

//     int pNumber1;
//     int pQnt1;
//     double pValue1;
//     double result1;

//     int pNumber2;
//     int pQnt2;
//     double pValue2;
//     double result2;

//      pNumber1 = input.nextInt();
//      pQnt1 = input.nextInt();
//      pValue1 = input.nextDouble();
//      result1 = pQnt1 * pValue1;

//     pNumber2 = input.nextInt();
//     pQnt2 = input.nextInt();
//     pValue2 = input.nextDouble();
//     result2 = pValue2 * pQnt2;

//     double sum;
//     sum = result1 + result2;

//     System.out.println("THE 1º PRODUCT CODE: " + pNumber1);
//     System.out.println("THE 2º PRODUCT CODE: " + pNumber2);
//     System.out.printf("VALUE TO PAY: %.2f\n", sum);
    
//     input.close();
//     }
// }


// 6

// import java.util.Scanner;

// public class Exercises{
//     public static void main(String[]args){

//         Scanner input = new Scanner(System.in);

//         int number = input.nextInt();

//         if (number > 0){
//             System.out.println("POSITIVE NUMBER ");
//         }

//         else{
//             System.out.println("NEGATIVE NUMBER ");
//         }

//         input.close();
//     }
// }


//7

// import java.util.Scanner;

// public class Exercises{
//     public static void main(String[]args){

//         Scanner input = new Scanner(System.in);

//         int number = input.nextInt();

//         if (number % 2 == 0){
//             System.out.println("This number is even");
//         }
//         else{
//             System.out.println("This number is odd");
//         }

//         input.close();
//     }
// }


// 8

// import java.util.Scanner;

// public class Exercises{
//     public static void main(String[]args){

//         Scanner input = new Scanner(System.in);

//         int number1 = input.nextInt();
//         int number2 = input.nextInt();
//         int biggnum, minnum;

//         if (number1 > number2){
//             biggnum = number1;
//             minnum = number2;
//         }
//         else{
//             biggnum = number2;
//             minnum = number1;
//         }

//         if (biggnum % minnum == 0){
//             System.out.println("Those numbers are multiples BIGGER: " + biggnum + " SMALLER: " + minnum);
//         }
//         else {
//         System.out.println("Those numbers is not multiples BIGGER: " + biggnum + " SMALLER: " + minnum);
//         }

//         input.close();
//     }
// }


// 9

import java.util.Scanner;

public class Exercises{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int firstH = input.nextInt();
        int secondH = input.nextInt();
        int s;

        if (0 > firstH || firstH > 23 || 0 > secondH || secondH > 23){
            System.out.println("Time not accept. ");
        }
        else if (secondH > firstH){
            s = secondH - firstH ;
            System.out.println(s);
        }
        else if (firstH > secondH){
            s = (24 - firstH) + secondH;
            System.out.println(s);
        }
        else {
            s = 24;
            System.out.println(s);
        }     

        input.close();
    }
}