package com.sameperson.newswebsite;

import com.sameperson.newswebsite.model.NewsList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/news")
public class NewsMainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/main.jsp");

        NewsList newsList = new NewsList();
        newsList.addNews("Something happened! Something that deserves to tell in the news!", "Text");
        newsList.addNews("Something else happened!", "Text");

        req.setAttribute("newsList", newsList.getList());


        requestDispatcher.forward(req, resp);

    }
}
