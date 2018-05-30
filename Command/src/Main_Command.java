public class Main_Command {

    public static void main(String[] args) {
    System.out.println("--------------------------命令模式--------------------------");
        Invoker invoker=new Invoker();

        AbstractCommand command=new Command1();
        invoker.setCommand(command);
        invoker.action();
        System.out.println();

        command=new Command2(new Receiver1());
        invoker.setCommand(command);
        invoker.action();
        System.out.println();

        command=new Command3();
        invoker.setCommand(command);
        invoker.action();

    }
}
