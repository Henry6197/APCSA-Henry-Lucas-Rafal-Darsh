import java.util.Scanner;
import java.util.ArrayList;

public class Quiz {

    // Using a single class-level Scanner prevents input-blocking/NoSuchElement issues
    static Scanner input = new Scanner(System.in);

    /**
     * Question 1: Acts as a gatekeeper to check if the user even wants a pet.
     * @return boolean - true if 'y', false if 'n'
     */
    public static boolean q1() {
        System.out.println("Do you want pets? (y/n): ");
        String q1Ans = input.nextLine().trim();

        // Validate input to ensure it is strictly 'y' or 'n'
        while (q1Ans.isEmpty() || (q1Ans.toLowerCase().charAt(0) != 'y' && q1Ans.toLowerCase().charAt(0) != 'n')) {
            System.out.println("Make sure it's only either y or n: ");
            q1Ans = input.nextLine().trim();
        }

        return q1Ans.toLowerCase().charAt(0) == 'y';
    }

    /**
     * Question 2: Identifies pets the user completely dislikes or does not want.
     * Sets their score to an extremely low number (-100000000.0) to disqualify them.
     */
    public ArrayList<Double> q2(ArrayList<Double> Scores) {
        int iteration = 0;
        System.out.println("Out of this list of pets, how many do you not want at all? Dog, Cat, Fish, Bird, Rodent, Reptile: ");
        
        // Ensure valid single-digit input for how many pets to exclude
        while (true) {
            String ans = input.nextLine().trim();
            if (ans.length() == 1 && Character.isDigit(ans.charAt(0))) {
                iteration = Integer.parseInt(ans);
                break;
            } else {
                System.out.println("Your answer must be a single digit. Enter a single digit response: ");
            }
        }

        System.out.println("I will ask which species of pets you do not want " + iteration + " time(s).");
        System.out.println("Enter the number corresponding to the species (1: Dog, 2: Cat, 3: Fish, 4: Bird, 5: Rodent, 6: Reptile)");
        
        // Loop through each excluded pet type and severely penalize its score
        for (int i = 0; i < iteration; i++) {
            System.out.println("Enter the number: ");
            while (true) {
                String ans = input.nextLine().trim();
                if (ans.length() == 1 && Character.isDigit(ans.charAt(0))) {
                    int y = Integer.parseInt(ans);
                    if (y >= 1 && y <= 6) {
                        Scores.set(y - 1, -100000000.0); // Disqualify pet
                        break;
                    } else {
                        System.out.println("Please enter a value between 1 and 6: ");
                    }
                } else {
                    System.out.println("Your answer has to be a single digit.");
                }
            }
        }
        return Scores;
    }

    /**
     * Question 3: Asks which pets the user likes and gives them a positive boost (+3).
     */
    public ArrayList<Double> q3(ArrayList<Double> Scores) {
        int iteration = 0;
        System.out.println("How many kinds of pets do you like? (Enter a number between 0 and 6): ");
        
        while (true) {
            String ans = input.nextLine().trim();
            if (ans.length() == 1 && Character.isDigit(ans.charAt(0))) {
                iteration = Integer.parseInt(ans);
                break;
            } else {
                System.out.println("Your answer must be a single digit. Enter a single digit response: ");
            }
        }

        if (iteration > 0) {
            System.out.println("I will ask which species of pets you like " + iteration + " time(s).");
            System.out.println("Enter the number corresponding to the species (1: Dog, 2: Cat, 3: Fish, 4: Bird, 5: Rodent, 6: Reptile)");
            
            for (int i = 0; i < iteration; i++) {
                System.out.println("Enter the number: ");
                while (true) {
                    String ans = input.nextLine().trim();
                    if (ans.length() == 1 && Character.isDigit(ans.charAt(0))) {
                        int y = Integer.parseInt(ans);
                        if (y >= 1 && y <= 6) {
                            Scores.set(y - 1, Scores.get(y - 1) + 3); // Boost liked pets
                            break;
                        } else {
                            System.out.println("Please enter a value between 1 and 6: ");
                        }
                    } else {
                        System.out.println("Your answer has to be a single digit.");
                    }
                }
            }
        }
        return Scores;
    }

    /**
     * Question 4: Evaluates home size and adjusts scores based on spatial requirements.
     */
    public ArrayList<Double> q4(ArrayList<Double> Scores) {
        int answer = 0;
        System.out.println("How big is your home? 1: under 1000sqft, 2: 1000sqft to 2000sqft, 3: 2000sqft to 3000sqft, 4: over 3000sqft ");
        
        while (true) {
            String ans = input.nextLine().trim();
            if (ans.length() == 1 && Character.isDigit(ans.charAt(0))) {
                answer = Integer.parseInt(ans);
                if (answer >= 1 && answer <= 4) {
                    break;
                } else {
                    System.out.println("Please enter a value 1 through 4: ");
                }
            } else {
                System.out.println("Your answer has to be a single digit.");
            }
        }

        // Increment pet scores progressively based on available square footage
        if (answer >= 1) {
            Scores.set(4, Scores.get(4) + 1); // Rodent (Index 4 maps to rodent depending on index rules)
            Scores.set(2, Scores.get(2) + 1); // Fish
            Scores.set(5, Scores.get(5) + 1); // Reptile
        }
        if (answer >= 2) {
            Scores.set(3, Scores.get(3) + 1); // Bird
        }
        if (answer >= 3) {
            Scores.set(1, Scores.get(1) + 1); // Cat
        }
        if (answer == 4) {
            Scores.set(0, Scores.get(0) + 1); // Dog
        }
        return Scores;
    }

