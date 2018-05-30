abstract public class AbstractHandler {
    private AbstractHandler nextHandler;
    public final String handle(Request request){
        String response=null;
        System.out.print(this.getHandlerLevel()+"----");
        if (this.getHandlerLevel()==request.getRequestLevel()){
            response=this.echo(request);
        }else{
            if(this.nextHandler!=null){
                response=this.nextHandler.handle(request);
            }else{
                response="该请求事项无人处理---"+request.getRequest();
            }
        }
        return response;
    }
    public void setNextHandler(AbstractHandler _handler){
        this.nextHandler=_handler;
    }
    abstract protected int getHandlerLevel();
    abstract protected String echo(Request request);

}
