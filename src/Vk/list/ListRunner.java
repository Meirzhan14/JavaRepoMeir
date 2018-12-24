package Vk.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListRunner {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {



        ToDoList toDoList = new ToDoList();
        printOut();
        int param = scanner.nextInt();
        while(param!=0){
            switch (param){
                case 1:
                    System.out.println("please enter a task to add");
                    scanner.nextLine();
                    String task1 = scanner.nextLine();
                    toDoList.addToList(task1);
                    System.out.println("Please an action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Print out TO DO LIST");
                    toDoList.printToDoList();
                    System.out.println("Please an action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Please enter an item to update");
                    scanner.nextLine();
                    int task2 = scanner.nextInt();
                    System.out.println("Please enter a new task");
                    String task3 = scanner.nextLine();
                    toDoList.changeTask(task2, task3);
                    System.out.println("Please an action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Please enter a task to remove");
                    scanner.nextLine();
                    String task4 = scanner.nextLine();
                    toDoList.removeTask(task4);
                    System.out.println("Please an action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("Please enter the task to get priority");
                    scanner.nextLine();
                    String task5 = scanner.nextLine();
                    System.out.println("Priority: "+ toDoList.getTaskPriority(task5));
                    System.out.println("Please an action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                case 6:
                    System.out.println("Please enter a number of position for the task");
                    scanner.nextLine();
                    int index = scanner.nextInt();
                    System.out.println("Please enter a new task");
                    String  task6 = scanner.nextLine();
                    toDoList.changeTask(index,task6);
                    System.out.println("Please an action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                    default:
                        param = 0;
            }
        }
    }

    private static void printOut(){
        System.out.println("Please choose an action. Press: \n"
        + "1 to add a new item into toDoList \n"
        + "2 to print out the list \n"
        + "3 to update an existing item \n"
        + "4 to remove an item from the list \n"
        + "5 to get task \n"
        + "6 to add a new item at specific position\n"
        + "press 0 to exit\n\n"
        + "AFTER choosing an option please press enter");

    }
}
