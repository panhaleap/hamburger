public class HealthyBurger extends Hamburger {
    private Item redOnion = new Item("red onion", 1);
    private Item parsley = new Item("parsley", 0.1);
    private double additonalPrice;

    public HealthyBurger(String meatType, double burgerPrice) {
        super("Healthy Burger", "Brown Rye Bread", meatType, burgerPrice);
    }

    public void setAdditonalItems(boolean isLettuceAdd, boolean isTomatoAdd, boolean isCarrotAdd, boolean isRedOnionAdd, boolean isParsleyAdd){
        redOnion.setAdd(isRedOnionAdd);
        parsley.setAdd(isParsleyAdd);
        super.setAdditonalItems(isLettuceAdd, isTomatoAdd, isCarrotAdd);
    }

    public void setAdditonalPrice() {
        if(redOnion.getIsAdd())
            additonalPrice += redOnion.getItemPrice();
        if(parsley.getIsAdd())
            additonalPrice += parsley.getItemPrice();
        additonalPrice += super.getAdditonalPrice();
        super.setAdditonalPrice(additonalPrice);
    }

    @Override
    public String getSelectedItemsNames() {
        String selectedItemNames =
                (redOnion.getIsAdd()? redOnion.getItemName() + ", " : "") +
                (parsley.getIsAdd()? parsley.getItemName() : "");
        return super.getSelectedItemsNames() + ", " + selectedItemNames;
    }

    @Override
    public void setSelectedItemsNames(String selectedItemsNames) {
        super.setSelectedItemsNames(getSelectedItemsNames());
    }

    @Override
    public double getAdditonalPrice() {
        return additonalPrice;
    }
}
