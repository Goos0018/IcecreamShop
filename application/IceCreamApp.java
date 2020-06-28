package be.vdab.IceCreamShop.application;

import be.vdab.IceCreamShop.eatables.*;
import be.vdab.IceCreamShop.sellers.IceCreamSalon;
import be.vdab.IceCreamShop.sellers.IceCreamSeller;
import be.vdab.IceCreamShop.sellers.PriceList;

import java.util.ArrayList;

public class IceCreamApp {
    public static void main(String[] args) {

        PriceList priceList = new PriceList(1, 2, 4);
        IceCreamSeller iceCreamSeller = new IceCreamSalon(priceList);

        // Arraylist van Eatables
        ArrayList<Eatable> iceCream = new ArrayList<Eatable>();

        // Bestelling van enkele ijsjes
        iceCream.add(iceCreamSeller.orderIceRocket());
        iceCream.add(iceCreamSeller.orderMagnum(MagnumType.MILKCHOCOLATE));
        iceCream.add(iceCreamSeller.orderCone(Flavor.PISTACHE));

        // Eten van de bestelde ijsjes
        iceCream.eat();

        // Print van de opbrengst van de dag.
        System.out.println(iceCreamSeller.getProfit());
    }
}