    /**
     * Question 5: Factoring in vacation frequency; frequent travelers get penalties on high-maintenance pets.
     */
    public ArrayList<Double> q5(ArrayList<Double> Scores) {
        int answer = 0;
        System.out.println("What is your vacation frequency? (1: Less than once a year, 2: Once a year, 3: Twice a year, 4: Thrice a year, 5: Less than 6 times a year, 6: More than 6 times)");
        
        while (true) {
            String ans = input.nextLine().trim();
            if (ans.length() == 1 && Character.isDigit(ans.charAt(0))) {
                answer = Integer.parseInt(ans);
                if (answer >= 1 && answer <= 6) {
                    break;
                } else {
                    System.out.println("Please enter a value 1 through 6: ");
                }
            } else {
                System.out.println("Your answer has to be a single digit.");
            }
        }

        // Apply progressive deductions based on how often the user is away
        if (answer == 2) {
            Scores.set(0, Scores.get(0) - 1);
            Scores.set(3, Scores.get(3) - 1);
        } else if (answer == 3) {
            Scores.set(4, Scores.get(4) - 1);
            Scores.set(0, Scores.get(0) - 2);
            Scores.set(3, Scores.get(3) - 3);
        } else if (answer == 4) {
            Scores.set(1, Scores.get(1) - 1);
            Scores.set(4, Scores.get(4) - 2);
            Scores.set(0, Scores.get(0) - 3);
            Scores.set(3, Scores.get(3) - 4);
        } else if (answer == 5) {
            Scores.set(1, Scores.get(1) - 3);
            Scores.set(4, Scores.get(4) - 3);
            Scores.set(0, Scores.get(0) - 6);
            Scores.set(3, Scores.get(3) - 7);
        } else if (answer == 6) {
            Scores.set(5, Scores.get(5) - 1);
            Scores.set(1, Scores.get(1) - 4);
            Scores.set(4, Scores.get(4) - 4);
            Scores.set(0, Scores.get(0) - 8);
            Scores.set(3, Scores.get(3) - 9);
        }
        return Scores;
    }

    /**
     * Question 6: Evaluates the user's willingness to put effort into pet care.
     */
    public ArrayList<Double> q6(ArrayList<Double> Scores) {
        int answer = 0;
        System.out.println("How much effort do you want to give? (1: Barely at all, 2: A little bit, 3: Average, 4: A lot, 5: A decent amount, 6: With my entire heart)");
        
        while (true) {
            String ans = input.nextLine().trim();
            if (ans.length() == 1 && Character.isDigit(ans.charAt(0))) {
                answer = Integer.parseInt(ans);
                if (answer >= 1 && answer <= 6) {
                    break;
                } else {
                    System.out.println("Please enter a value 1 through 6: ");
                }
            } else {
                System.out.println("Your answer has to be a single digit.");
            }
        }

        // Heavy penalties for high-maintenance pets if effort level is low
        if (answer == 1) {
            Scores.set(2, Scores.get(2) - 4); 
            Scores.set(5, Scores.get(5) - 6);
            Scores.set(1, Scores.get(1) - 8);
            Scores.set(4, Scores.get(4) - 8);
            Scores.set(0, Scores.get(0) - 10);
            Scores.set(3, Scores.get(3) - 10);
        } else if (answer == 2) {
            Scores.set(1, Scores.get(1) - 4);
            Scores.set(4, Scores.get(4) - 4);
            Scores.set(0, Scores.get(0) - 7);
            Scores.set(3, Scores.get(3) - 8);
        } else if (answer == 3) {
            Scores.set(1, Scores.get(1) - 1);
            Scores.set(4, Scores.get(4) - 2);
            Scores.set(0, Scores.get(0) - 5);
            Scores.set(3, Scores.get(3) - 7);
        } else if (answer == 4) {
            Scores.set(0, Scores.get(0) - 2);
            Scores.set(3, Scores.get(3) - 4);
        } else if (answer == 5) {
            Scores.set(3, Scores.get(3) - 2);
        }
        return Scores;
    }

