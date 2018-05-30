
abstract public class AbstractCommand {
    protected AbstractReceiver receiver;
    public AbstractCommand(AbstractReceiver _receiver){
        this.receiver=_receiver;
    }
    abstract public void excute();
}
