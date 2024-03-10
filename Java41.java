import java.io.*;
class Java41 {

    public static void main(String args[]) {

        DataInputStream in=new DataInputStream(System.in);
        try{
            System.out.println("Enter three numbers");
            int num1=Integer.parseInt(in.readLine());
            int num2=Integer.parseInt(in.readLine());
            int num3=Integer.parseInt(in.readLine());
        int result = findMaxOfThreeNumbers(num1, num2, num3);

        System.out.println("The maximum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + result);
        }catch(Exception e){}
    }

    
    public static int findMaxOfTwoNumbers(int a, int b) {
        return (a > b) ? a : b;
    }

   
    public static int findMaxOfThreeNumbers(int x, int y, int z) {
       
        int maxOfFirstTwo = findMaxOfTwoNumbers(x, y);

        return findMaxOfTwoNumbers(maxOfFirstTwo, z);
    }
}