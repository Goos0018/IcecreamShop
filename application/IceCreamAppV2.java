package be.vdab.IceCreamShop.application;

import be.vdab.IceCreamShop.eatables.Eatable;
import be.vdab.IceCreamShop.eatables.Flavor;
import be.vdab.IceCreamShop.eatables.MagnumType;
import be.vdab.IceCreamShop.sellers.*;

import java.util.ArrayList;

public class IceCreamAppV2 {
    public static void main(String[] args) {

        PriceList priceList = new PriceList(1, 2, 4);
        Stock stock = new Stock(2, 10, 25, 7);
        IceCreamSeller iceCreamSeller = new IceCreamCar(priceList, stock);

        // Arraylist van Eatables
        ArrayList<Eatable> iceCream = new ArrayList<Eatable>();

        // Bestelling van enkele ijsjes
        iceCream.add(iceCreamSeller.orderIceRocket());
        iceCream.add(iceCreamSeller.orderIceRocket());
        iceCream.add(iceCreamSeller.orderIceRocket());
        iceCream.add(iceCreamSeller.orderIceRocket());
        iceCream.add(iceCreamSeller.orderMagnum(MagnumType.MILKCHOCOLATE));
        iceCream.add(iceCreamSeller.orderCone(Flavor.PISTACHE));

        // Eten van de bestelde ijsjes
        iceCream.eat();

        // Print van de opbrengst van de dag.
        System.out.println(iceCreamSeller.getProfit());
    }
}
