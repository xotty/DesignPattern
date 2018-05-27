public class Director {
    private AbstractBuilder builderA=new BuilderA();
    public AbstractProduct getProductA(){
        builderA.setPart();
        return builderA.buildProduct();
    }

    private AbstractBuilder builderB=new BuilderB();
    public AbstractProduct getProductB(){
        builderB.setPart();
        return builderB.buildProduct();
    }
}
