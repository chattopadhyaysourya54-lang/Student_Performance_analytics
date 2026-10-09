# Problem Statement

## Project Title
**Student Performance Analytics Tracking System (SPATS)**

---

## Background & Context
Educational institutions and academic departments manage large volumes of student performance data per term. Manually evaluating individual subject marks, computing percentages, assigning grade boundaries, and extracting analytical insights (such as overall class performance or identifying struggling students) is time-consuming, prone to calculation errors, and inefficient.

---

## Identified Problem
- **Manual Workload:** Calculating individual student averages and letter grades manually across multiple subjects leads to administrative overhead.
- **Lack of Real-time Insights:** Educators lack instant metrics on general class performance, top performers, and grade frequency distribution.
- **Data Fragmentability:** Student record files are often stored in plain files without integrated validation or analytics tools.

---

## Proposed Solution
The **Student Performance Analytics Tracking System (SPATS)** provides an efficient, lightweight CLI application built in Java. It automatically imports structured pre-saved dataset files (`.csv`), validates inputs, computes subject averages and standardized grades, and displays class-level analytics.

---

## Core Functional Requirements
1. **Dataset Parser:** Process pre-saved CSV files containing student information and academic scores.
2. **Grade Calculator:** Automatically derive individual student subject averages and letter grades ($A, B, C, D, F$).
3. **Tabular Record Display:** Present clean formatted tables of student performance.
4. **Analytics Summary Generator:** Calculate aggregate metrics including total class average, top performer identification, and grade frequency counts.