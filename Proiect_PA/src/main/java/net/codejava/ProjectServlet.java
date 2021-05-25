package net.codejava;

import com.example.Form;
import com.example.MusicDBMS;
import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Record;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.Transaction;
import org.neo4j.driver.TransactionWork;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;


import static java.lang.Integer.parseInt;


@WebServlet(value = "/getPlaylist")
public class ProjectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Form form = new Form();

        form.setFirstGenre(request.getParameter("firstGenre"));
        form.setSecondGenre(request.getParameter("secondGenre"));
        form.setThirdGenre(request.getParameter("thirdGenre"));
        form.setExplicit(request.getParameter("explicit"));
        form.setDecade(request.getParameter("decade"));


        MusicDBMS music = new MusicDBMS();
        String [][] firstSetOfSongs = music.songsByFirstGenre(form);
        String [][] secondSetOfSongs = music.songsBySecondGenre(form);
        String [][] thirdSetOfSongs = music.songsByThirdGenre(form);

        request.setAttribute("firstSetOfSongs", firstSetOfSongs);
        request.setAttribute("secondSetOfSongs", secondSetOfSongs);
        request.setAttribute("thirdSetOfSongs", thirdSetOfSongs);
        request.getRequestDispatcher("playlist.jsp").forward(request,response);
    }
}
