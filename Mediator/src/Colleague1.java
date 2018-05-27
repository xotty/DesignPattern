 public class Colleague1 extends AbstractColleague{
     public  Colleague1(AbstractMediator mediator){
        super(mediator);
     }
   public void selfMethod1(){
       System.out.println("完全可以自己处理的业务逻辑，运行自发方法：selfMethod1.....");

    }
     public void depdMehod1(){
         System.out.println("自己不能处理的业务逻辑委托给中介者处理，运行依赖方法：depdMehod1.....交给mediator.doSomthing1()");
         //自己不能处理的业务逻辑委托给中介者处理
         super.mediator.doSomthing1();

    }


}
