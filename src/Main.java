import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (true){
            System.out.println("               ");
            System.out.println("Movcud secimler: ");
    MenuUtil.printMenu();
            System.out.println("                    ");
            System.out.print("Seciminizi edin: ");
        int choice=sc.nextInt();
            System.out.println();
        switch (choice){
            case 1 -> MenuUtil.addMeals();
            case 2 -> MenuUtil.removeAnyMeal();
            case 3 -> MenuUtil.printAllMeals();
            case 4 -> MenuUtil.searchName();
            case 5 -> MenuUtil.searchCategory();
            case 6 -> MenuUtil.searchPrice();
            case 7 -> MenuUtil.anyOrder();
            case 9 -> System.exit(0);
        }

    }
}}