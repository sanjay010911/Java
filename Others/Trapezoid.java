import java.io.*;
class Area
{
    public float ar;
    public Area(float r)
    {
        this.ar=(22/7)*r*r;
    }
    public Area(float l,float b)
    {
        this.ar=l*b;
    }
    public Area(float a,float b,float h)
    {
        this.ar=((a+b)/2)*h;
    }
    public Area(int b,int h)
    {
        this.ar=0.5f*b*h;
    }
}

class Trapezoid
{
    public static void main(String args[])
    {
        int i;
        Area d[];
        DataInputStream in=new DataInputStream(System.in);
        try{
            d=new Area[5];
            for(i=0;i<4;i++)
            {
                System.out.println("Enter the choice 1: Circle 2:Rectangle 3:Trapezium 4:Triangle");
                int ch=Integer.parseInt(in.readLine());
                if(ch==1)
                {
                    System.out.println("Enter the radius");
                    float r=Float.parseFloat(in.readLine());
                    d[i]=new Area(r);
                }
                else if(ch==2)
                {
                    System.out.println("Enter the length and breadth");
                    float l=Float.parseFloat(in.readLine());
                    float b=Float.parseFloat(in.readLine());
                    d[i]=new Area(l,b);
                }
                else if(ch==3)
                {
                    System.out.println("Enter a,b,c");
                    float a=Float.parseFloat(in.readLine());
                    float b=Float.parseFloat(in.readLine());
                    float c=Float.parseFloat(in.readLine());
                    d[i]=new Area(a,b,c);
                }
                else if(ch==4)
                {
                    System.out.println("Enter b,h");
                    int b=Integer.parseInt(in.readLine());
                    int h=Integer.parseInt(in.readLine());
                    d[i]=new Area(b,h);
                }
            }
        
            System.out.println("Area of Circle : "+d[0].ar);
            System.out.println("Area of Rectangle : "+d[1].ar);
            System.out.println("Area of Trapezium : "+d[2].ar);
            System.out.println("Area of Triangle : "+d[3].ar);

        }
        catch(Exception e){
        }
    }
}