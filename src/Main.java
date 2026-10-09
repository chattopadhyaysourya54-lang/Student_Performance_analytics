package com.student.analytics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnalyticsEngine engine = new AnalyticsEngine();
        Scanner scanner = new Scanner(System.in);
        String defaultPath = "data/students_dataset.csv";

        System.out.println("==================================================");
        System.out.println("  Student Performance Analytics System (v1.0)     ");
        System.out.println("==================================================");

        // Auto-load default presaved dataset
        engine.loadDataFromCSV(defaultPath);

        boolean running = true;
        while (running) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. View All Student Records");
            System.out.println("2. Generate Analytics Summary");
            System.out.println("3. Reload Dataset");
            System.out.println("4. Exit");
            System.out.print("Select an option (1-4): ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    engine.displayAllStudents();
                    break;
                case "2":
                    engine.generateAnalyticsSummary();
                    break;
                case "3":
                    System.out.print("Enter relative CSV file path [default: data/students_dataset.csv]: ");
                    String customPath = scanner.nextLine().trim();
                    if (customPath.isEmpty()) customPath = defaultPath;
                    engine.loadDataFromCSV(customPath);
                    break;
                case "4":
                    running = false;
                    System.out.println("Exiting system. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
