public class Invoker {
    private AbstractCommand command;

    public void setCommand(AbstractCommand _command) {
        this.command = _command;
    }

    public void action(){
        this.command.excute();
    }
}
