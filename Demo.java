public class Demo{
  
  public static void main(String[] args) {
      StudentOOP s1 = new StudentOOP();
      StudentOOP s2 = new StudentOOP();

      s1.name="Aditya";
      s1.age=23;
      s1.rollNumber=101;
      s1.college="ACE clg";

      s2.name="Nagasai";
      s2.age=24;
      s2.rollNumber=105;
      s2.college="KPRIT clg";

      s1.markAttendance();
      s2.markAttendance();

      s1.print();
      s2.print();
  }
}

class StudentOOP{
  String name;
  int age;
  int rollNumber;
  String college;

  void markAttendance(){
    System.out.println("Attendance marked by:"+ name);
  }

  void print(){
    System.out.println(name +","+age+","+rollNumber+","+college);
  }
    
  
}