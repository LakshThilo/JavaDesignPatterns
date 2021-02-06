package lak.designPatterns.behavioral.mediatorPattern.ecommerceBuyingandSelling.after;

import java.util.HashMap;

public class ECommerceSite {

    private HashMap<String, Integer> stock;

    public ECommerceSite() {
        stock = new HashMap<>();
        stock.put("pens",100);
        stock.put("pencils",50);
        stock.put("erasers",75);
    }

    public boolean cheInStock(String item, int quantity) {
        if(stock.containsKey(item) && stock.get(item) > quantity) {
            return true;
        } else {
            if(!stock.containsKey(item)){
                System.out.println("Does not have item in the stock, sorry!");
                return false;
            }else{
                System.out.println("Don't have enough items in the stock");
                return false;
            }
        }
    }

    public void sell(String item, int quantity) {

        int newQuantity = stock.get(item) - quantity;
        stock.put(item, newQuantity);

    }
}
