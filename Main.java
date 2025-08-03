package main.java;

import java.util.Scanner;
public class MainJava {



    public static void main(String[] args) {
         TodoList todo = new TodoList();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n==== To-Do List ====");
            System.out.println("1. Add task");
            System.out.println("2. Insert task at index");
            System.out.println("3. Delete task");
            System.out.println("4. View all tasks");
            System.out.println("5. Search task");
            System.out.println("6. Count tasks");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter task title: ");
                    String t1 = sc.nextLine().trim();
                    if (!t1.isEmpty()) {
                        todo.addTask(t1);
                    } else {
                        System.out.println("\nTitle cannot be empty.");
                    }
                    break;
                case "2":
                    System.out.print("Enter task title: ");
                    String t2 = sc.nextLine().trim();
                    System.out.print("Enter index (0-based): ");
                    String idxStr = sc.nextLine().trim();
                    try {
                        int idx = Integer.parseInt(idxStr);
                        if (!t2.isEmpty()) {
                            todo.insertTaskAt(t2, idx);
                        } else {
                            System.out.println("\nTitle cannot be empty.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("\nInvalid index.");
                    }
                    break;
                case "3":
                    System.out.print("Enter task title to delete: ");
                    String d = sc.nextLine().trim();
                    if (!d.isEmpty()) {
                        todo.deleteTask(d);
                    } else {
                        System.out.println("\nTitle cannot be empty.");
                    }
                    break;
                case "4":
                    todo.printTasks();
                    break;
                case "5":
                    System.out.print("Enter task title to search: ");
                    String s = sc.nextLine().trim();
                    if (todo.contains(s)) {
                        System.out.println("\nTask found!");
                    } else {
                        System.out.println("\nTask not found.");
                    }
                    break;
                case "6":
                    System.out.println("\nTotal tasks: " + todo.count());
                    break;
                case "7":
                    running = false;
                    System.out.println("\nExiting. Goodbye!");
                    break;
                default:
                    System.out.println("\nInvalid choice. Try again.");
            }
        }

    }
    
}
