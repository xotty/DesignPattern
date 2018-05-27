 public class Colleague2 extends AbstractColleague{
   public Colleague2(AbstractMediator mediator){
        super(mediator);
     }
   public void selfMethod2(){
       System.out.println("完全可以自己处理的业务逻辑，运行自发方法：selfMethod2.....");
    }
     public void depdMehod2(){
         System.out.println("自己不能处理的业务逻辑委托给中介者处理，运行依赖方法：depdMehod2.....交给mediator.doSomthing2()");
         //自己不能处理的业务逻辑委托给中介者处理
         super.mediator.doSomthing2();
    }
}
