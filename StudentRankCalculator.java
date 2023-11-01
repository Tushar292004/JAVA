class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class StudentRankCalculator {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Alice", 85),
            new Student("Bob", 92),
            new Student("Charlie", 78),
            new Student("David", 96),
            new Student("Eve", 88)
        };

        // Sort the students by score (descending order)
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].score < students[j].score) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        // Print the student ranks
        System.out.println("Student Ranks:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: " + students[i].name + ", Score: " + students[i].score + ", Rank: " + (i + 1));
        }
    }
}