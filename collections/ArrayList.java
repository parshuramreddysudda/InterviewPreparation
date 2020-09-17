
//Create A list of students using ArrayList and print them by Iterating


import java.util.*;
class Student{
    String name;
    int id,phoneNumber;
    Student(String name,int id,int phoneNumber)
    {
        this.name=name;
        this.id=id;
        this.phoneNumber=phoneNumber;
    }
    public String getName(){
        return(this.name+" , "+ this.phoneNumber +" , " +this.id);
    }
    public String toString(){
        return(this.name+" , "+ this.phoneNumber +" , " +this.id);
    }
}
class ArrayList{

    public static void main(String args[]){

        Student ram=new Student("Parshu",1,9987);
        Student pappy=new Student("bhargavi",2,9947);
        Student geetha=new Student("Geethu",3,957);
        List <Student> students =new ArrayList<>();
        students.add(ram);
        students.add(pappy);//Adding elements
        students.add(geetha);

//Iterator it=students.iterator();// it is an instance of Iterator class
        Iterator <Student> it=students.iterator();// . it is an instance of Student class
        while(it.hasNext())
        {
//Student s =it.next();  // it.next() returns a Student
//Student s =(Student)it.next();    // it.next() returns iterator object
//System.out.println(s.getName());
            System.out.println(it.next().toString());

            //Comment Added

            //Branch changes Pop/1211/Fixed

        }
    }
}