    /**
     * Question 7: Factor in annual income to gauge financial capacity for different pet types.
     */
    public ArrayList<Double> q7(ArrayList<Double> Scores) {
        int answer = 0;
        System.out.println("How much do you make a year? 1: under $50,000, 2: $50,000 - $75,000, 3: $75,000 - $100,000, 4: over $100,000 ");
        
        while (true) {
            String ans = input.nextLine().trim();
            if (ans.length() == 1 && Character.isDigit(ans.charAt(0))) {
                answer = Integer.parseInt(ans);
                if (answer >= 1 && answer <= 4) {
                    break;
                } else {
                    System.out.println("Please enter a value 1 through 4: ");
                }
            } else {
                System.out.println("Your answer has to be a single digit.");
            }
        }

        if (answer >= 1) {
            Scores.set(4, Scores.get(4) + 1);
            Scores.set(2, Scores.get(2) + 1);
        }
        if (answer >= 2) {
            Scores.set(5, Scores.get(5) + 1);
        }
        if (answer >= 3) {
            Scores.set(1, Scores.get(1) + 1);
            Scores.set(0, Scores.get(0) + 1);
        }
        if (answer == 4) {
            Scores.set(3, Scores.get(3) + 1);
        }
        return Scores;
    }

    /**
     * Question 8: Evaluates daily hours away from home and penalizes attention-heavy pets.
     */
    public ArrayList<Double> q8(ArrayList<Double> Scores) {
        int answer = 0;
        System.out.println("How long are you away from home daily? (1: Less than 4 hours, 2: 4-6 hours, 3: 7-9 hours, 4: 10-12 hours, 5: More than 12 hours)");
        
        while (true) {
            String ans = input.nextLine().trim(); 
            if (ans.length() == 1 && Character.isDigit(ans.charAt(0))) {
                answer = Integer.parseInt(ans);
                if (answer >= 1 && answer <= 5) {
                    break;
                } else {
                    System.out.println("Please enter a value 1 through 5: ");
                }
            } else {
                System.out.println("Your answer has to be a single digit.");
            }
        }

        if (answer == 2) {
            Scores.set(0, Scores.get(0) - 1);
            Scores.set(3, Scores.get(3) - 2);
        } else if (answer == 3) {
            Scores.set(4, Scores.get(4) - 1);
            Scores.set(0, Scores.get(0) - 4);
            Scores.set(3, Scores.get(3) - 5);
        } else if (answer == 4) {
            Scores.set(1, Scores.get(1) - 2);
            Scores.set(4, Scores.get(4) - 2);
            Scores.set(0, Scores.get(0) - 8);
            Scores.set(3, Scores.get(3) - 9);
        } else if (answer == 5) {
            Scores.set(5, Scores.get(5) - 1);
            Scores.set(1, Scores.get(1) - 4);
            Scores.set(4, Scores.get(4) - 4);
            Scores.set(0, Scores.get(0) - 10);
            Scores.set(3, Scores.get(3) - 10);
        }
        return Scores;
    }

    /**
     * Question 9: Factors in user age group to align lifestyle suitability with certain pets.
     */
    public ArrayList<Double> q9(ArrayList<Double> Scores) {
        int answer = 0;
        System.out.println("What is your age? 1: under 20, 2: 20-40, 3: 40-60, 4: over 60 ");
        
        while (true) {
            String ans = input.nextLine().trim();
            if (ans.length() == 1 && Character.isDigit(ans.charAt(0))) {
                answer = Integer.parseInt(ans);
                if (answer >= 1 && answer <= 4) {
                    break;
                } else {
                    System.out.println("Please enter a value 1 through 4: ");
                }
            } else {
                System.out.println("Your answer has to be a single digit.");
            }
        }

        if (answer >= 1) {
            Scores.set(4, Scores.get(4) + 1);
            Scores.set(2, Scores.get(2) + 1);
        }
        if (answer >= 2) {
            Scores.set(5, Scores.get(5) + 1);
        }
        if (answer >= 3) {
            Scores.set(1, Scores.get(1) + 1);
            Scores.set(0, Scores.get(0) + 1);
        }
        if (answer == 4) {
            Scores.set(3, Scores.get(3) + 1);
        }
        return Scores;
    }

    /**
     * Question 10: Evaluates daily exercise routine, heavily affecting dog suitability scores.
     */
    public ArrayList<Double> q10(ArrayList<Double> Scores) {
        int answer = 0;
        System.out.println("How much do you exercise? (1: Not at all, 2: 15-30 minutes, 3: 30-60 minutes, 4: 1-2 hours, 5: 2+ hours)");
        
        while (true) {
            String ans = input.nextLine().trim(); 
            if (ans.length() == 1 && Character.isDigit(ans.charAt(0))) {
                answer = Integer.parseInt(ans);
                if (answer >= 1 && answer <= 5) {
                    break;
                } else {
                    System.out.println("Please enter a value 1 through 5: ");
                }
            } else {
                System.out.println("Your answer has to be a single digit.");
            }
        }

        // Apply penalties to dogs if the user doesn't exercise enough
        if (answer == 1) {
            Scores.set(0, Scores.get(0) - 10); 
        } else if (answer == 2) {
            Scores.set(0, Scores.get(0) - 8);  
        } else if (answer == 3) {
            Scores.set(0, Scores.get(0) - 6);
        }
        return Scores;
    }
}