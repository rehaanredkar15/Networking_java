package networking_java;

import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;

public class soccli1 {

    public static void main(String[] args)  throws Exception
    {
      //  String ip = "localhost"; // here the ip of the client should written
      //  int port = 9999;
        Socket S = new Socket("127.0.0.1",1342); //here we create the socket and a object of socket class which is imported above

        String str = "Harshad"; //this is the string we will pass to the

        PrintStream os = new PrintStream(S.getOutputStream());  // this is used to convert the data into stream format this data is send
        // to outputport of socket(outputStream)
        PrintWriter out = new PrintWriter(os); //the actual data is sent by Printwriter , so PrintWriter object is created
         os.println(str); //the string is passed by the writer to the server side
         os.flush();
    }
}
