import java.util.Scanner;
class CalculateG {
    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        int fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity;
        double initialPosition = 0.0;
        double finalPosition;
// Add the formulas for position and velocity
        finalVelocity = ((gravity * fallingTime) + initialVelocity) / fallingTime;
        finalPosition = 0.5 * gravity * fallingTime + initialVelocity * finalVelocity + initialPosition;
        System.out.println("The object's position after " + fallingTime + " seconds is "
                + finalPosition + " m/s");
// Add output line for velocity (similar to position)
        System.out.println("The object's velocity after" + fallingTime + "second is" + finalVelocity + " m/s");
multi();
SQ();
sum();
    }

    public static void multi() {
        int num1;
        int num2;
        int multiplication;
        Scanner multi = new Scanner(System.in);
        System.out.println("Enter first Number");
        num1 = multi.nextInt();
        System.out.println("Enter Second Number");
        num2 = multi.nextInt();
        multiplication = num1 * num2;
        System.out.println("Multiplication is: " + multiplication);
    }
public static void SQ(){
        int num1;
        int num2;
        int square;
        Scanner SQ= new Scanner(System.in);
    System.out.println(" First number:");
    num1 = SQ.nextInt();
    System.out.println("Second number");
    square=num1*num1;
    System.out.println("the square is: " + square);
    }
    public static void sum(){
        int number1;
        int number2;
        int sum;
        Scanner Sum=new Scanner(System.in);
        System.out.println(" First number:");
        number1=Sum.nextInt();
        System.out.println(" Second number:");
        number2=Sum.nextInt();
        sum=number1+number2;
        System.out.println("the sum is: " + sum);
    }
    }




