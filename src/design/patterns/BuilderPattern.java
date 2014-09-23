package design.patterns;


public class BuilderPattern {
    public static void main(String args[]) {
        //Creating object using Builder pattern in java
        Cake whiteCake = new Cake.Builder().sugar(1).butter(0.5).eggs(2).vanila(2).build();
        //Cake is ready to eat :)
        System.out.println(whiteCake);
    }
}

class Cake {

    private final double sugar;   //cup
    private final double butter;  //cup
    private final int eggs;
    private final int vanila;     //spoon

    static class Builder {

        private double sugar;   //cup
        private double butter;  //cup
        private int eggs;
        private int vanila;     //spoon

        //builder methods for setting property
        public Builder sugar(double cup){this.sugar = cup; return this; }
        public Builder butter(double cup){this.butter = cup; return this; }
        public Builder eggs(int number){this.eggs = number; return this; }
        public Builder vanila(int spoon){this.vanila = spoon; return this; }
      
      
        //return fully build object
        public Cake build() {
            return new Cake(this);
        }
    }

    //private constructor to enforce object creation through builder
    private Cake(Builder builder) {
        this.sugar = builder.sugar;
        this.butter = builder.butter;
        this.eggs = builder.eggs;
        this.vanila = builder.vanila;
    }

    @Override
    public String toString() {
        return "Cake{" + "sugar=" + sugar + ", butter=" + butter + ", eggs=" + eggs + ", vanila=" + vanila + '}';

    } 
  
}
