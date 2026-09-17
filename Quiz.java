import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    static Scanner input = new Scanner(System.in);

    public boolean q1() {
        System.out.println("Do you want pets? (y/n): ");
        String q1Ans = input.nextLine().trim();

        while (q1Ans.isEmpty() || (q1Ans.toLowerCase().charAt(0) != 'y' && q1Ans.toLowerCase().charAt(0) != 'n')) {
            System.out.println("Make sure it's only either y or n: ");
            q1Ans = input.nextLine().trim();
        }

        return q1Ans.toLowerCase().charAt(0) == 'y';
    }

    public ArrayList<Double> q2(ArrayList<Double> Scores) {
        int iteration = 0;
        System.out.println("Out of this list of pets, enter the number of pets you do not want at all? Dog, Cat, Fish, Bird, Rodent, Reptile: ");
        
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
        
        for (int i = 0; i < iteration; i++) {
            System.out.println("Enter the number: ");
            while (true) {
                String ans = input.nextLine().trim();
                if (ans.length() == 1 && Character.isDigit(ans.charAt(0))) {
                    int y = Integer.parseInt(ans);
                    if (y >= 1 && y <= 6) {
                        Scores.set(y - 1, -100000000.0); 
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
                            Scores.set(y - 1, Scores.get(y - 1) + 3); 
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

        // FAIR SCORING: Mutually exclusive rewards. Big houses reward big pets, small houses reward small pets.
        if (answer == 1) {
            Scores.set(4, Scores.get(4) + 2); // Rodent
            Scores.set(2, Scores.get(2) + 2); // Fish
            Scores.set(5, Scores.get(5) + 1); // Reptile
        } else if (answer == 2) {
            Scores.set(1, Scores.get(1) + 1); // Cat
            Scores.set(3, Scores.get(3) + 1); // Bird
        } else if (answer == 3) {
            Scores.set(1, Scores.get(1) + 2); // Cat
            Scores.set(0, Scores.get(0) + 1); // Dog
        } else if (answer == 4) {
            Scores.set(0, Scores.get(0) + 3); // Dog
            Scores.set(1, Scores.get(1) + 1); // Cat
        }
        return Scores;
    }

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

        // FAIR SCORING: Kept penalties, but added a slight bonus for pets that travel easily or don't mind you leaving if you rarely travel.
        if (answer == 1) {
            Scores.set(0, Scores.get(0) + 2); // Dog likes you home
            Scores.set(3, Scores.get(3) + 2); // Bird likes you home
        } else if (answer == 3) {
            Scores.set(0, Scores.get(0) - 2);
            Scores.set(3, Scores.get(3) - 2);
        } else if (answer == 4) {
            Scores.set(0, Scores.get(0) - 4);
            Scores.set(3, Scores.get(3) - 4);
            Scores.set(1, Scores.get(1) - 1);
        } else if (answer == 5) {
            Scores.set(0, Scores.get(0) - 6);
            Scores.set(3, Scores.get(3) - 6);
            Scores.set(1, Scores.get(1) - 3);
            Scores.set(4, Scores.get(4) - 2);
        } else if (answer == 6) {
            Scores.set(0, Scores.get(0) - 9);
            Scores.set(3, Scores.get(3) - 9);
            Scores.set(1, Scores.get(1) - 5);
            Scores.set(4, Scores.get(4) - 4);
            Scores.set(5, Scores.get(5) - 2);
        }
        return Scores;
    }

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

        // FAIR SCORING: Low effort rewards low-maintenance. High effort actually REWARDS high-maintenance.
        if (answer == 1) {
            Scores.set(2, Scores.get(2) + 3); // Fish bonus for low effort
            Scores.set(0, Scores.get(0) - 10);
            Scores.set(3, Scores.get(3) - 10);
        } else if (answer == 2) {
            Scores.set(4, Scores.get(4) + 2); // Rodent bonus
            Scores.set(5, Scores.get(5) + 2); // Reptile bonus
            Scores.set(0, Scores.get(0) - 7);
        } else if (answer == 3) {
            Scores.set(1, Scores.get(1) + 2); // Cat bonus
            Scores.set(0, Scores.get(0) - 3);
        } else if (answer == 5 || answer == 6) {
            Scores.set(0, Scores.get(0) + 4); // Dog MAJOR bonus
            Scores.set(3, Scores.get(3) + 3); // Bird bonus
            Scores.set(2, Scores.get(2) - 2); // Fish penalty (you'd be bored)
        }
        return Scores;
    }

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

        // FAIR SCORING: Changed to mutually exclusive if/else structure.
        if (answer == 1) {
            Scores.set(4, Scores.get(4) + 2); // Rodents are cheap
            Scores.set(2, Scores.get(2) + 2); // Fish are cheap
        } else if (answer == 2) {
            Scores.set(1, Scores.get(1) + 1); // Cats
            Scores.set(5, Scores.get(5) + 1); // Reptiles
        } else if (answer == 3) {
            Scores.set(0, Scores.get(0) + 1); // Dogs
            Scores.set(1, Scores.get(1) + 1);
        } else if (answer == 4) {
            Scores.set(0, Scores.get(0) + 3); // Expensive pets get a boost if rich
            Scores.set(3, Scores.get(3) + 2);
        }
        return Scores;
    }

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

        if (answer == 1) {
            Scores.set(0, Scores.get(0) + 3); // Dog bonus for being home
        } else if (answer == 3) {
            Scores.set(0, Scores.get(0) - 3);
            Scores.set(3, Scores.get(3) - 3);
        } else if (answer == 4) {
            Scores.set(0, Scores.get(0) - 7);
            Scores.set(3, Scores.get(3) - 6);
            Scores.set(1, Scores.get(1) - 2);
        } else if (answer == 5) {
            Scores.set(0, Scores.get(0) - 10);
            Scores.set(3, Scores.get(3) - 10);
            Scores.set(1, Scores.get(1) - 4);
        }
        return Scores;
    }

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

        // FAIR SCORING: Age groups now point towards lifestyle rather than strictly mimicking the income logic.
        if (answer == 1) {
            Scores.set(4, Scores.get(4) + 1); // Rodents popular for younger
        } else if (answer == 2) {
            Scores.set(0, Scores.get(0) + 2); // Dogs popular for active young adults
        } else if (answer == 3) {
            Scores.set(1, Scores.get(1) + 2); // Cats
        } else if (answer == 4) {
            Scores.set(3, Scores.get(3) + 2); // Birds
            Scores.set(1, Scores.get(1) + 1); // Cats
        }
        return Scores;
    }

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

        // FAIR SCORING: Added positive points for high exercise to reward Dog owners!
        if (answer == 1) {
            Scores.set(0, Scores.get(0) - 10); 
        } else if (answer == 2) {
            Scores.set(0, Scores.get(0) - 5);  
        } else if (answer == 4) {
            Scores.set(0, Scores.get(0) + 3); // Dog bonus!
        } else if (answer == 5) {
            Scores.set(0, Scores.get(0) + 5); // Dog major bonus!
        }
        return Scores;
    }
}