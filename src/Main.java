public class Main {
    public static void main(String[] args) {
        HealthyBurger healthyBurger = new HealthyBurger("minced beef", 10);
        healthyBurger.setAdditonalItems(true, true, true, true, true);
        healthyBurger.getInvoice(true);

        DeluxBurger deluxBurger = new DeluxBurger("Something", "Pork", 11);
        deluxBurger.setAdditonalItems(false, true);
        deluxBurger.getInvoice(true);

        Hamburger hamburger = new Hamburger("Hamburger","Brown Rye Bread","Beef", 10);
        hamburger.setAdditonalItems(false, true, true);
        hamburger.getInvoice(false);
    }
}