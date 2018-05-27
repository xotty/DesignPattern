public class BuilderB extends AbstractBuilder {
    private AbstractProduct productB=new ProductB();

    public void setPart(){
        System.out.println("零部件创造中......");
        productB.setPart("PartB");
    }

    public AbstractProduct buildProduct(){
        System.out.println("具体产品创造中......"+"ProductB");
        return productB;
    }
}