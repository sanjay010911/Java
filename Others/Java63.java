import java.io.*;

class Java63 {
    public Double l, b;

    public static void read(Java63 obj, Double l, Double b) {
        obj.l = l;
        obj.b = b;
    }

    public static void swap(Java63 obj) {
        Double temp = obj.l;
        obj.l = obj.b;
        obj.b = temp;
    }

    public static void disp(Java63 obj) {
        System.out.println("Before swapping l= " + obj.l + " b= " + obj.b);
    }

    public static void disp2(Java63 obj) {
        System.out.println("After swapping l= " + obj.l + " b= " + obj.b);
    }

    public static void main(String args[]) {
        DataInputStream in = new DataInputStream(System.in);
        try {
            System.out.println("Enter l and b");
            Double l = Double.parseDouble(in.readLine());
            Double b = Double.parseDouble(in.readLine());

            Java63 obj = new Java63();
            read(obj, l, b);
            disp(obj);
            swap(obj);
            disp2(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}