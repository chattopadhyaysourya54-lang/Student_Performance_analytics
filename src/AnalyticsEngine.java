package com.student.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class AnalyticsEngine {
    private List<Student> students = new ArrayList<>();

    public void loadDataFromCSV(String filePath) {
        students.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstLine = true;
            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false; // Skip header
                    continue;
                }
                String[] values = line.split(",");
                if (values.length == 6) {
                    String id = values[0].trim();
                    String name = values[1].trim();
                    String dept = values[2].trim();
                    double math = Double.parseDouble(values[3].trim());
                    double science = Double.parseDouble(values[4].trim());
                    double english = Double.parseDouble(values[5].trim());

                    students.add(new Student(id, name, dept, math, science, english));
                }
            }
            System.out.println(" Successfully loaded " + students.size() + " student records.");
        } catch (IOException e) {
            System.err.println(" Error reading data file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println(" Error parsing score data. Check CSV format.");
        }
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        System.out.println("\n====================================================================================");
        System.out.printf("%-10s | %-18s | %-12s | %-6s | %-6s | %-6s | %-6s | %-5s\n", 
                          "ID", "Name", "Department", "Math", "Sci", "Eng", "Avg", "Grade");
        System.out.println("====================================================================================");
        for (Student s : students) {
            System.out.printf("%-10s | %-18s | %-12s | %-6.1f | %-6.1f | %-6.1f | %-6.2f | %-5s\n",
                    s.getStudentId(), s.getName(), s.getDepartment(),
                    s.getMathScore(), s.getScienceScore(), s.getEnglishScore(),
                    s.getAverageScore(), s.getGrade());
        }
        System.out.println("====================================================================================");
    }

    public void generateAnalyticsSummary() {
        if (students.isEmpty()) {
            System.out.println("No data available for analytics.");
            return;
        }

        double totalOverall = 0;
        double maxAvg = Double.MIN_VALUE;
        Student topPerformer = null;
        Map<String, Integer> gradeDistribution = new HashMap<>();

        for (Student s : students) {
            double avg = s.getAverageScore();
            totalOverall += avg;

            if (avg > maxAvg) {
                maxAvg = avg;
                topPerformer = s;
            }

            String grade = s.getGrade();
            gradeDistribution.put(grade, gradeDistribution.getOrDefault(grade, 0) + 1);
        }

        double overallClassAverage = totalOverall / students.size();

        System.out.println("\n==================================================");
        System.out.println("           CLASS ANALYTICS SUMMARY               ");
        System.out.println("==================================================");
        System.out.printf("Total Enrolled Students : %d\n", students.size());
        System.out.printf("Overall Class Average   : %.2f%%\n", overallClassAverage);
        if (topPerformer != null) {
            System.out.printf("Top Performer           : %s (%s) - Avg: %.2f%%\n", 
                              topPerformer.getName(), topPerformer.getStudentId(), topPerformer.getAverageScore());
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Grade Distribution:");
        for (Map.Entry<String, Integer> entry : gradeDistribution.entrySet()) {
            System.out.printf("  Grade %s : %d student(s)\n", entry.getKey(), entry.getValue());
        }
        System.out.println("==================================================");
    }
}
