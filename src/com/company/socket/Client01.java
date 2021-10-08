package com.company.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client01 {
    public static void main(String[] args) throws IOException {


        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("client socket = " + socket);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello server".getBytes());
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, readLen));
        }

        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
