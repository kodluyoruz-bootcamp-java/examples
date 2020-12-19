package org.kodluyoruz.designpatterns.proxy;

public class ProxyServlet implements Servlet {

    private String someCondition;
    private Servlet servlet;

    public ProxyServlet(String someCondition) {
        this.someCondition = someCondition;
        servlet = new RealServlet();
    }


    @Override
    public void doGet() {
        if ("".equals(someCondition)) {
            System.out.println("You can not process doGet");
            return;
        }
        servlet.doGet();
    }
}
