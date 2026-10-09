# Student Performance Analytics Tracking System (SPATS)

An object-oriented Java console application designed to ingest, analyze, and track student performance metrics from pre-saved datasets.

---

## 📌 Features

- **CSV Data Ingestion:** Automates reading and parsing structured student data from pre-saved CSV files.
- **Academic Evaluation:** Automatically calculates average scores across subjects and assigns letter grades based on percentage performance.
- **Class Analytics:** Calculates key aggregate statistics including total enrollment, class overall average, top performer identification, and grade distribution analysis.
- **Interactive Console Menu:** Simple interface for seamless navigation and data reloading.

---

## 📁 Repository Structure

```text
StudentPerformanceAnalytics/
├── src/
│   └── com/
│       └── student/
│           └── analytics/
│               ├── Main.java
│               ├── Student.java
│               └── AnalyticsEngine.java
├── data/
│   └── students_dataset.csv
├── docs/
│   ├── statement.md
│   ├── FinalReport.md
│   └── PresavedDataDoc.md
├── screenshots/
│   ├── 01_main_menu.png
│   ├── 02_student_list.png
│   └── 03_analytics_summary.png
└── README.md
```

---

## 🛠️ Prerequisites

- **Java Development Kit (JDK):** Version 8 or higher
- **IDE / Terminal:** Any Java-compatible IDE (IntelliJ IDEA, Eclipse, VS Code) or command terminal.

---

## 🚀 Execution Instructions

### Option 1: Command Line Interface (CLI)

1. Open your terminal/command line interface and navigate to the root directory:
   ```bash
   cd StudentPerformanceAnalytics
   ```

2. Compile the Java source files:
   ```bash
   javac -d bin src/com/student/analytics/*.java
   ```

3. Run the application:
   ```bash
   java -cp bin com.student.analytics.Main
   ```

### Option 2: Using an IDE
1. Open your IDE and import `StudentPerformanceAnalytics` as a Java project.
2. Mark `src` as the source root.
3. Locate `src/com/student/analytics/Main.java` and click **Run**.

---

## 📊 Sample Output Screenshot Previews

- **Main Menu & Execution:** Displays startup dataset loading status.
- **Student Records View:** Formatted tabular view including IDs, subject marks, overall averages, and letter grades.
- **Analytics Summary:** Displays summary statistics including the class topper and grade breakdown.