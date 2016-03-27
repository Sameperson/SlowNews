package com.sameperson.newswebsite.servlets;

import com.sameperson.newswebsite.model.NewsList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("")
public class NewsMainServlet extends HttpServlet {

    private volatile NewsList newsList;

    @Override
    public void init() throws ServletException {
        super.init();
        newsList = NewsList.getInstance();
        System.out.println("SingleNewsServlet initialized");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/main.jsp");

        NewsList newsList = NewsList.getInstance();

        System.out.println(req.getPathInfo());

        req.setAttribute("newsList", newsList.getList());
        System.out.println(newsList);
        requestDispatcher.forward(req, resp);

    }
}
