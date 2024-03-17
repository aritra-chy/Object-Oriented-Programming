import java.util.ArrayList;
import java.util.List;

class CoffeeShop {
    private String name;
    private List<Beverage> menu;
    private List<Customer> customers;

    public CoffeeShop(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addBeverage(Beverage beverage) {
        menu.add(beverage);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (Beverage beverage : menu) {
            System.out.println(beverage);
        }
        System.out.println();
    }

    public Beverage searchBeverageByName(String beverageName) {
        for (Beverage beverage : menu) {
            if (beverage.getName().equals(beverageName)) {
                return beverage;
            }
        }
        return null;
    }

    public void serveBeverage(String beverageName, String customerName) {
        Beverage beverage = searchBeverageByName(beverageName);
        if (beverage.getName().equals(beverageName)) {
            for (Customer customer : customers) {
                if (customer.getName().equals(customerName)) {
                    customer.orderBeverage(beverage);
                    break;
                }
            }
    }
}

    public void displayCustomerOrders(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                System.out.println("Orders for " + customerName + ":");
                for (Beverage beverage : customer.getOrderedBeverages()) {
                    System.out.println(beverage);
                }
                System.out.println();
                break;
            }
        }
    }
}