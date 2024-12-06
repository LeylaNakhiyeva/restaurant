import java.util.Scanner;

public class MenuUtil {
   private static String menu="1. Yemek elave etmek \n" +
            "2. Yemek silmek \n" +
            "3. Yemeklerin siyahisini gostermek \n" +
           "4. Adi ile yemek axtarmaq \n" +
           "5. Koteqoriya ile yemek axtarmaq \n" +
           "6. Qiymet araligina uygun yemek axtarmaq \n" +
           "7. Sifaris etmek \n" +
           "8. Butun sifarisleri ve geliri gostermek \n" +
           "9. Proqrami sonlandirmaq";
   public static void printMenu(){
       System.out.println(menu);
   }

   public static void addMeals(){
       Scanner sc= new Scanner(System.in);
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
   public static void removeAnyMeal(){
       Scanner sc= new Scanner(System.in);
       System.out.println("Yemeyin adini daxil edin: ");
       String name= sc.next();
       RestaurantUtil.removeMeal(name);
   }
   public static void printAllMeals(){
       RestaurantUtil.printMeals();
       System.out.println("Menyuda movcud olan butun yemekler teqdim edildi!");
   }
   public static void searchName(){
       Scanner sc= new Scanner(System.in);
       System.out.println("Axtardiginiz yemeyin adini daxil edin: ");
       String name= sc.next();
       Search.searchMealByName(name);
   }
   public static void searchCategory(){
       Scanner sc= new Scanner(System.in);
       System.out.println("Axtardiginiz kateqoriyani daxil edin: ");
       String  category= sc.next();
       Search.searchMealByCategory(category);
   }
   public static void searchPrice(){
       Scanner sc= new Scanner(System.in);
       System.out.print("minPrice: ");
       double minPrice= sc.nextDouble();
       System.out.print("maxPrice: ");
       double maxPrice= sc.nextDouble();
       Search.searchMealByPrice(minPrice,maxPrice);
   }
   public static void anyOrder(){
       Scanner sc= new Scanner(System.in);
       System.out.println("Adinizi daxil edin: ");
       Order.enterCustomerName();
       System.out.println("Sifaris etdiyiniz yemeyin adini daxil edin: ");
       String name= sc.next();
       Order.order(name);
   }
}
