package Core_Java_Topics;

import java.util.Scanner;

public class array_list3 {
    private static Scanner sc = new Scanner(System.in);
    private static array_list2 groceryList = new array_list2();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryItem();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 <-- To print choice options.");
        System.out.println("\t 1 <-- To print the list of grocery items.");
        System.out.println("\t 2 <-- To add an item to the list.");
        System.out.println("\t 3 <-- To modify an item in the list.");
        System.out.println("\t 4 <-- To remove an item from the list.");
        System.out.println("\t 5 <-- To search for an item in the list.");
        System.out.println("\t 6 <-- To quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(sc.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = sc.nextLine();
        groceryList.modifyGroceryItem(itemNo-1, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item number: ");
        int itemNo = sc.nextInt();
        sc.nextLine();
        groceryList.removeGroceryItem(itemNo-1);

    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = sc.nextLine();
        if(groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in  our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
}
