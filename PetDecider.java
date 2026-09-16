import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class petFinder {
    public static void main(String[] args) {
        ArrayList<Integer> petScores = new ArrayList<>();
        //dog, cat, fish, bird, rodent, reptile
        petScores.add(0);
        petScores.add(0);
        petScores.add(0);
        petScores.add(0);
        petScores.add(0);
        petScores.add(0);
        System.out.println(petScores[0]);
        questions quiz = new questions();
        quiz.q1();
        




    }
}
