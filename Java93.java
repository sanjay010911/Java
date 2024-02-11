import java.io.*;
class Staff
{
    int code;
    String name;
    public Staff(int code,String name)
    {
        this.code=code;
        this.name=name;
    }
}
class Faculty extends Staff
{
    String department;
    String subjecttaken;
    String ResearchArea;
    public Faculty(int code,String name,String dept,String sb,String re)
    {
       super(code,name);
       this.department=dept;
       this.subjecttaken=sb;
       this.ResearchArea=re;
    }
    public void display()
    {
         System.out.println();
        System.out.println("Code : "+code+"\n"+" Name : "+name+"\n"+" Department : "+department+"\n"+" Subject Taken : "+subjecttaken+"\n"+" Research Area : "+ResearchArea);
    }

}

class Officer extends Staff
{
    int rank;
    String grade;
    public Officer(int code,String name,int rank,String grade)
    {
        super(code,name);
        this.rank=rank;
        this.grade=grade;
    }
    public void display()
    {
        System.out.println();
        System.out.println("Code : "+code+"\n"+" Name : "+name+"\n"+" Rank : "+rank+"\n"+" Grade : "+grade);
    }
}

class Typist extends Staff
{
    String office;
    int speed;
    public Typist(int code,String name,String office,int speed)
    {
        super(code,name);
        this.office=office;
        this.speed=speed;
    }
}

class Permanent extends Typist
{
   double salary;
   public Permanent(int code,String name,String office,int speed,double salary)
   {
        super(code,name,office,speed);
        this.salary=salary;
   }
    public void display()
    {
         System.out.println();
        System.out.println("Code : "+code+"\n"+" Name : "+name+"\n"+" Office : "+office+"\n"+" Speed : "+speed+"\n"+" Salary : "+salary);
    }
}
class Casual extends Typist
{
   double dailywages;
   public Casual(int code,String name,String office,int speed,double dailywages)
   {
        super(code,name,office,speed);
        this.dailywages=dailywages;
   }
    public void display()
    {
         System.out.println();
        System.out.println("Code : "+code+"\n"+" Name : "+name+"\n"+" Office : "+office+"\n"+" Speed : "+speed+"\n"+" DailyWages : "+dailywages);
    }
}

class Java93
{
    public static void main(String args[])
    {
        Faculty f=new Faculty(100,"Hari","cs","Java,Python","AI");
        Permanent p=new Permanent(101,"Jithin","Techtype",45,25000);
        Casual c=new Casual(102,"Alen","SpeedType",50,750);
        Officer o=new Officer(103,"Naslen",5,"A+");

        f.display();
        p.display();
        c.display();
        o.display();

    }
}