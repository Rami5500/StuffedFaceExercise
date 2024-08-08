import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StuffedFaceJavaExercise {
    public static void main(String[] args) {
        System.out.println("Welcome to the Stuffed Face Menu");

        MenuItem burger = new MenuItem("Burger", 3.49);
        MenuItem chips = new MenuItem("Chips", 1.99);
        MenuItem milkshake = new MenuItem("Milkshake", 3.59);

        OrderItem orderBurger = new OrderItem(burger, 1);
        OrderItem orderChips = new OrderItem(chips, 1);
        OrderItem orderMilkshake = new OrderItem(milkshake,1);

        List<OrderItem> orderList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean order = true;
        double total = 0;

        /*
        System.out.println(orderBurger.getQuantity() + " x " + orderBurger.getMenuItem().getName() + " = £" + orderBurger.getMenuItem().getPrice());
        System.out.println(orderChips.getQuantity() + " x " + orderChips.getMenuItem().getName() + " = £" + orderChips.getMenuItem().getPrice());
        System.out.println(orderMilkshake.getQuantity() + " x " + orderMilkshake.getMenuItem().getName() + " = £" + orderMilkshake.getMenuItem().getPrice());
        */
        while (order) {
            System.out.println("1: " + orderBurger.getMenuItem().getName() + " = £" + orderBurger.getMenuItem().getPrice());
            System.out.println("2: " + orderChips.getMenuItem().getName() + " = £" + orderChips.getMenuItem().getPrice());
            System.out.println("3: " + orderMilkshake.getMenuItem().getName() + " = £" + orderMilkshake.getMenuItem().getPrice());
            System.out.println("4: Finish");

            System.out.println("Enter which item you would like (1 or 2 or 3 or 4)?");
            int userItem = scanner.nextInt();

            if (userItem == 1){
                System.out.println("A Burger has been added to your order");
                orderList.add(new OrderItem(burger, 1));
                total += burger.getPrice();
                //System.out.println("You have ordered a " + orderBurger.getMenuItem().getName() + ". That will be £" + orderBurger.getMenuItem().getPrice());
            } else if (userItem == 2) {
                System.out.println("Chips has been added to your order");
                orderList.add(new OrderItem(chips, 1));
                total += chips.getPrice();
                //System.out.println("You have ordered a " + orderChips.getMenuItem().getName() + ". That will be £" + orderChips.getMenuItem().getPrice());
            }
            else if (userItem == 3) {
                System.out.println("A Milkshake has been added to your order");
                orderList.add(new OrderItem(milkshake, 1));
                total += milkshake.getPrice();
                //System.out.println("You have ordered a " + orderMilkshake.getMenuItem().getName() + ". That will be £" + orderMilkshake.getMenuItem().getPrice());
            }
            else{
                order = false;
                orderSummary(orderList, total);
            }

        }

    }

    public static void orderSummary(List<OrderItem> orderList, double total){
        System.out.println("\nOrder Summary:");
        for (OrderItem orderItem : orderList) {
            System.out.println(orderItem.getQuantity() + " x " + orderItem.getMenuItem().getName() + " = £" + orderItem.getTotalPrice());
        }

        double serviceTotal = total + (0.1 * total);
        System.out.println("Total Price: £" + total);
        System.out.println("Total Price with service charge: £" + serviceTotal);
    }

        /* Level 1
        System.out.println("John orders:");
        System.out.println(orderBurger.getQuantity() + " x " + orderBurger.getMenuItem().getName() + " = " + orderBurger.getMenuItem().getPrice());
        System.out.println(orderChips.getQuantity() + " x " + orderChips.getMenuItem().getName() + " = " + orderChips.getMenuItem().getPrice());
         */

        /*
        double totalPrice = orderBurger.getTotalPrice() + orderChips.getTotalPrice();
        double serviceTotal = (totalPrice + (0.1 * totalPrice));
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Total Price with service: " + serviceTotal);
        */

}
