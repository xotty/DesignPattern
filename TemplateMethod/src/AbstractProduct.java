abstract public class AbstractProduct {
    abstract public void method1();
    abstract public void method2();
    abstract public void method3();
    abstract public void method4();

    final public void templateMethod(){
        method1();
        method2();
        method3();
        method4();
    }
}
