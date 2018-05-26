public class MultipleFactoryB extends AbstractMutipleFactory {

    public AbstractProduct createProduct() {
        System.out.println("具体产品创造中......" + "ProductB");
        return new ProductB();

    }
}
