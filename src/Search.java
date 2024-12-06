public class Search {
    public static void searchMealByName(String name) {
        boolean check = false;
        for (int i = 0; i < Restaurant.mealCount; i++) {
            Meal meal = Restaurant.meals[i];
            if (meal.getName().equals(name)) {
                System.out.println("Bu yemek haqqinda melumatlar: ");
                System.out.println(meal);
                check = true;
            }
        }if (check) System.out.println("Axtaris ile bagli melumatlar teqdim edildi!");
        else System.out.println("Bu ada malik yemek yoxdur!");
    }
    public static void searchMealByCategory(String category){
        boolean check=false;
        for (int i=0; i<Restaurant.mealCount; i++){
            Meal meal=Restaurant.meals[i];
            if (meal.getCategory().equals(category)){
                System.out.println("Bu kateqoriyaya aid yemekler haqqinda melumatlar: ");
                System.out.println(meal);
                check=true;
            }
        }
        if (check) System.out.println("Bu kateqoriyada olan yemekler haqqinda melumatlar teqdim edildi!");
        else System.out.println("Bu kateqoriya movcud deyil!");
    }
    public static void searchMealByPrice(double priceMin, double priceMax){
        boolean check=false;
        for (int i=0; i<Restaurant.mealCount; i++){
            Meal meal=Restaurant.meals[i];
            if (meal.getPrice()>priceMin && meal.getPrice()<priceMax){
                System.out.println("Bu qiymet araligina daxil yemekler haqqinda melumatlar: ");
                System.out.println(meal);
                check=true;
            }
        }
        if (check) System.out.println("Bu qiymet araligina daxil yemekler haqqinda melumatlar teqdim edildi!");
        else System.out.println("Bu qiymet araligina malik yemek yoxdur!");
    }
}
