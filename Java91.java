import java.io.*;
class Employee
{
    String name;
    int age;
    String ph;
    String address;
    int Sal;
   
    public void printSalary()
    {
        System.out.print("Salary : "+Sal);
    }
}
class Officer extends Employee
{
    String spec;
    String dept;
    
    public void read()
    {
        DataInputStream in=new DataInputStream(System.in);
        try{
            System.out.println("Enter the name");
            name=in.readLine();
            System.out.println("Enter age");
            age=Integer.parseInt(in.readLine());
            System.out.println("Enter Phoneno");
            ph=in.readLine();
            System.out.println("Enter address");
            address=in.readLine();
            System.out.println("Enter salary");
            Sal=Integer.parseInt(in.readLine());
            System.out.println("Enter Specialization");
            spec=in.readLine();
            System.out.println("Enter Department");
            dept=in.readLine();
        }
        catch(Exception e){}
    }
    public void print()
    {
        System.out.println();
        System.out.println("  Name : "+name+"Age : "+age+"Phone no : "+ph+"Address : "+address+"Specialization : "+spec+"Department : "+dept);
        printSalary();
    }
    
}
class Manager extends Employee
{
    String spec;
    String dept;
    public void read()
    {
        DataInputStream in=new DataInputStream(System.in);
        try{
            System.out.println("Enter the name");
            name=in.readLine();
            System.out.println("Enter age");
            age=Integer.parseInt(in.readLine());
            System.out.println("Enter Phoneno");
            ph=in.readLine();
            System.out.println("Enter address");
            address=in.readLine();
            System.out.println("Enter salary");
            Sal=Integer.parseInt(in.readLine());
            System.out.println("Enter Specialization");
            spec=in.readLine();
            System.out.println("Enter Department");
            dept=in.readLine();
        }
        catch(Exception e){}
    }
    public void print()
    {
        System.out.println();
        System.out.println("  Name : "+name+"Age : "+age+"Phone no : "+ph+"Address : "+address+"Specialization : "+spec+"Department : "+dept);
        printSalary();
    }
    
}

class Java91
{
    public static void main(String args[])
    {
            Officer o=new Officer();
            Manager m=new Manager();
            o.read();
            m.read();
            o.print();
            m.print();

    }
}