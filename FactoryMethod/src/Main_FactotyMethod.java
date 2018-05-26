public class Main_FactotyMethod {

    public static void main(String[] args) {
    System.out.println("--------------------------工厂方法--------------------------");
        AbstractFactory factory=new Factory() ;
        AbstractProduct productA=factory.createProduct(ProductA.class);
        productA.sharedMethod();
        productA.individualMethod();
        System.out.println();
        AbstractProduct productB=factory.createProduct(ProductB.class);
        productB.sharedMethod();
        productB.individualMethod();
    System.out.println("--------------------------简单工厂--------------------------");
        productA=SimpleFactory.createProduct(ProductA.class);
        productA.sharedMethod();
        productA.individualMethod();
        System.out.println();
        productB=SimpleFactory.createProduct(ProductB.class);
        productB.sharedMethod();
        productB.individualMethod();
        System.out.println("--------------------------多工厂--------------------------");
        productA=new MultipleFactoryA().createProduct();
        productA.sharedMethod();
        productA.individualMethod();
        System.out.println();
        productB=new MultipleFactoryB().createProduct();
        productB.sharedMethod();
        productB.individualMethod();
    }
}
