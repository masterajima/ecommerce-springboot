package.com.educative.ecommerce.common;
//package for current date and time
import java.time.localDateTime;
//create helepr class that return response to  api
public class ApiResponse{
    //constructor apiresponse to inialize object
    public ApiResponse(boolean sucess, String msg){
        //if api return inialize sucess
        this.sucess=sucess;
        this.msg=msg;
    }
    //if api respond the message
    public boolean isSuccess(){
        return sucess;
    }
    //print message if api respond
    public String getMessage(){
        return message
    }
    //
    public String getTimestamp(){
        //print curent date and time
return localDateTime.Now.toString();
    }
}