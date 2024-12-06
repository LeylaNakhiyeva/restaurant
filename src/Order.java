import java.util.Scanner;

public class Order {
    private String customerName;
    public void setCustomerName(String name){
        this.customerName=name;
    }
    public String getCustomerName(){
        return customerName;
    }
    public static void enterCustomerName(){
        Scanner sc= new Scanner(System.in);
        Order customer= new Order();
        customer.setCustomerName(sc.next());
    }
    public static void order(String name){
        boolean check= false;
        for (int i=0; i<Restaurant.mealCount; i++){
            Meal meal= Restaurant.meals[i];
            if (meal.getName().equals(name)){
                System.out.println("Sifarisin qiymeti: "+meal.getPrice());
                check=true;
            }
        }
        if (check) System.out.println("Sifarisiniz qebul edildi!");
        else System.out.println("Sifaris haqqinda melumat yalnisdir!");
    }
}
