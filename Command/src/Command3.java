 public class Command3 extends AbstractCommand{
     public Command3(){
       super(new Receiver2());
     }
     @Override
     public void excute(){
         super.receiver=new Receiver1();
         super.receiver.query();
         super.receiver=new Receiver2();
         super.receiver.delete();
         super.receiver.rollback();
     }
}
