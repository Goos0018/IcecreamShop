package be.vdab.IceCreamShop.sellers;

import be.vdab.IceCreamShop.application.NoMoreIceCreamException;
import be.vdab.IceCreamShop.eatables.*;

public class IceCreamCar implements IceCreamSeller {

    private PriceList pricelist;
    private Stock stock;
    private double profit;

    public IceCreamCar(PriceList pricelist, Stock stock) {
        this.pricelist = pricelist;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Flavor[] flavors) throws NoMoreIceCreamException {
        if (stock.getBalls() > 0 && stock.getCones() > 0) {
            Cone newCone = new Cone(flavors);
            profit += pricelist.getBallPrice() * flavors.length;
            stock.setCones(stock.getCones() - 1);
            stock.setBalls(stock.getBalls() - flavors.length);
            return newCone;
        } else throw new NoMoreIceCreamException("Sorry, we zitten zonder hoorntjes en/of bollen.");
    }

    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException {
        if (stock.getIceRockets() > 0) {
            IceRocket newIceRocket = new IceRocket();
            profit += pricelist.getRocketPrice();
            stock.setIceRockets(stock.getIceRockets()-1);
            return newIceRocket;
        } else throw new NoMoreIceCreamException("Sorry, al onze Ice Rockets zijn uitverkocht.");
    }

    @Override
    public Magnum orderMagnum(MagnumType type) throws NoMoreIceCreamException {
        if (stock.getMagni() > 0) {
            Magnum newMagnum = new Magnum(type);
            profit += pricelist.getMagnumStandardPrice(type);
            stock.setMagni(stock.getMagni()-1);
            return newMagnum;
        } else throw new NoMoreIceCreamException("Sorry, al onze magnums zijn uitverkocht.");
    }

    @Override
    public double getProfit() {
        return profit;
    }
}