 public class Command1 extends AbstractCommand{
     public Command1(){
       super(new Receiver1());
     }
     public Command1(AbstractReceiver _receiver){
         super(_receiver);
     }
     @Override
     public void excute(){
         super.receiver.add();
         super.receiver.change();
         super.receiver.delete();
     }
}
