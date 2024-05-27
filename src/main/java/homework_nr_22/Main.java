package homework_nr_22;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String studentsDB = "jdbc:postgresql://localhost:5432/students_db?user=postgres&password=2506";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("What would like to do next: %n1.Insert data.%n2.Update grade.%n3.Delete student by id.%n4.Print all students.%n");
        int userAnswer = scanner.nextInt();
        
        switch (userAnswer) {
            case 1:
                System.out.print("Enter student's name (max.50): ");
                String name = scanner.next();
                System.out.print("Enter the student's age (1-100): ");
                int age = scanner.nextInt();
                System.out.print("Enter your student's grade (1-10): ");
                float grade = scanner.nextFloat();
                insertData(name, age, grade);
                break;
            case 2:
                System.out.print("Enter the ID of the student whose grade you want to update: ");
                int id = scanner.nextInt();
                System.out.print("Enter new grade  (1-10): ");
                float newgrade = scanner.nextFloat();
                updateGrade(id, newgrade);
                break;
            case 3:
                System.out.print("Enter the student ID to delete it: ");
                scanner.nextLine();
                int id_for_delete = scanner.nextInt();
                deleteStudent(id_for_delete);
                break;
            case 4:
                printAllStudents();
                break;
            default:
                System.out.println("No such command exists");
        }
        scanner.close();
    }
    
    public static void insertData(String name, int age, float grade) {
        try (Connection conn = DriverManager.getConnection(studentsDB)) {
            if (name.length() < 50 && !name.isEmpty() && grade > 0 && grade <= 10) {
                if (age > 0 && age <= 100) {
                    PreparedStatement ps = conn.prepareStatement(SQLQueries.INSERT_INTO_ALL_COLUMNS_QUERY.Query);
                    
                    ps.setString(1, name);
                    ps.setInt(2, age);
                    ps.setFloat(3, grade);
                    
                    ps.execute();
                    System.out.println("New student " + name + " has been added succes!");
                    
                } else {
                    System.out.println("Failed to introduce a new student, check his attributes!");
                }
            } else {
                System.out.println("Name and Grade are incorrect");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    public static void printAllStudents() {
        try (Connection conn = DriverManager.getConnection(studentsDB)) {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(SQLQueries.SELECT_ALL_COLUMN.Query);
            
            ResultSetMetaData rsmd = resultSet.getMetaData();
            
            List<String> columnList = new ArrayList<>();
            for (int index = 1; index != rsmd.getColumnCount() + 1; index++) {
                columnList.add(rsmd.getColumnLabel(index));
            }
            
            while (resultSet.next()) {
                for (String element :
                        columnList) {
                    System.out.print(resultSet.getString(element) + ", ");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void updateGrade(int id, float grade) {
        try (Connection conn = DriverManager.getConnection(studentsDB)) {
            if (grade > 0 && grade <= 10) {
                PreparedStatement ps = conn.prepareStatement(SQLQueries.UBDATE_BY_ID.Query);
                
                ps.setInt(2, id);
                ps.setFloat(1, grade);
                
                int rowsAffected = ps.executeUpdate();
                
                System.out.println("Rows affected: " + rowsAffected);
                
                if (rowsAffected > 0) {
                    System.out.println("Grade was successfully updated.");
                } else {
                    System.out.println("No entry with the specified ID was found.");
                }
            } else {
                System.out.println("Such assessment does not exist in our country.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void deleteStudent(int id) {
        try (Connection conn = DriverManager.getConnection(studentsDB)) {
            PreparedStatement ps = conn.prepareStatement(SQLQueries.DELETE_BY_ID.Query);
            
            ps.setInt(1, id);
            
            int rowsAffected = ps.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("The student was successfully removed from the database.");
            } else {
                System.out.println("No entry with the specified ID was found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
