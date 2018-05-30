public class Handler1 extends AbstractHandler {
    protected String echo(Request request){
      return "Handler1---"+request.getRequest();
    }

    protected int getHandlerLevel(){
       return 1;
    }
}
