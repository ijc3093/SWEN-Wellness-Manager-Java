package Model;

import java.io.IOException;

//This model is for data that can be saved when user inserts, delete, modify and show.
// You can see Model using in Controller.java
public class Model {
    public static Object UserDatabase;
    private ExerciseDatabase exerciseDatabase = new ExerciseDatabase();
    private FoodDatabase foodDatabase = new FoodDatabase();
    private LogDatabase logDatabase = new LogDatabase();
    private UserDatabase userDatabase = new UserDatabase();


    public Model() throws IOException { }
    //getExerciseDatabase(), getFoodDatabase(), getLogDatabase(), getUserDatabase() are calling by Controller.java
    //ExerciseDatabase, FoodDatabase, LogDatabase, UserDatabase are places where data stored involve csv.
    public ExerciseDatabase getExerciseDatabase(){

        return this.exerciseDatabase;
    }

    public FoodDatabase getFoodDatabase() {

        return this.foodDatabase;
    }

    public LogDatabase getLogDatabase() {

        return logDatabase;
    }

    public UserDatabase getUserDatabase(){

        return userDatabase;
    }
}
