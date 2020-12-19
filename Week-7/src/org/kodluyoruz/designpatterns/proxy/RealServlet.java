package org.kodluyoruz.designpatterns.proxy;

public class RealServlet implements Servlet {

    @Override
    public void doGet() {
        System.out.println("Im a real servlet, I'm gonna process get request");
    }
}
