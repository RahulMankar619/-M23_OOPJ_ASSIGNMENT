package com.example6.java;

import java.util.Scanner;



public class SalesManagementProgram {
    static final int MONTHS = 12;
    static final int MAX_SALESPERSONS = 100;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Salesperson[] salespersons = new Salesperson[MAX_SALESPERSONS];
        int numSalespersons = 0;
        char choice;

        do {
            System.out.println("\nSales Management Program");
            System.out.println("------------------------");
            System.out.println("1. Add a new salesperson");
            System.out.println("2. Update an existing salesperson");
            System.out.println("3. View total sales for a salesperson");
            System.out.println("4. View total sales for all salespersons");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = input.next().charAt(0);

            switch (choice) {
                case '1':
                    if (numSalespersons < MAX_SALESPERSONS) {
                        Salesperson salesperson = new Salesperson();
                        System.out.print("Enter the name of the salesperson: ");
                        salesperson.name = input.next();
                        System.out.print("Enter the ID of the salesperson: ");
                        salesperson.id = input.nextInt();
                        System.out.println("Enter the sales figures for the past 12 months: ");
                        for (int i = 0; i < MONTHS; i++) {
                            salesperson.sales[i] = input.nextDouble();
                        }
                        salespersons[numSalespersons] = salesperson;
                        numSalespersons++;
                        System.out.println("Salesperson added successfully.");
                    } else {
                        System.out.println("Maximum number of salespersons reached.");
                    }
                    break;

                case '2':
                    System.out.print("Enter the ID of the salesperson to update: ");
                    int idToUpdate = input.nextInt();
                    boolean found = false;
                    for (int i = 0; i < numSalespersons; i++) {
                        if (salespersons[i].id == idToUpdate) {
                            System.out.println("Enter the new sales figures for the past 12 months: ");
                            for (int j = 0; j < MONTHS; j++) {
                                salespersons[i].sales[j] = input.nextDouble();
                            }
                            found = true;
                            System.out.println("Salesperson updated successfully.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Salesperson not found.");
                    }
                    break;

                case '3':
                    System.out.print("Enter the ID of the salesperson to view total sales: ");
                    int idToView = input.nextInt();
                    found = false;
                    for (int i = 0; i < numSalespersons; i++) {
                        if (salespersons[i].id == idToView) {
                            double totalSales = 0;
                            for (int j = 0; j < MONTHS; j++) {
                                totalSales += salespersons[i].sales[j];
                            }
                            System.out.printf("Total sales for %s (ID %d) is $%.2f.\n",
                                    salespersons[i].name, salespersons[i].id, totalSales);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Salesperson not found.");
                    }
                    break;

                case '4':
                    System.out.printf("%-20s%-10s\n", "Name", "Total Sales");
                    System.out.println("--------------------");
                    for (int i = 0; i < numSalespersons; i++) {
                        double totalSales = 0;
                        for (int j = 0; j < MONTHS; j++) {
                            totalSales += salespersons[i].sales[j];
                        }
                        System.out.printf("%-20s$%-10.2f\n", salespersons[i].name, totalSales);
                    }
                    break;

                case '5':
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }

        } while (choice != '5');

        input.close();
    }

    static class Salesperson {
        String name;
        int id;
        double[] sales = new double[MONTHS];
    }
}
