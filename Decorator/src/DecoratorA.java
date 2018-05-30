 public class DecoratorA  extends AbstractDecorator{

    public DecoratorA(AbstractComponent _component){
        super(_component);
    }

    private void methodA(){
        System.out.println("执行DecoratorA的装饰方法methodA");
    }
    public void operate(){
        this.methodA();
        super.operate();
    }
}
