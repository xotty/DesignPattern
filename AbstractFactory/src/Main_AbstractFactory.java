public class Main_AbstractFactory {

    public static void main(String[] args) {
    System.out.println("--------------------------抽象工厂--------------------------");
        AbstractFactory factory1=new Factory1() ;
        AbstractFactory factory2=new Factory2() ;
        AbstractProductA productA1=factory1.createProductA();
        productA1.sharedMethod();
        productA1.individualMethod();
        System.out.println();
        AbstractProductA productA2=factory2.createProductA();
        productA2.sharedMethod();
        productA2.individualMethod();
        System.out.println();
        AbstractProductB productB1=factory1.createProductB();
        productB1.sharedMethod();
        productB1.individualMethod();
        System.out.println();
        AbstractProductB productB2=factory2.createProductB();
        productB2.sharedMethod();
        productB2.individualMethod();
    }
}
