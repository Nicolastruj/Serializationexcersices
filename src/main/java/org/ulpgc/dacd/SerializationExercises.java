package org.ulpgc.dacd;

import com.google.gson.Gson;
import org.ulpgc.dacd.model.Movie;
import org.ulpgc.dacd.model.Session;
import org.ulpgc.dacd.model.Theater;

import java.io.*;

public class SerializationExercises {
    private static String jsonSession1;
    private static String jsonSession2;
    private static String jsonTheater1;
    private static String jsonTheater2;
    private static String jsonMovie1;
    private static String jsonMovie2;
    private static Session session1;
    private static Session session2;
    private static Theater theater1;
    private static Theater theater2;
    private static Movie movie1;
    private static Movie movie2;
    public static class Exercise1 {
        private static Gson gson1 = new Gson();
        public static void main(String[] args) throws IOException {
            Movie film1 = new Movie("Interestelar");
            Movie film2 = new Movie("Gravity");
            Theater theater1 = new Theater("Pérez Galdos");
            Theater theater2 = new Theater("Guiniguda");
            Session Session1 = new Session(film1, theater1);
            Session Session2 = new Session(film2, theater2);

            jsonSession1 = gson1.toJson(Session1);
            System.out.println(jsonSession1);
            File file1 = new File("text1.txt");
            FileWriter writer1=new FileWriter(file1);
            writer1.write(String.valueOf(jsonSession1));
            writer1.close();

            jsonSession2 = gson1.toJson(Session2);
            File file2 = new File("text2.txt");
            FileWriter writer2=new FileWriter(file2);
            writer2.write(String.valueOf(jsonSession2));
            writer2.close();

            jsonTheater1 = gson1.toJson(theater1);
            File file3 = new File("text3.txt");
            FileWriter writer3=new FileWriter(file3);
            writer3.write(String.valueOf(jsonTheater1));
            writer3.close();

            jsonTheater2 = gson1.toJson(theater2);
            File file4 = new File("text4.txt");
            FileWriter writer4=new FileWriter(file4);
            writer4.write(String.valueOf(jsonTheater2));
            writer4.close();

            jsonMovie1 = gson1.toJson(film1);
            File file5 = new File("text5.txt");
            FileWriter writer5=new FileWriter(file5);
            writer5.write(String.valueOf(jsonMovie1));
            writer5.close();

            jsonMovie2 = gson1.toJson(film2);
            File file6 = new File("text6.txt");
            FileWriter writer6=new FileWriter(file6);
            writer6.write(String.valueOf(jsonMovie2));
            writer6.close();
        }
    }

    /*
        Deserialize the objects created in exercise 1.
        Now serialize them using ObjectOutputStream
     */
    public static class Exercise2 {
        private static FileOutputStream fileOutputStream;
        private static ObjectOutputStream objectOutputStream;
        private static Gson gson2 = new Gson();
        public static void main(String[] args) throws IOException{
            session1 = gson2.fromJson(jsonSession1, Session.class);
            session2 = gson2.fromJson(jsonSession2, Session.class);
            theater1 = gson2.fromJson(jsonTheater1, Theater.class);
            theater2 = gson2.fromJson(jsonTheater2, Theater.class);
            movie1 = gson2.fromJson(jsonMovie1, Movie.class);
            movie2 = gson2.fromJson(jsonMovie2, Movie.class);
            fileOutputStream = new FileOutputStream("session1.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(session1);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream = new FileOutputStream("session2.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(session2);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream = new FileOutputStream("theater1.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(theater1);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream = new FileOutputStream("theater2.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(theater2);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream = new FileOutputStream("movie1.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(movie1);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream = new FileOutputStream("movie2.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(movie2);
            objectOutputStream.flush();
            objectOutputStream.close();
        }
    }

    /*
       Deserialize the objects from the binary files created in exercise 2.
    */
    public static class Exercise3 {

        public static void main(String[] args) {

        }
    }
}
