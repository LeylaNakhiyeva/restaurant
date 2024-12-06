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
            case 1 -> {
                System.out.print("name: ");
                String name= sc.next();
                System.out.print("price: ");
                double price= sc.nextDouble();
                System.out.print("category: ");
                String category=sc.next();
                Meal meal= new Meal();
                meal.setName(name);
                meal.setPrice(price);
                meal.setCategory(category);
                RestaurantUtil.addMeal(meal);
                System.out.println("Ugurlu elave etme!");
            }
            case 2->{
                System.out.println("Yemeyin adini daxil edin: ");
                String name= sc.next();
                RestaurantUtil.removeMeal(name);

            }
            case 3 ->{
               RestaurantUtil.printAllMeals();
                System.out.println("Menyuda movcud olan butun yemekler teqdim edildi!");
            }
            case 4 ->{
                System.out.println("Axtardiginiz yemeyin adini daxil edin: ");
                String name= sc.next();
                Search.searchMealByName(name);
            }
            case 5 ->{
                System.out.println("Axtardiginiz kateqoriyani daxil edin: ");
                String  category= sc.next();
                Search.searchMealByCategory(category);
            }
            case 6 ->{
                System.out.print("minPrice: ");
                double minPrice= sc.nextDouble();
                System.out.print("maxPrice: ");
                double maxPrice= sc.nextDouble();
                Search.searchMealByPrice(minPrice,maxPrice);
            }
            case 7 -> {
                System.out.println("Adinizi daxil edin: ");
                Order.enterCustomerName();
                System.out.println("Sifaris etdiyiniz yemeyin adini daxil edin: ");
                String name= sc.next();
                Order.order(name);
            }
        }

    }
}}