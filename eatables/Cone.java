package be.vdab.IceCreamShop.eatables;

public class Cone implements Eatable {

    private Flavor[] balls;

    public Cone() {
    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    @Override
    public void eat() {
        System.out.println("I'm eating a cone with " + this.balls.toString());
    }

}
