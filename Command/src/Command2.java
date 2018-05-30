 public class Command2 extends AbstractCommand{
     public Command2(){
       super(new Receiver2());
     }
     public Command2(AbstractReceiver _receiver){
         super(_receiver);
     }
     private  AbstractReceiver receiver1=new Receiver1();
     private  AbstractReceiver receiver2=new Receiver2();
     @Override
     public void excute(){
         receiver1.query();
         receiver2.delete();
         super.receiver.rollback();
     }
}
