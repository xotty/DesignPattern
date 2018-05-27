public class Main_Mediator {

    public static void main(String[] args) {
        System.out.println("--------------------------中介者模式--------------------------");
        AbstractMediator mediator=new Mediator();
        Colleague1 colleague1=new Colleague1(mediator);
        colleague1.selfMethod1();
        colleague1.depdMehod1();
        System.out.println();
        Colleague2 colleague2=new Colleague2(mediator);
        colleague2.selfMethod2();
        colleague2.depdMehod2();
        System.out.println();
        Colleague3 colleague3=new Colleague3(mediator);
        colleague3.selfMethod3();
        colleague3.depdMehod3();
    }
}
