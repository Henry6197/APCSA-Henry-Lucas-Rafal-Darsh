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
        System.out.println(petScores.get(0));
        Quiz quiz = new Quiz();
        Calculation calc = new Calculation();
        if (quiz.q1()) {        
            petScores = quiz.q2(petScores);
            petScores = quiz.q3(petScores);
            petScores = quiz.q4(petScores);
            petScores = quiz.q5(petScores);
            petScores = quiz.q6(petScores);
            petScores = quiz.q7(petScores);
            petScores = quiz.q8(petScores);
            petScores = quiz.q9(petScores);
            petScores = quiz.q10(petScores);
            String pet = calc.calculatePet(petScores);
            System.out.println("Your recommended pet: " + pet);

        } else {
            System.out.println("Thank you for using our petFinder, have a great day!");
        }


    }
}