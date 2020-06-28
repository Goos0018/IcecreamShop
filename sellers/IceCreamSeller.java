package be.vdab.IceCreamShop.sellers;

import be.vdab.IceCreamShop.eatables.*;

public interface IceCreamSeller extends Profitable {

    Cone orderCone(Flavor[] flavors);

    IceRocket orderIceRocket();

    Magnum orderMagnum(MagnumType type);


}
