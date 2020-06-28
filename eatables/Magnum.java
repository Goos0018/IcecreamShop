package be.vdab.IceCreamShop.eatables;

public class Magnum implements Eatable {

    private MagnumType type;

    public Magnum() {
    }

    public Magnum(MagnumType type) {
        this.type = type;
    }

    public MagnumType getType() {
        return type;
    }

    @Override
    public void eat() {
        System.out.println("Njomjnom, i'm eating a Magnum with " + this.type + " flavor.");
    }


}