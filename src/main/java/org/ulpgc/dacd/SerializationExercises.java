package org.ulpgc.dacd;

import com.google.gson.Gson;
import org.ulpgc.dacd.model.Movie;
import org.ulpgc.dacd.model.Session;
import org.ulpgc.dacd.model.Theater;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SerializationExercises {
    private static Gson gson1 = new Gson();
    private static String jsonSession1;
    private static String jsonSession2;
    private static String jsonTheater1;
    private static String jsonTheater2;
    private static String jsonMovie1;
    private static String jsonMovie2;
    public static class Exercise1 {
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

        public static void main(String[] args) {
            Session session1 = gson1.fromJson(jsonSession1, Session.class);
            Session session2 = gson1.fromJson(jsonSession2, Session.class);
            Theater theater1 = gson1.fromJson(jsonTheater1, Theater.class);
            Theater theater2 = gson1.fromJson(jsonTheater2, Theater.class);
            Movie movie1 = gson1.fromJson(jsonMovie1, Movie.class);
            Movie movie2 = gson1.fromJson(jsonMovie2, Movie.class);
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
