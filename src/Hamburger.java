public class Hamburger {
    private String burgerName;
    private String rollType;
    private String meatType;
    private double burgerBasePrice;
    private double additonalPrice;
    private double totalPrice;
    private Item lettuce = new Item("lettuce", 1);
    private Item tomato = new Item("tomato", 1);
    private Item carrot = new Item("carrot", 1);
    private String selectedItemsNames;

    public Hamburger(String burgerName, String rollType, String meatType, double burgerPrice) {
        this.burgerName = burgerName;
        this.rollType = rollType;
        this.meatType = meatType;
        this.burgerBasePrice = burgerPrice;
        setTotalPrice();
        selectedItemsNames = selectedItemsNames == null? "You didn't choose any additional item!" : selectedItemsNames;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeatType() {
        return meatType;
    }

    public double getBurgerBasePrice() {
        return burgerBasePrice;
    }

    public Item getLettuce() {
        return lettuce;
    }

    public Item getTomato() {
        return tomato;
    }

    public Item getCarrot() {
        return carrot;
    }

    public void setAdditonalItems(boolean isLettuceAdd, boolean isTomatoAdd, boolean isCarrotAdd){
        lettuce.setAdd(isLettuceAdd);
        tomato.setAdd(isTomatoAdd);
        carrot.setAdd(isCarrotAdd);
    }

    public double getAdditonalPrice (){
        if(lettuce.getIsAdd())
            additonalPrice += lettuce.getItemPrice();
        if(tomato.getIsAdd())
            additonalPrice += tomato.getItemPrice();
        if(carrot.getIsAdd())
            additonalPrice += carrot.getItemPrice();
        return additonalPrice;
    }

    public void setAdditonalPrice(double additonalPrice) {
        this.additonalPrice = additonalPrice;
    }

    public void setTotalPrice() {
        totalPrice = additonalPrice + burgerBasePrice;
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    public String getSelectedItemsNames() {

        selectedItemsNames =
                (lettuce.getIsAdd()? lettuce.getItemName() + ", " : "")
                + (tomato.getIsAdd()? tomato.getItemName() + ", " : "")
                + (carrot.getIsAdd()? carrot.getItemName() + ", ": "");
        return selectedItemsNames;
    }

    public void setSelectedItemsNames(String selectedItemsNames) {
        this.selectedItemsNames = selectedItemsNames;
    }

    public void prepareForInvoice(boolean isSubClass){
        if(!isSubClass) {
            getAdditonalPrice();
            setTotalPrice();
            getSelectedItemsNames();
        }
    }

    public void getInvoice(boolean isSubClass){
        if(!isSubClass) {
            prepareForInvoice(isSubClass);
        }
        System.out.println("======> You have ordered <=====");
        System.out.println("Burger Name: "+ burgerName);
        System.out.println("Burger Base Price: "+ burgerBasePrice);
        System.out.println("Additional Price: "+ additonalPrice);
        System.out.println("Additonal Items: "+ (selectedItemsNames.isBlank() || selectedItemsNames.isEmpty()?
                            "You didn't choose any additional item!" : selectedItemsNames));
        System.out.println("Total Price: "+ getTotalPrice());
        System.out.println();
    }
}
