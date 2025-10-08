package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

    public static <Employee> void main(String[] args) {
        String fileName = "employees.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                if (tokens.length == 4) {
                    int id = Integer.parseInt(tokens[0]);
                    String name = tokens[1];
                    double hoursWorked = Double.parseDouble(tokens[2]);
                    double payRate = Double.parseDouble(tokens[3]);

                    Employee emp = new Employee(id, name, hoursWorked, payRate);

                    System.out.printf("ID: %d | Name: %s | Gross Pay: $%.2f%n",
                            emp.getEmployeeId(), emp.getName(), emp.getGrossPay());
                } else {
                    System.out.println("Invalid line format: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing number: " + e.getMessage());
        }
    }
}
