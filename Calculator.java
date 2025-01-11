import java.util.Stack;
import java.util.Scanner;

public class CALCULATOR {

    public static double summation(double a, double b) {
        return a + b;
    }

    public static double substraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b)
    {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

        public static void main(String[] args) {

        new frame();

        Stack<Double> stack = new Stack<>();
        Scanner input = new Scanner(System.in);


        while (true) {

           if (stack.empty() == true) {


               double DoubleInput1 = input.nextDouble();
               stack.push(DoubleInput1);
               String StringOperator = input.next();
               if (StringOperator.equals("=")) {
                   System.out.println(stack.peek());
                   continue;
               }

               double DoubleInput2 = input.nextDouble();

               switch (StringOperator){
                   case("+"):
                       stack.push(summation(stack.peek(), DoubleInput2));
                       break;
                   case("-"):
                       stack.push(substraction(stack.peek(),DoubleInput2));
                       break;
                   case("*"):
                       stack.push(multiplication(stack.peek(), DoubleInput2));
                       break;
                   case("/"):
                       if (DoubleInput2 != 0) {
                           stack.push(division(stack.peek(), DoubleInput2));

                       } else {
                           System.out.println("Denominator Can't Be 0!");
                           double DoubleInput3 = input.nextDouble();
                           if (DoubleInput3 != 0) {
                               stack.push(division(stack.peek(), DoubleInput3));
                           }
                       }
                       break;
               }
           }
                String UserInput = input.next();
                switch(UserInput) {
                    case ("+"):
                        double c = input.nextDouble();
                        stack.push(stack.peek() + c);
                        break;
                    case ("-"):
                        double d = input.nextDouble();
                        stack.push(stack.peek() - d);
                        break;
                    case ("*"):
                        double e = input.nextDouble();
                        stack.push(stack.peek() * e);
                        break;
                    case ("/"):
                        double f = input.nextDouble();
                        if (f != 0) {
                            stack.push(stack.peek() / f);
                        } else {
                            System.out.println("Denominator Can't Be 0!");
                            double DoubleInput4 = input.nextDouble();
                            if (DoubleInput4 != 0) {
                                stack.push(division(stack.peek(), DoubleInput4));
                            }
                        }
                        break;
                    case ("="):
                        System.out.println(stack.peek());
                        break;
                    default:
                            stack.clear();
                            double DoubleUserInput = Double.parseDouble(UserInput);
                            stack.push(DoubleUserInput);
                            continue;

                }
                continue;


        }
    }
}
