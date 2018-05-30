public class Main_ChainOfResponsibility {

    public static void main(String[] args) {
    System.out.println("--------------------------责任链模式--------------------------");
        AbstractHandler handler1=new Handler1();
        AbstractHandler handler2=new Handler2();
        AbstractHandler handler3=new Handler3();
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        String result=handler1.handle(new Request(1,"request1"));
        System.out.println(result);
        System.out.println();
        result=handler1.handle(new Request(2,"request2"));
        System.out.println(result);
        System.out.println();
        result=handler1.handle(new Request(3,"request3"));
        System.out.println(result);
        System.out.println();
        result=handler1.handle(new Request(4,"request4"));
        System.out.println(result);

    }
}
