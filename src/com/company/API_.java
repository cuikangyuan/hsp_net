package com.company;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {

    public static void main(String[] args) throws UnknownHostException {


        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
    }
}
