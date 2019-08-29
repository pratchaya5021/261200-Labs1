import java.util.ArrayList;
import java.util.Scanner;

public class AverageGradeCalculator2 {
    public static ArrayList<String> students = new ArrayList<>();
    public static ArrayList<String> grades = new ArrayList<>();

    public static double calculateAverageGrade() {
        System.out.println("\nClass roster:");
        double sum = 0.0;
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " (" + grades.get(i) + ")");
            sum += convertGradeLetterToPoint(grades.get(i));
        }

        double tmp = sum / students.size();
        System.out.println("Average grade: " + tmp);
        return tmp;
    }

    private static double convertGradeLetterToPoint(String grade) {
        switch (grade){
            case "A": return 4.0;
            case "B": return 3.0;
            case "C": return 2.0;
            case "D": return 1.0;
            case "B+": return 3.5;
            case "C+": return 2.5;
            case "D+": return 1.5;
            case "F":
            default:
                return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String newStudent;
        System.out.println("Enter your students (or ENTER to finish)");
        //Get student names
        do {
            newStudent = in.nextLine();
            if(!newStudent.equals("")) {
                students.add(newStudent);
            }
        } while (!newStudent.equals(""));

        //Get student grades
        for(String student : students) {
            System.out.print("Grade for "+ student + ": ");
            String grade = in.nextLine();
            grades.add(grade);
        }
        double output = calculateAverageGrade();
    }
}