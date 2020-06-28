package be.vdab.IceCreamShop.sellers;

import be.vdab.IceCreamShop.eatables.Magnum;
import be.vdab.IceCreamShop.eatables.MagnumType;

import static be.vdab.IceCreamShop.eatables.MagnumType.ALPINENUTS;
import static be.vdab.IceCreamShop.eatables.MagnumType.ROMANTICSTRAWBERRIES;

public class PriceList {

    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }


    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    //returns modified standarprize for special magnumtypes
    public double getMagnumStandardPrice(MagnumType type) {
        switch (type) {
            case ALPINENUTS:
                return magnumStandardPrice * 1.5;
            case ROMANTICSTRAWBERRIES:
                return magnumStandardPrice * 1.75;
            default:
                return magnumStandardPrice;
        }
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }
}

