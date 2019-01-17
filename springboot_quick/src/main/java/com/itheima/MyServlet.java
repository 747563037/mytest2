package com.itheima;

import org.springframework.boot.web.servlet.ServletComponentScan;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/my/servlet")
@ServletComponentScan(basePackages = "com.itheima")

public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //开启异步请求
        AsyncContext asyncContext = req.startAsync();

        asyncContext.start(()->{

            try {
                resp.getWriter().print("hello World");

                //触发完成
                asyncContext.complete();
            } catch (IOException e) {
                e.printStackTrace();

            }


        });


    }
}
