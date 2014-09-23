package design.patterns;


interface Sandwich {
    public String make();
}

class BasicSandwich implements Sandwich {

    @Override
    public String make() {
        return "Chleb";
    }
    
}

abstract class SandwichDecorator implements Sandwich {
    private Sandwich sandwichDecoration;
    
    public SandwichDecorator(Sandwich sandwichDecoration) {
        this.sandwichDecoration = sandwichDecoration;
    }
    
    @Override
    public String make() {
        return sandwichDecoration.make();
    }
}

class ButterDecorator extends SandwichDecorator {

    public ButterDecorator(Sandwich sandwichDecoration) {
        super(sandwichDecoration);
    }

    @Override
    public String make() {
        return super.make() + " + maslo";
    }
}

class HamDecorator extends SandwichDecorator {

    public HamDecorator(Sandwich sandwichDecoration) {
        super(sandwichDecoration);
    }

    @Override
    public String make() {
        return super.make() + " + szynka";
    }
}

public class DecoratorPattern {
    public static void main (String[] args) {
        Sandwich sandwich = new HamDecorator(new ButterDecorator(new BasicSandwich()));
        String result = sandwich.make();
        System.out.println(result);
    }
}
