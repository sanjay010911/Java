import java.io.*;
class Rectangle {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Member function to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }
}

class PrimeChecker {
    // Function to check whether a number is prime or not
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
class PrimeOrNot {
    public static void main(String[] args) {
        DataInputStream in=new DataInputStream(System.in);
        try{
        System.out.println("Enter the length and breadth");
        int l=Integer.parseInt(in.readLine());
        int b=Integer.parseInt(in.readLine());
        Rectangle rectangle = new Rectangle(l,b);
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());

        System.out.println("Enter the number to check");
        l=Integer.parseInt(in.readLine());
        if (PrimeChecker.isPrime(l)) {
            System.out.println(l + " is a prime number.");
        } else {
            System.out.println(l + " is not a prime number.");
        }
        }catch(Exception e){}
    }
}

