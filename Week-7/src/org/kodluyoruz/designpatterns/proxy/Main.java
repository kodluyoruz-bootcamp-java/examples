package org.kodluyoruz.designpatterns.proxy;

public class Main {

    public static void main(String[] args) {
        Servlet servlet = new ProxyServlet("");
        servlet.doGet();
        servlet = new ProxyServlet("some condition");
        servlet.doGet();
    }
}
