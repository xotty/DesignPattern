
public class Factory1 extends AbstractFactory {
   public AbstractProductA createProductA(){
       System.out.println("具体产品创造中......"+"ProductA1");
       return new ProductA1();
   }
    public AbstractProductB createProductB(){
        System.out.println("具体产品创造中......"+"ProductB1");
        return new ProductB1();
    }
}
