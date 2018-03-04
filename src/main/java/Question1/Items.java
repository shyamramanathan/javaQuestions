package Question1;

public class Items {
    private String item;
    private Integer quantity;
    private Float price;
    private Float totalItemPrice;

    public String getItem(){
        return item;
    }

    public void setItem(String item){
        this.item = item;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    public Float getPrice(){
        return price;
    }

    public void setPrice(Float price){
        this.price = price;
    }

    public Float getTotalItemPrice(){
        return totalItemPrice;
    }

    public void setTotalItemPrice(Float totalItemPrice){
        this.totalItemPrice = totalItemPrice;
    }

    Items(String item, Integer quantity, Float price){
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }
}
