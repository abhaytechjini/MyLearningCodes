package JavaLearning;

import java.net.InetAddress;

public class MainClass {

    public static void main(String[] args) throws Exception
    {
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println("The IP address is " + inetAddress.getHostAddress());
    }
}