abstract public class AbstractFactory {
    abstract public <T extends AbstractProduct> T createProduct(Class<T> c);
}
