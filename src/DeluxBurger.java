public class DeluxBurger extends Hamburger {
    double additonalPrice;
    private Item chips = new Item("chip", 0.7);
    private Item drink = new Item("drink", 3);

    public DeluxBurger(String rollType, String meatType, double burgerPrice) {
        super("Delux Burger", rollType, meatType, burgerPrice);
        setAdditonalItems(true, true);
        setAdditonalItems(false, false, false);
    }

    @Override
    public void setAdditonalItems(boolean isLettuceAdd, boolean isTomatoAdd, boolean isCarrotAdd) {
        super.setAdditonalItems(false, false, false);
    }

    public void setAdditonalItems(boolean isChipsAdd, boolean isDrinkAdd){
        chips.setAdd(isChipsAdd);
        drink.setAdd(isDrinkAdd);
    }

    @Override
    public double getAdditonalPrice() {
        return additonalPrice;
    }

    public void setAdditonalPrice() {
        if(chips.getIsAdd())
            additonalPrice += chips.getItemPrice();
        if(drink.getIsAdd())
            additonalPrice += drink.getItemPrice();
        super.setAdditonalPrice(additonalPrice);
    }

    @Override
    public String getSelectedItemsNames() {
        String selectedItemNames =
                (chips.getIsAdd()? chips.getItemName() + ", " : "") +
                (drink.getIsAdd()? drink.getItemName() : "");
        return super.getSelectedItemsNames() + ", " + selectedItemNames;
    }

    @Override
    public void setSelectedItemsNames(String selectedItemsNames) {
        super.setSelectedItemsNames(getSelectedItemsNames());
    }
}