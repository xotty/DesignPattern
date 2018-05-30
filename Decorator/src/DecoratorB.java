 public class DecoratorB extends AbstractDecorator{

    public DecoratorB(AbstractComponent _component){
        super(_component);
    }

    private void methodB(){
        System.out.println("执行DecoratorB的装饰方法methodB");
    }
    public void operate(){
        this.methodB();
        super.operate();
    }
}
