
public class MultipleFactoryA extends AbstractMutipleFactory {
   public AbstractProduct createProduct(){
       System.out.println("具体产品创造中......"+"ProductA");
       return new ProductA();
   }
}
