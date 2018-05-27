 public class Mediator extends AbstractMediator{
   public void doSomthing1(){
       System.out.println("处理与其它对象关系的业务逻辑，运行中介者协调方法：doSomething1.....");
       super.colleague2.selfMethod2();
       super.colleague3.selfMethod3();
    }
     public void doSomthing2(){
         System.out.println("处理与其它对象关系的业务逻辑，运行中介者协调方法：doSomething2.....");
         super.colleague1.selfMethod1();
         super.colleague3.selfMethod3();
    }
    public void doSomthing3(){
        System.out.println("处理与其它对象关系的业务逻辑，运行中介者协调方法：doSomething3.....");
        super.colleague1.selfMethod1();
        super.colleague2.selfMethod2();
    }
}
