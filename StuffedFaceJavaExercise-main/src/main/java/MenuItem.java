public class MenuItem {

    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    /*
    public convert(price){
        return "£"+((Number(value)||0).toFixed(2).replace(/(\d)(?=(\d{3})+(?!\d))/g, "$1,"))+"p";
    }

    console.log(convert(10496.470000000001));
    */

}
