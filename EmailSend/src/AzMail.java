import java.io.*;
import java.net.*;
class AzMail {

  public static void main(String argv[]) throws Exception
    {
         Socket s=new Socket("localhost",25);
          PrintWriter   os = new PrintWriter(s.getOutputStream(),true);
          
              BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
              
                os.println("HELO " + "cse.ru");
                System.out.println( "Response1: " + br.readLine());
               //while (!br.readLine().endsWith ("DSN"))
                 //   {              //  System.out.println( " " + br.readLine());

                 //   }
                
                os.println("MAIL FROM:"+ "abc@cse.ru");
                System.out.println( "Response2: " + br.readLine());
                
                os.println("RCPT TO:"+ "abirru@cse.ru");
                System.out.println( "Response3: " + br.readLine());
                             //   System.out.println( "Response1: " + br.readLine());

              os.println("DATA");
                System.out.println( "Response4: " + br.readLine());
                
                os.println("Subject: My Message");
                os.println();
                os.println("Hello Bangladesh.");
                os.println();
                os.println(".");
                
                System.out.println( "Response5: " + br.readLine());
                      
                os.println("QUIT");
                System.out.println( "Response6: " + br.readLine());
                
                                System.out.println( "Response7: " + br.readLine());
    }
}