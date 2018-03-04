package Question1;

import Question1.Items;

import java.util.ArrayList;
import java.util.List;

public class Purchase {
    public static void main(String args[]){
        float totalAmount, idInterest, nstInterest, nIdInterest = 0f;
        float nonStAmount, stAmount, totalNonStAmount = 0f;
        float totalStAmount = 0f;
        List<Items> itemList = new ArrayList<Items>();
        Items item1 = new Items("Book", 1, 12.49f);
        Items item2 = new Items("Music CD", 1, 14.99f);
        Items item3 = new Items("Chocolate", 1, 0.85f);
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        for(Items item : itemList){
           // System.out.println(item.getItem()+" "+item.getPrice()+" "+item.getQuantity());
            if(item.getItem().compareTo("Book") == 0 ||
                item.getItem().compareTo("Medicine") == 0 ||
                item.getItem().compareTo("Food") == 0){
                nonStAmount = item.getQuantity() * item.getPrice();
                idInterest = Math.round((5 * nonStAmount) / 100);                            // For Import Duty
                totalNonStAmount = totalNonStAmount + nonStAmount + idInterest;
                float itemTotalPrice = nonStAmount + idInterest;
                item.setTotalItemPrice(itemTotalPrice);
                /*System.out.println(totalNonStAmount);*/
            } else {
                stAmount = item.getQuantity() * item.getPrice();
                nstInterest = Math.round((10 * stAmount) / 100);                            // For Sales Tax
                nIdInterest = Math.round((5 * nstInterest) / 100);                          // For Import Duty
                totalStAmount = totalStAmount + stAmount + nstInterest + nIdInterest;
                float itemTotalPrice = stAmount + nstInterest + nIdInterest;
                item.setTotalItemPrice(itemTotalPrice);
            }
        }
        for(Items item : itemList){
            if(item.getItem().compareTo("Book") == 0 ||
                    item.getItem().compareTo("Medicine") == 0 ||
                    item.getItem().compareTo("Food") == 0) {
                System.out.println(item.getItem() + "\t\t\t" + item.getQuantity() + "\t" + totalNonStAmount);
            } else {
                System.out.println(item.getItem() + "\t\t" + item.getQuantity() + "\t" + item.getTotalItemPrice());
            }
        }
        totalAmount = totalNonStAmount + totalStAmount;
        System.out.println("Total Amount "+"\t\t"+totalAmount);
    }
}
