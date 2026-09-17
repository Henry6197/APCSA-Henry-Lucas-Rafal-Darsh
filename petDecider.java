import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class petDecider {
    public static void main(String[] args) {
        // Initialize an ArrayList to keep track of scores for each pet category
        ArrayList<Integer> petScores = new ArrayList<>();
        
        // Index mapping: 0=dog, 1=cat, 2=fish, 3=rodent, 4=bird, 5=reptile
        // (Note: Make sure your Quiz class matches this exact order!)
        petScores.add(0);
        petScores.add(0);
        petScores.add(0);
        petScores.add(0);
        petScores.add(0);
        petScores.add(0);
        
        // Debug print to check the initial score at index 0 (dog)
        System.out.println(petScores.get(0));
        
        // Instantiate helper objects for handling the quiz questions and calculations
        Quiz quiz = new Quiz();
        Calculation calc = new Calculation();
        
        // Question 1 acts as a gatekeeper/prompt to see if the user wants to start the quiz
        if (quiz.q1()) {        
            // If true, run through the remaining questions to accumulate scores
            petScores = quiz.q2(petScores);
            petScores = quiz.q3(petScores);
            petScores = quiz.q4(petScores);
            petScores = quiz.q5(petScores);
            petScores = quiz.q6(petScores);
            petScores = quiz.q7(petScores);
            petScores = quiz.q8(petScores);
            petScores = quiz.q9(petScores);
            petScores = quiz.q10(petScores);
            
            // Pass the final tallied scores to the calculation class to find the best match
            String pet = calc.calculatePet(petScores);
            
            // Output the final recommended pet
            System.out.println("Your recommended pet: " + pet);

        } else {
            // If the user declines to start in q1, exit gracefully
            System.out.println("Thank you for using our petFinder, have a great day!");
        }
    }
}