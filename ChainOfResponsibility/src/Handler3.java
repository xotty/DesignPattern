public class Handler3 extends AbstractHandler {
    protected String echo(Request request){
      return "Handler3---"+request.getRequest();
    }

    protected int getHandlerLevel(){
       return 3;
    }
}
