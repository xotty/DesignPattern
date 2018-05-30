public class Request implements RequestInterface{

   private int level=0;
   private String  request="";
   public Request(int _level, String _request){
        this.level=_level;
        this.request=_request;
    }
   public int getRequestLevel(){
        return this.level;
    }
    public String  getRequest(){
       return this.request;

    }
}
