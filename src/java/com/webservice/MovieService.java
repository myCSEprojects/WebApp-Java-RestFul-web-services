/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webservice;

import com.pojo.Movie;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.Consumes;
import javax.ws.rs.PathParam;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author amitabh
 */
@Path("/movieservice")
public class MovieService {
           
            String url = "jdbc:mysql://uml.cs.uga.edu:3306/eit7";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "eit7";
            String password = "corba";
            
//            String url = "jdbc:mysql://localhost:3306/eip7";
//            String driver = "com.mysql.jdbc.Driver";
//            String userName = "root";
//            String password = "root";
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("movies")
    public Response getMovies(){
        List<Movie> list = new ArrayList();
        try
            {
                Class.forName(driver).newInstance();
                Connection conn = DriverManager.getConnection(url,userName,password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from Movie");
                 while(resultSet.next()){
                    Movie movie = new Movie();
                    movie.setMovieName(resultSet.getString("moviename"));
                    movie.setTheaterName(resultSet.getString("theatername"));
                    movie.setAddress(resultSet.getString("address"));
                    movie.setDirector(resultSet.getString("director"));
                    movie.setCast(resultSet.getString("cast"));
                    movie.setMovRating(resultSet.getString("movrating"));
                    movie.setRating(resultSet.getString("rating"));
                    movie.setGenre(resultSet.getString("genre"));
                    movie.setProduction(resultSet.getString("production"));
                    movie.setOverview(resultSet.getString("overview"));
                    movie.setShowTiming(resultSet.getString("showtiming"));
                    
                    list.add(movie); 
                  }
                resultSet.close();
                conn.close();
                System.out.println("Disconnected from database");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        String response = toJSONString(list);
        return Response.ok(response).build();
    }
    
  
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("movietheater/{name}")
    public Response getMoviesThe(@PathParam("name")String movieThe){
        List<Movie> list = new ArrayList();
        try
            {
                Class.forName(driver).newInstance();
                Connection conn = DriverManager.getConnection(url,userName,password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from Movie where theatername = '"+movieThe+"'");
                 while(resultSet.next()){
                    Movie movie = new Movie();
                    movie.setMovieName(resultSet.getString("moviename"));
                    movie.setTheaterName(resultSet.getString("theatername"));
                    movie.setAddress(resultSet.getString("address"));
                    movie.setDirector(resultSet.getString("director"));
                    movie.setCast(resultSet.getString("cast"));
                    movie.setMovRating(resultSet.getString("movrating"));
                    movie.setRating(resultSet.getString("rating"));
                    movie.setGenre(resultSet.getString("genre"));
                    movie.setProduction(resultSet.getString("production"));
                    movie.setOverview(resultSet.getString("overview"));
                    movie.setShowTiming(resultSet.getString("showtiming"));
                    
                    list.add(movie); 
                  }
                resultSet.close();
                conn.close();
                System.out.println("Disconnected from database");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        String response = toJSONString(list);
        return Response.ok(response).build();
    }
            
            
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("movierating/{name}")
    public Response getMoviesRat(@PathParam("name")String movieRat){
        List<Movie> list = new ArrayList();
        try
            {
                Class.forName(driver).newInstance();
                Connection conn = DriverManager.getConnection(url,userName,password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from Movie where rating = '"+movieRat+"'");
                 while(resultSet.next()){
                    Movie movie = new Movie();
                    movie.setMovieName(resultSet.getString("moviename"));
                    movie.setTheaterName(resultSet.getString("theatername"));
                    movie.setAddress(resultSet.getString("address"));
                    movie.setDirector(resultSet.getString("director"));
                    movie.setCast(resultSet.getString("cast"));
                    movie.setMovRating(resultSet.getString("movrating"));
                    movie.setRating(resultSet.getString("rating"));
                    movie.setGenre(resultSet.getString("genre"));
                    movie.setProduction(resultSet.getString("production"));
                    movie.setOverview(resultSet.getString("overview"));
                    movie.setShowTiming(resultSet.getString("showtiming"));
                    
                    list.add(movie); 
                  }
                resultSet.close();
                conn.close();
                System.out.println("Disconnected from database");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        String response = toJSONString(list);
        return Response.ok(response).build();
    }
            
            
    
    
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("moviegen/{name}")
    public Response getMoviesGen(@PathParam("name")String moviegen){
        List<Movie> list = new ArrayList();
        try
            {
                Class.forName(driver).newInstance();
                Connection conn = DriverManager.getConnection(url,userName,password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from Movie where genre = '"+moviegen+"'");
                 while(resultSet.next()){
                    Movie movie = new Movie();
                    movie.setMovieName(resultSet.getString("moviename"));
                    movie.setTheaterName(resultSet.getString("theatername"));
                    movie.setAddress(resultSet.getString("address"));
                    movie.setDirector(resultSet.getString("director"));
                    movie.setCast(resultSet.getString("cast"));
                    movie.setMovRating(resultSet.getString("movrating"));
                    movie.setRating(resultSet.getString("rating"));
                    movie.setGenre(resultSet.getString("genre"));
                    movie.setProduction(resultSet.getString("production"));
                    movie.setOverview(resultSet.getString("overview"));
                    movie.setShowTiming(resultSet.getString("showtiming"));
                    
                    list.add(movie); 
                  }
                resultSet.close();
                conn.close();
                System.out.println("Disconnected from database");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        String response = toJSONString(list);
        return Response.ok(response).build();
    }
    
    
   
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path ("movie")
    public Response createNewMovie(String payload){
         Movie movie = fromJSON(payload);
         String qry ="";
        String returnCode ="";
        String movieName    =        movie.getMovieName();
        String movrating    =        movie.getMovRating();
        String cast         =        movie.getCast();
        String director     =        movie.getDirector();
        String rating       =        movie.getRating();
        String genre        =        movie.getGenre();
        String production   =        movie.getProduction();
        String overview     =        movie.getOverview();
        String theatername  =        movie.getTheaterName();
        String address      =        movie.getAddress();
        String showtiming   =        movie.getShowTiming();
        if(movieName.equals("")){
           returnCode =  movieName;
        }
        else{
            try
            {
                Class.forName(driver).newInstance();
                Connection conn = DriverManager.getConnection(url,userName,password);
                String sql = ("INSERT INTO Movie (moviename, rating,genre,cast,director,production,movrating,overview,theatername,address,showtiming)VALUES ('"+movieName+"','"+rating+"','"+genre+"','"+cast+"','"+director+"','"+production+"','"+movrating+"','"+overview+"','"+theatername+"','"+address+"','"+showtiming+"')");
                qry=sql;
                PreparedStatement preparedStmt = conn.prepareStatement(sql);
                preparedStmt.execute();
                conn.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
//         //returnCode =  "{\"href\":\"http://localhost:8080/MoviePick/rest/movieservice/movie/"+movie.getMovieName()+"\","
//	//				+ "\"message\":\"New Movie successfully created.\"}";
//       
        }
        //return Response.status(201).entity(returnCode).build();
       // String mov =  toJSONString(movie);
    return Response.status(201).entity(movie.getMovieName()+"sucess. query: "+qry).build();
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path ("movie/{name}")
    public Response updateMovie(@PathParam("name")String movieName, String payload){
        Movie movie = fromJSON(payload);
        String movrating    =        movie.getMovRating();
        String cast         =        movie.getCast();
        String director     =        movie.getDirector();
        String rating       =        movie.getRating();
        String genre        =        movie.getGenre();
        String production   =        movie.getProduction();
        String overview     =        movie.getOverview();
        String theatername  =        movie.getTheaterName();
        String address      =        movie.getAddress();
        String showtiming   =        movie.getShowTiming();

        try
            {
                Class.forName(driver).newInstance();
                Connection conn = DriverManager.getConnection(url,userName,password);
                String sql = ("UPDATE Movie SET  rating = '"+rating+"',genre = '"+genre+"',cast= '"+cast+"',director = '"+director+"',production = '"+production+"', movrating = '"+movrating+"',overview = '"+overview+"',theatername = '"+theatername+"',address = '"+address+"',showtiming ='"+showtiming+"' WHERE moviename = '"+movieName+"'");
                PreparedStatement preparedStmt = conn.prepareStatement(sql);
                preparedStmt.execute();
                
                conn.close();
            }
            catch (Exception e)
            {
                 e.printStackTrace();
            }
         String returnCode =  "{\"href\":\"http://localhost:8080/MoviePick/rest/movieservice/movie/"+movie.getMovieName()+"\","
					+ "\"message\":\"Movie updated successfully.\"}";
       return Response.status(201).entity(returnCode).build();
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("movie/{name}")
    public Response getMovie(@PathParam("name") String moviename){
        
        Movie movie= new Movie();
        movie.setMovieName("Taken 3");
        movie.setTheaterName("Beechwood Stadium Cinemas");
        movie.setAddress("196 Alps Road #18, Athens, GA 30606");
        movie.setDirector("Olivier Megaton");
        movie.setCast("Liam Neeson, Forest Whitaker, Maggie Grace");
        movie.setMovRating("PG-13");
        movie.setRating("3.1");
        movie.setGenre("Action, Thriller");
        movie.setProduction("Europa Corp., Canal Plus, M6 Films Production");
        movie.setOverview("Ex-covert operative Bryan Mills (Liam Neeson) and his ex-wife, Lenore (Famke Janssen), are enjoying a reconciliation when Lenore is brutally murdered. Bryan is framed for the crime and flees, with the CIA, FBI and police all in hot pursuit. For the last time, he channels his rage and particular set of skills into hunting down Lenore's real killers, taking his revenge and protecting the one important thing left in his life: his daughter, Kim (Maggie Grace).");
        movie.setShowTiming("4:45 | 7:15");
        
        Movie movie2= new Movie();
        movie2.setMovieName("The Imitation Game");
        movie2.setTheaterName("University16");
        movie2.setAddress("1793 Oconee Connector, Athens, GA 30606");
        movie2.setDirector("Morten Tyldum");
        movie2.setCast(" Benedict Cumberbatch, Keira Knightley, Matthew Goode");
        movie2.setMovRating("PG-13");
        movie2.setRating("4.1");
        movie2.setGenre("Docudrama, Biography, Historical drama");
        movie2.setProduction("Lack Bear Pictures, Bristol Automotive");
        movie2.setOverview("In 1939, newly created British intelligence agency MI6 recruits Cambridge mathematics alumnus Alan Turing (Benedict Cumberbatch) to crack Nazi codes, including Enigma -- which cryptanalysts had thought unbreakable. Turing's team, including Joan Clarke (Keira Knightley), analyze Enigma messages while he builds a machine to decipher them. Turing and team finally succeed and become heroes, but in 1952, the quiet genius encounters disgrace when authorities reveal he is gay and send him to prison.");
        movie2.setShowTiming("12:00 | 2:30 | 5:00");
        List<Movie> list = new ArrayList();
        list.add(movie);
        list.add(movie2);
        String response="Not found";
        for(int i=0; i<list.size();i++){
            Movie mov = list.get(i);
            if( mov.getMovieName().equals(moviename))  
                {
                   response = toJSONString(mov); 
                 }
        }
  //    return Response.ok(response).build();

        return Response.ok(response,MediaType.APPLICATION_JSON).build();
    }
    
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("movie/{name}")
    public Response deleteMovie(@PathParam("name") String movieName){
        String qry="";
        try
            {
                Class.forName(driver).newInstance();
                Connection conn = DriverManager.getConnection(url,userName,password);
                String sql = ("DELETE FROM Movie WHERE moviename = '"+movieName+"'");
                PreparedStatement preparedStmt = conn.prepareStatement(sql);
                qry=sql;
                preparedStmt.execute();
                conn.close();
                
            }
            catch (Exception e)
            {
                 e.printStackTrace();
            }
         String returnCode =  "{\"href\":\"http://localhost:8080/MoviePick/rest/movieservice/movie/"+movieName+"\","
					+ "\"message\":\"Movie successfully deleted.\"}";
       return Response.status(201).entity("sqlquery::"+qry+"  ::::"+returnCode).build();
    }
    
    
    
    public String toJSONString(Object object) {
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.setDateFormat("yyy-MM-dd'T'HH:mm:ss.SSS'Z'"); 								// UTC
		Gson gson = gsonBuilder.create();
		return gson.toJson(object);
	}

    public Movie fromJSON(String string) {
                GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.setDateFormat("yyy-MM-dd'T'HH:mm:ss.SSS'Z'"); 								// UTC
		Gson gson = gsonBuilder.create();
                
		return gson.fromJson(string,Movie.class);
    
    }
   

    public void writeJSONtoFile(String jsonString) {  
         try { 
               FileWriter writer = new FileWriter("Movie.json");  
               writer.write(jsonString);  
               writer.close();  

              } catch (IOException e) {  
               e.printStackTrace();  
              }
        }  
   
 
}
