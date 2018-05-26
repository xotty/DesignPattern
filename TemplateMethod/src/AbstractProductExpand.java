abstract public class AbstractProductExpand {
    abstract public void method1();
    abstract public void method2();
    abstract public void method3();
    abstract public void method4();
    protected boolean willRunningMethod2(){return true;}

    final public void templateMethod(){
        method1();
        if (this.willRunningMethod2()) method2();
        method3();
        method4();
    }
}
