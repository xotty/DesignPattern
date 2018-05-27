
public class BuilderA extends AbstractBuilder {
    private AbstractProduct productA=new ProductA();

    public void setPart(){
        System.out.println("零部件创造中......");
        productA.setPart("PartA");
    }

   public AbstractProduct buildProduct(){
       System.out.println("具体产品创造中......"+"ProductA");
       return productA;
   }
}
