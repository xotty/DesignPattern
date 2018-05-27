 public class Colleague3 extends AbstractColleague{
   public Colleague3(AbstractMediator mediator){
        super(mediator);
     }
   public void selfMethod3(){
       System.out.println("完全可以自己处理的业务逻辑，运行自发方法：selfMethod3.....");
    }
     public void depdMehod3(){
         System.out.println("自己不能处理的业务逻辑委托给中介者处理，运行依赖方法：depdMehod3.....交给mediator.doSomthing3()");
         //自己不能处理的业务逻辑委托给中介者处理
         super.mediator.doSomthing3();
    }
}
