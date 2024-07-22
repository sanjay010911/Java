import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s[]=new String[3];
        int a[]=new int[3];
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<3;i++){
                 s[i]=sc.next();
                a[i]=sc.nextInt();
            }
            
            System.out.println("================================");
            for(int i=0;i<3;i++){
            String padded=String.format("%03d",a[i]);
                System.out.println(s[i]+"   "+padded);
            }
            System.out.println("================================");
            
    }
}



