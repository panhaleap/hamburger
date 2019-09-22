public class Item {
    private String itemName;
    private double itemPrice;
    private boolean isAdd;

    public Item(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setAdd(boolean add) {
        isAdd = add;
    }

    public boolean getIsAdd() {
        return isAdd;
    }
}
