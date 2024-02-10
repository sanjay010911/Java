class Student
{
 int rollno;
 string name;
 int attendance;
 void readValue(int r,string n,int a)
 {
  rollno=r;
  name=n;
  attendance=a;
 }
 void getValue()
 {
  System.out.println("Rollno :"+rollno);
  System.out.println("Name :"+name);
  System.out.print("Attendance :"+attendance);
 }
}

interface Department
{
 string course;
 void getCourse(String c)
 {
  course=c;
 }
}

class Exam extends Student implements Department
{
 int calcAttendance()
 {
  