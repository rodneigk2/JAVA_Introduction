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