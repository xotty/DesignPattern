
public class Factory2 extends AbstractFactory {
   public AbstractProductA createProductA(){
       System.out.println("具体产品创造中......"+"ProductA2");
       return new ProductA2();
   }
    public AbstractProductB createProductB(){
        System.out.println("具体产品创造中......"+"ProductB2");
        return new ProductB2();
    }
}
