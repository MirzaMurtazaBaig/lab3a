package Task1;

import java.util.Scanner;

class Student {
    private String studentName;
    private double totalMarks;
    private double obtainedMarks;

    public Student(String studentName, double totalMarks, double obtainedMarks) {
        this.studentName = studentName;
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtainedMarks;
    }

    public double calculatePercentage() {
        return (obtainedMarks / totalMarks) * 100;
    }

    public String getGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) return "A+";
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        return "F";
    }

    public double getGPA() {
        return switch (getGrade()) {
            case "A+", "A" -> 4.0;
            case "B" -> 3.0;
            case "C" -> 2.0;
            case "D" -> 1.0;
            default -> 0.0;
        };
    }

    public void displayMarkSheet() {
        System.out.println("\n--- Mark Sheet ---");
        System.out.printf("Student Name: %s%n", studentName);
        System.out.printf("Total Marks: %.2f%n", totalMarks);
        System.out.printf("Obtained Marks: %.2f%n", obtainedMarks);
        System.out.printf("Percentage: %.2f%%%n", calculatePercentage());
        System.out.printf("Grade: %s%n", getGrade());
        System.out.printf("GPA: %.2f%n", getGPA());
        System.out.println("------------------");
    }
}

public class MarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student details:");
        System.out.print("Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Total Marks: ");
        double totalMarks = scanner.nextDouble();

        System.out.print("Obtained Marks: ");
        double obtainedMarks = scanner.nextDouble();

        // Creating and displaying the mark sheet in one step
        new Student(studentName, totalMarks, obtainedMarks).displayMarkSheet();

        // Closing the scanner
        scanner.close();
    }
}
