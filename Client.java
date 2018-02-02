package network;


import java.io.IOException;
import java.net.Socket;


    public class Client
    {
          Client() throws IOException
          {
                 Socket clientSocket=new Socket("localhost",1527);
          }

          public static void main(String... args)
          {

                  try
                  {
                        Client client=new Client();
                    }

                  catch(IOException io)
                  {

                        System.out.println("Sorry! " + io);

                    }

          }
    }
