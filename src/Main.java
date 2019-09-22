public class Main {
    public static void main(String[] args) {
        HealthyBurger healthyBurger = new HealthyBurger("minced beef", 10);
        healthyBurger.setAdditonalItems(false, true, true, false, true);
        System.out.println(healthyBurger.getTotalPrice());
        healthyBurger.getInvoice();
    }
}