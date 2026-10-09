# FINAL PROJECT REPORT
## Student Performance Analytics Tracking System (SPATS)

**Course:** Computer Science / Object-Oriented Programming  
**Technology Stack:** Java (Core Java, Collections Framework, File I/O)  
**Submission Format:** Source Code, Datasets, Documentation, Execution Screenshots  

---

## 1. Abstract
The **Student Performance Analytics Tracking System (SPATS)** is an object-oriented software solution created to address the inefficiencies associated with manual academic evaluation. The system ingests structured CSV data containing student identification details and individual subject scores, processes performance metrics, computes overall grade thresholds, and compiles class-wide analytics summaries.

---

## 2. System Objectives
1. **Automate Grade Computation:** Eliminate manual calculation errors by computing total averages and assigning standardized letter grades automatically.
2. **Dynamic Dataset Handling:** Enable flexible parsing of external CSV dataset files via standard Java File I/O interfaces.
3. **Aggregate Analytics:** Provide educators with actionable insights, such as class averages, grade distributions, and top performer identification.

---

## 3. Architecture & Class Design

The core system architecture consists of three core Java classes built around Object-Oriented Programming (OOP) principles:

- **`Student.java` (Model Class):** Encapsulates student attributes (ID, Name, Department, Subject Scores) using strict encapsulation getters and methods for calculating individual averages and letter grades.
- **`AnalyticsEngine.java` (Business Logic Class):** Manages file reading (`BufferedReader`), stores object lists (`ArrayList`), handles formatted tabular outputs, and computes aggregated metrics using `HashMap` structures.
- **`Main.java` (Driver Class):** Manages the execution loop and menu selection terminal interface.

---

## 4. Grading Algorithm & Rules

Grades are assigned based on the student's calculated overall average percentage:

| Grade | Percentage Range | Classification |
| :---: | :---: | :---: |
| **A** | $85\% - 100\%$ | Outstanding |
| **B** | $70\% - 84.9\%$ | Good |
| **C** | $55\% - 69.9\%$ | Average |
| **D** | $40\% - 54.9\%$ | Below Average |
| **F** | $< 40\%$ | Fail |

---

## 5. Performance Metrics & Data Ingestion

The system reads data from a pre-saved comma-separated values (`.csv`) file using `BufferedReader`. During file reading, line parsing occurs via regex splitting (`line.split(",")`), while robust exception handling ensures application stability against missing files or malformed numeric inputs.

---

## 6. Conclusion & Future Scope
SPATS successfully satisfies all requirements for automated student grade calculation and class analytics tracking. 

### Future Scope:
1. Integration with a relational database management system (e.g., MySQL or SQLite) for persistent record updates.
2. Development of a Graphical User Interface (GUI) using JavaFX or Swing.
3. Automated generation of downloadable PDF performance transcripts for individual students.