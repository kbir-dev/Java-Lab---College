class student{
    String name;
    int rollNum;
    int marks;
    int age;
    student(String name,int rollNum,int marks,int age){
        this.name = name;
        this.rollNum = rollNum;
        this.marks = marks;
        this.age = age;
        System.out.println("Name: " + name + " Roll Number: " + rollNum + " Marks: " + marks + " Age: " + age);
    }
}

public class main{
    public static void main(String[] args){
        student s1 = new student("Karan",1,100,20);
        student s2 = new student("Jatin",5,57,20);
        student s3 = new student("Kashyap",10,63,20);
    }
}