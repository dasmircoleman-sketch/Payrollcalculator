package com.pluralsight;

public class Employeeinfo {
    //Decarations of variables
        private int employeeId;
        private String name;
        private double hoursWorked;
        private double payRate;
//Assigning values to variables
        public void Employee(int employeeId, String name, double hoursWorked, double payRate) {
            this.employeeId = employeeId;
            this.name = name;
            this.hoursWorked = hoursWorked;
            this.payRate = payRate;
        }
// applying getters and setters to retrieve information
        public int getEmployeeId() {
            return employeeId;
        }

        public String getName() {
            return name;
        }

        public double getHoursWorked() {
            return hoursWorked;
        }

        public double getPayRate() {
            return payRate;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setHoursWorked(double hoursWorked) {
            this.hoursWorked = hoursWorked;
        }

        public void setPayRate(double payRate) {
            this.payRate = payRate;
        }

        public double getGrossPay() {
            return hoursWorked * payRate;
        }
    }
}
