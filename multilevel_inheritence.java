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

class Admission extends Student {
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
        Course c1 = new Course();
        c1.student("John",25);
        c1.course("Maths",101);
        c1.display();
        c1.displayCourseDetails();

        Admission a1 = new Admission();
        a1.student("Mike",30);
        a1.admission(4,6789);
        a1.display();
        a1.displayAdmissionDetails();
    }
}
