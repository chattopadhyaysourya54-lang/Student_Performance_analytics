package com.student.analytics;

public class Student {
    private String studentId;
    private String name;
    private String department;
    private double mathScore;
    private double scienceScore;
    private double englishScore;

    public Student(String studentId, String name, String department, double mathScore, double scienceScore, double englishScore) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.mathScore = mathScore;
        this.scienceScore = scienceScore;
        this.englishScore = englishScore;
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getMathScore() { return mathScore; }
    public double getScienceScore() { return scienceScore; }
    public double getEnglishScore() { return englishScore; }

    public double getAverageScore() {
        return (mathScore + scienceScore + englishScore) / 3.0;
    }

    public String getGrade() {
        double avg = getAverageScore();
        if (avg >= 85) return "A";
        if (avg >= 70) return "B";
        if (avg >= 55) return "C";
        if (avg >= 40) return "D";
        return "F";
    }
}
