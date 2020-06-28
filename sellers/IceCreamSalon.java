package be.vdab.IceCreamShop.sellers;

import be.vdab.IceCreamShop.eatables.*;

public class IceCreamSalon implements IceCreamSeller {

    private double totalProfit;
    private PriceList priceList;

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    @Override
    public Cone orderCone(Flavor[] flavors) {
        Cone newCone = new Cone(flavors);
        totalProfit += priceList.getBallPrice() * flavors.length;
        return newCone;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket newIceRocket = new IceRocket();
        totalProfit += priceList.getRocketPrice();
        return newIceRocket;
    }

    @Override
    public Magnum orderMagnum(MagnumType type) {
        Magnum newMagnum = new Magnum(type);
        totalProfit += priceList.getMagnumStandardPrice(type);
        return newMagnum;
    }


    @Override
    public double getProfit() {
        return totalProfit;
    }
}
