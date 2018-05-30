public class Handler2 extends AbstractHandler {
    protected String echo(Request request){
      return "Handler2---"+request.getRequest();
    }

    protected int getHandlerLevel(){
       return 2;
    }
}
