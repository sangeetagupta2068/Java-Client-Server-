package network;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


    public class Server
    {
          Socket clientSocket;
          ServerSocket serverSocket;

          Server() throws IOException
          {
                  serverSocket=new ServerSocket(1527);
          }
          void readFromClient() throws IOException
          {
                  connectToClient();

                  System.out.println("Connection established!");

                  System.out.println("-------Client details:-------");
                  System.out.println("Port number: " + clientSocket.getPort());
                  System.out.println("Local address: " + clientSocket.getLocalSocketAddress());

                  clientSocket.close();

          }

          void connectToClient() throws IOException
          {
                  clientSocket=serverSocket.accept();

          }

          public static void main(String... args)
          {

                    try
                    {
                          Server server=new Server();
                          server.readFromClient();
                        }

                    catch(IOException io)
                    {
                          System.out.println("Sorry!" + io);
                      }
          }
    }
