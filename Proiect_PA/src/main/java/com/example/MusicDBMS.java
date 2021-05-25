package com.example;
import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Record;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.Transaction;
import org.neo4j.driver.TransactionWork;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public class MusicDBMS {

    Driver driver ;


    public MusicDBMS() {

        driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "password"));
    }


    public String [][] songsByFirstGenre(Form form) {

        Session session = driver.session();

        String name = form.getFirstGenre();
        String explicit =form.getExplicit();
        String decade = form.getDecade();

        Map<String,Object> params = new HashMap<>();
        params.put( "name", name );
        params.put( "explicit", explicit );
        params.put( "decade", decade);

       String query = "MATCH " + "\n" +
                "(:Genre {name: $name})--(song:Song) " + "\n" +
                "MATCH " + "\n" +
                "(:Explicit {explicit: $explicit})--(song:Song) " + "\n" +
                "MATCH " +"\n" +
                "(:Decade {decade: $decade})--(song:Song) " +"\n" +
                "RETURN song.title,song.artist";

        Result result = session.run(query,params);
        List<Record> songRecords = result.list();

        int iter = 0;
        String [][] songs = new String[songRecords.size()][2];
        for(Record record : songRecords){
                songs[iter][0] = record.get("song.title").asString();
                songs[iter][1] = record.get("song.artist").asString();
                iter++;
            }
        return songs;
        }

    public String [][] songsBySecondGenre(Form form) {

        Session session = driver.session();

        String name = form.getSecondGenre();
        String explicit =form.getExplicit();
        String decade = form.getDecade();

        Map<String,Object> params = new HashMap<>();
        params.put( "name", name );
        params.put( "explicit", explicit );
        params.put( "decade", decade);

        String query = "MATCH " + "\n" +
                "(:Genre {name: $name})--(song:Song) " + "\n" +
                "MATCH " + "\n" +
                "(:Explicit {explicit: $explicit})--(song:Song) " + "\n" +
                "MATCH " +"\n" +
                "(:Decade {decade: $decade})--(song:Song) " +"\n" +
                "RETURN song.title,song.artist";

        Result result = session.run(query,params);
        List<Record> songRecords = result.list();

        int iter = 0;
        String [][] songs = new String[songRecords.size()][2];
        for(Record record : songRecords){
            songs[iter][0] = record.get("song.title").asString();
            songs[iter][1] = record.get("song.artist").asString();
            iter++;
        }
        return songs;
    }

    public String [][] songsByThirdGenre(Form form) {

        Session session = driver.session();

        String name = form.getThirdGenre();
        String explicit =form.getExplicit();
        String decade = form.getDecade();

        Map<String,Object> params = new HashMap<>();
        params.put( "name", name );
        params.put( "explicit", explicit );
        params.put( "decade", decade);

        String query = "MATCH " + "\n" +
                "(:Genre {name: $name})--(song:Song) " + "\n" +
                "MATCH " + "\n" +
                "(:Explicit {explicit: $explicit})--(song:Song) " + "\n" +
                "MATCH " +"\n" +
                "(:Decade {decade: $decade})--(song:Song) " +"\n" +
                "RETURN song.title,song.artist";

        Result result = session.run(query,params);
        List<Record> songRecords = result.list();

        int iter = 0;
        String [][] songs = new String[songRecords.size()][2];
        for(Record record : songRecords){
            songs[iter][0] = record.get("song.title").asString();
            songs[iter][1] = record.get("song.artist").asString();
            iter++;
        }
        return songs;
    }

}
