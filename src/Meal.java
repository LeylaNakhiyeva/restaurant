public class Meal {
    private String name;
    private Double price;
    private  String category;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
 @Override
    public String  toString(){
        return "name: "+name+"      " +
                "price: "+price+"       " +
                "category: "+category+"\n";
 }
}
