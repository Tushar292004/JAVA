class Student {
    String name ;
    int age ;

    public void student(String name, int age){
        this.name = name ;
        this.age = age;
    }

    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age );
    }
}

class Course extends Student{
    String course_name ;
    int course_id;

    public void course(String course_name, int course_id){
        this.course_name = course_name ;
        this.course_id = course_id ;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: "+ course_name);
        System.out.println("Course ID: "+ course_id); 
    }
}

class Admission extends Course {
    int class_no ;
    int admission_no;

    public void admission(int class_no, int admission_no){
        this.class_no = class_no ;
        this.admission_no = admission_no ;
    }
    
    public void displayAdmissionDetails() {
        System.out.println("Admission Class: "+ class_no);
        System.out.println("Admission ID: "+ admission_no); 
    }
}
public class multilevel_inheritence {
    public static void main(String[] args) {
        Admission a1 = new Admission() ;
        a1.student("John",20) ;
        a1.course("Maths",56789) ;
        a1.admission(3, 1234) ;
        a1.display(); 
        a1.displayCourseDetails(); 
        a1.displayAdmissionDetails(); 
    }
}
