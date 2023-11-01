class College {
    String collegeName;
    String location;

    public College(String collegeName, String location) {
        this.collegeName = collegeName;
        this.location = location;
    }

    public void displayCollegeInfo() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Location: " + location);
    }
}

class Department extends College {
    String departmentName;

    public Department(String collegeName, String location, String departmentName) {
        super(collegeName, location); // Invoke the constructor of the base class
        this.departmentName = departmentName;
    }

    public void displayDepartmentInfo() {
        System.out.println("Department Name: " + departmentName);
        displayCollegeInfo(); // Call the base class method
    }
}

public class super_keyword {
    public static void main(String[] args) {
        Department department = new Department("XYZ College", "CityName", "Computer Science");
        department.displayDepartmentInfo();
    }
}