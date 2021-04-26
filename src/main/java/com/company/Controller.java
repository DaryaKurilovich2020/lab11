package com.company;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet("/controller")
public class Controller extends HttpServlet {


    public void init() {

    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        String word = req.getParameter("word");
        int count = 0;
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(MyFile.file);
        while (matcher.find()) {
            count++;
        }

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html; charset=utf-8");
        out.println("<HTML><HEAD>");
        out.println("<TITLE>Result </TITLE>");
        out.println("</HEAD><BODY>");
        out.println("<P>Слово:");
        out.println(word);
        out.println("</P>");
        out.println("<P>Частота:");
        out.println(count);
        out.println("</P>");
        out.println("</BODY></HTML>");


    }

}