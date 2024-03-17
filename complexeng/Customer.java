import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private List<Beverage> orderedBeverages;

    public Customer(String name) {
        this.name = name;
        this.orderedBeverages = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Beverage> getOrderedBeverages() {
        return orderedBeverages;
    }

    public void orderBeverage(Beverage beverage) {
            orderedBeverages.add(beverage);
            System.out.println(name + " ordered: " + beverage.getName());
            
        System.out.println();
    }
}