# Student Database Application

This Java project is designed to manage student enrollments and balances for a university. As a Database Administrator (DBA), you can use this application to add new students, enroll them in courses, view their balance, and manage tuition payments.

## Features

- Add new students to the database
- Assign a unique ID to each student
- Enroll students in courses
- View student balance
- Pay tuition
- View student status including name, ID, courses enrolled, and balance

## Courses Available

- History 101
- Mathematics 101
- English 101
- Chemistry 101
- Computer Science 101

## Course Fee

Each course costs $600 to enroll.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE of your choice (e.g., IntelliJ IDEA, Eclipse)

### Installation

1. Clone the repository:

    ```sh
    git clone https://github.com/snmath-pi/java-student-management-system.git
    ```

2. Open the project in your IDE.

3. Compile and run the application.

### Usage

1. When prompted, enter the number of new students to be added to the database.

2. For each student, provide the name and year (grade level).

3. Each student will be assigned a unique 5-digit ID, where the first digit represents their grade level.

4. Enroll students in courses by selecting from the available options.

5. View the student's balance and pay tuition as needed.

6. To view a student's status, you can check their name, ID, enrolled courses, and balance.

## Example

```sh
Welcome to Student Database Application
Enter number of new students to enroll: 2

Enter student name: John Doe
Enter student year: 2
Student ID: 20001

Enter student name: Jane Smith
Enter student year: 1
Student ID: 10002

Enrolling John Doe in courses...
1. History 101
2. Mathematics 101
3. English 101

John Doe's balance: $1800

Paying $600 for John Doe's tuition...
John Doe's updated balance: $1200

Viewing student status for John Doe:
Name: John Doe
ID: 20001
Courses Enrolled: History 101, Mathematics 101, English 101
Balance: $1200
