public class RestaurantUtil {
    public static void addMeal(Meal meal) {
        Restaurant.meals[Restaurant.mealCount++] = meal;

    }

    public static void printMeals() {
        for (int i = 0; i < Restaurant.mealCount; i++) {
            Meal meal = Restaurant.meals[i];
            System.out.println(i + 1 + "-ci yemek: " + meal.getName());
        }
    }

    public static void removeMeal(String name) {
        boolean check= false;
        for (int i = 0; i < Restaurant.mealCount; i++) {
            Meal meal = Restaurant.meals[i];
            if (meal.getName().equals(name)) {
                Restaurant.meals[i] = null;
                displacement(Restaurant.meals, i);
                Restaurant.mealCount--;
                check= true;
            }
        }
        if (check)  System.out.println("Ugurlu silinme!");
        else System.out.println("Silme emeliyyati ugursuz oldu!");

    }

    private static void displacement(Meal[] meals, int k) {
        for (int i = 0; i < Restaurant.mealCount; i++) {
            meals[k + i] = meals[k + i + 1];
            meals[k + i + 1] = null;
        }
    }




}