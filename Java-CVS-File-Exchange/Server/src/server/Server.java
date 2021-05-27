package server;

import java.net.*;
import java.io.*;
import java.util.logging.Logger;

/*
    Erol A'NIL 
    30023737
*/

public class Server {

    private static Logger log = Logger.getLogger(Server.class.getName());

    private static final int SERVER_PORT = 1234;

    private static final String FILE_PATH = "file\\Movies.csv";

    public ServerSocket createServerSocket(int port) throws Exception {

        return new ServerSocket(SERVER_PORT);
    }

    public boolean acceptAll(ServerSocket serverSocket, String filePath) {
        try {
            
    }

    public static void main(String[] args) throws Exception {
        
       
    }
}
