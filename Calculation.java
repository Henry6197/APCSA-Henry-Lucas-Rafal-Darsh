import java.util.List;

public class Calculation {

    public String calculatePet(List<Integer> scores) {

        int dog = scores.get(0);// Energy, space, active, medium matinence med cost
        int cat = scores.get(1);// low energy low maitnence low space low cost 
        int fish = scores.get(2); // low matinence, low cost, low energy, low space
        int bird = scores.get(4);  // high matinence, high cost, low energy low space
        int rodent = scores.get(3);  // low matinence, low cost, low energy low space 
        int reptile = scores.get(5);          // low matinence, high cost, low energy, low space

        String result = "";

        // =========================================================================
        // 1ST PLACE: DOG
        // =========================================================================
        if (dog >= cat && dog >= fish && dog >= bird && dog >= rodent && dog >= reptile) {
            // [1st Place: Dog Code Here]
            if (cat >= bird && cat >= rodent && cat >= reptile && cat >= fish) {
                if (bird >= rodent && bird >= reptile && bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                    return "Dog - Poodle - Aligns with your choices";
                } else if (rodent >= reptile && rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                    return "Dog - Papillon - Aligns with your choices";
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]Basenji
                    return "Dog - Basenji - Aligns with your choices";
                } else { 
                    // [3rd Place: Fish Code Here]
                    return "Dog - Portuguese Water Dog - Aligns with your choices";
                }
            } else if (bird >= rodent && bird >= reptile && bird >= fish) {
                // [2nd Place: Bird Code Here]

                if (cat >= rodent && cat >= reptile && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                    return "Dog - Havanese - Aligns with your choices";
                } else if (rodent >= reptile && rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                    return "Dog - Miniature Schnauzer - Aligns with your choices";
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                    return "Dog - Poodle - Aligns with your choices";
                } else { 
                    // [3rd Place: Fish Code Here]
                    return "Dog - Golden Retriever / Labrador Retriever - Aligns with your choices";
                }
            } else if (rodent >= reptile && rodent >= fish) {
                // [2nd Place: Rodent Code Here]

                if (cat >= bird && cat >= reptile && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                    return "Dog - Dachshund - Aligns with your choices";
                } else if (bird >= reptile && bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                    return "Dog - Miniature Pinscher - Aligns with your choices";
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                    return "Dog - Italian Greyhound - Aligns with your choices";
                } else { 
                    // [3rd Place: Fish Code Here]
                    return "Dog - Dachshund - Aligns with your choices";
                }
            } else if (reptile >= fish) {
                // [2nd Place: Reptile Code Here]

                if (cat >= bird && cat >= rodent && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                    return "Dog - Basenji - Aligns with your choices";
                } else if (bird >= rodent && bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                    return "Dog - Xoloitzcuintli - Aligns with your choices";
                } else if (rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                    return "Dog - Italian Greyhound - Aligns with your choices";
                } else { 
                    // [3rd Place: Fish Code Here]
                    return "Dog - Poodle - Aligns with your choices";
                }
            } else {
                // [2nd Place: Fish Code Here]

                if (cat >= bird && cat >= rodent && cat >= reptile) { 
                    // [3rd Place: Cat Code Here]
                    return "Dog - Poodle - Aligns with your choices";
                } else if (bird >= rodent && bird >= reptile) { 
                    // [3rd Place: Bird Code Here]
                    return "Dog - Golden Retriever or Labrador Retriever - Aligns with your choices";
                } else if (rodent >= reptile) { 
                    // [3rd Place: Rodent Code Here]
                    return "Dog - Dachshund - Aligns with your choices";
                } else { 
                    // [3rd Place: Reptile Code Here]
                    return "Dog - The Nova Scotia Duck Tolling Retriever - Aligns with your choices";
                }
            }
        }
        // =========================================================================
        // 1ST PLACE: CAT
        // =========================================================================
        else if (cat >= fish && cat >= bird && cat >= rodent && cat >= reptile) {
            // [1st Place: Cat Code Here]

            if (dog >= bird && dog >= rodent && dog >= reptile && dog >= fish) {
                // [2nd Place: Dog Code Here]

                if (bird >= rodent && bird >= reptile && bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                    return "Cat - Persian - Aligns with your choices";
                } else if (rodent >= reptile && rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                    return "Cat - American Shorthair - Aligns with your choices";
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                    return "Cat - Sphynx - Aligns with your choices";
                } else { 
                    // [3rd Place: Fish Code Here]
                    return "Cat - Turkish Van - Aligns with your choices";
                }
            } else if (bird >= rodent && bird >= reptile && bird >= fish) {
                // [2nd Place: Bird Code Here]

                if (dog >= rodent && dog >= reptile && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                    return "Cat - Abyssinian - Aligns with your choices";
                } else if (rodent >= reptile && rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                    return "Cat - Siamese - Aligns with your choices";
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                    return "Cat - Oriental Shorthair - Aligns with your choices";
                } else { 
                    // [3rd Place: Fish Code Here]
                    return "Cat - Balinese - Aligns with your choices";
                }
            } else if (rodent >= reptile && rodent >= fish) {
                // [2nd Place: Rodent Code Here]

                if (dog >= bird && dog >= reptile && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                    return "Cat - Manx - Aligns with your choices";
                } else if (bird >= reptile && bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                    return "Cat - Burmese - Aligns with your choices";
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                    return "Cat - Devon Rex - Aligns with your choices";
                } else { 
                    // [3rd Place: Fish Code Here]
                    return "Cat - Pixie bob - Aligns with your choices";
                }
            } else if (reptile >= fish) {
                // [2nd Place: Reptile Code Here]

                if (dog >= bird && dog >= rodent && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                    return "Cat - Peterbald - Aligns with your choices";
                } else if (bird >= rodent && bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                    return "Cat - Cornish Rex - Aligns with your choices";
                } else if (rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                    return "Cat - Singapura - Aligns with your choices";
                } else { 
                    // [3rd Place: Fish Code Here]
                    return "Cat - Donskoy - Aligns with your choices";
                }
            } else {
                // [2nd Place: Fish Code Here]

                if (dog >= bird && dog >= rodent && dog >= reptile) { 
                    // [3rd Place: Dog Code Here]
                    return "Cat - Maine Coon - Aligns with your choices";
                } else if (bird >= rodent && bird >= reptile) { 
                    // [3rd Place: Bird Code Here]
                    return "Cat - Norwegian Forest Cat - Aligns with your choices";
                } else if (rodent >= reptile) { 
                    // [3rd Place: Rodent Code Here]
                    return "Cat - Ragdoll - Aligns with your choices";
                } else { 
                    // [3rd Place: Reptile Code Here]
                    return "Cat - Turkish Angora - Aligns with your choices";
                }
            }
        }
        // =========================================================================
        // 1ST PLACE: BIRD
        // =========================================================================
        else if (bird >= fish && bird >= rodent && bird >= reptile) {
            // [1st Place: Bird Code Here]

            if (dog >= cat && dog >= rodent && dog >= reptile && dog >= fish) {
                // [2nd Place: Dog Code Here]

                if (cat >= rodent && cat >= reptile && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                    return "Bird - Cockatiel - Aligns with your choices";
                } else if (rodent >= reptile && rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                    return "Bird - Conure - Aligns with your choices";
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                    return "Bird - Parrotlet - Aligns with your choices";
                } else { 
                    // [3rd Place: Fish Code Here]
                    return "Bird - African Grey - Aligns with your choices";
                }
            } else if (cat >= rodent && cat >= reptile && cat >= fish) {
                // [2nd Place: Cat Code Here]

                if (dog >= rodent && dog >= reptile && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                    return "Bird - Budgerigar (Parakeet) - Aligns with your choices";
                } else if (rodent >= reptile && rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                    return "Bird - Lovebird - Aligns with your choices";
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                    return "Bird - Canary - Aligns with your choices";
                } else { 
                    // [3rd Place: Fish Code Here]
                    return "Bird - Finch - Aligns with your choices";
                }
            } else if (rodent >= reptile && rodent >= fish) {
                // [2nd Place: Rodent Code Here]

                if (dog >= cat && dog >= reptile && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                    return "Bird - Quaker Parrot - Aligns with your choices";
                } else if (cat >= reptile && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                    return "Bird - Lineolated Parakeet - Aligns with your choices";
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                    return "Bird - Bourke's Parakeet - Aligns with your choices";
                } else { 
                    // [3rd Place: Fish Code Here]
                    return "Bird - Cockatoo - Aligns with your choices";
                }
            } else if (reptile >= fish) {
                // [2nd Place: Reptile Code Here]

                if (dog >= cat && dog >= rodent && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                    return "Bird - Caique - Aligns with your choices";
                } else if (cat >= rodent && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                    return "Bird - Eclectus Parrot - Aligns with your choices";
                } else if (rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                    return "Bird - Pionus Parrot - Aligns with your choices";
                } else { 
                    // [3rd Place: Fish Code Here]
                    return "Bird - Macaw - Aligns with your choices";
                }
            } else {
                // [2nd Place: Fish Code Here]

                if (dog >= cat && dog >= rodent && dog >= reptile) { 
                    // [3rd Place: Dog Code Here]
                    return "Bird - Amazon Parrot - Aligns with your choices";
                } else if (cat >= rodent && cat >= reptile) { 
                    // [3rd Place: Cat Code Here]
                    return "Bird - Senegal Parrot - Aligns with your choices";
                } else if (rodent >= reptile) { 
                    // [3rd Place: Rodent Code Here]
                    return "Bird - Meyer's Parrot - Aligns with your choices";
                } else { 
                    // [3rd Place: Reptile Code Here]
                    return "Bird - Red-rumped Parrot - Aligns with your choices";
                }
            }
        }
                // =========================================================================
        // 1ST PLACE: RODENT
        // =========================================================================
        else if (rodent >= fish && rodent >= bird && rodent >= reptile) {
            // [1st Place: Rodent Code Here]

            if (dog >= cat && dog >= bird && dog >= reptile && dog >= fish) {
                // [2nd Place: Dog Code Here]

                if (cat >= bird && cat >= reptile && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                    return "Rodent - Rat - Aligns with your choices";
                } else if (bird >= reptile && bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                    return "Rodent - Guinea Pig - Aligns with your choices";
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                    return "Rodent - Degu - Aligns with your choices";
                } else { 
                    // [3rd Place: Fish Code Here]
                    return "Rodent - Chinchilla - Aligns with your choices";
                }
            } else if (cat >= bird && cat >= reptile && cat >= fish) {
                // [2nd Place: Cat Code Here]

                if (dog >= bird && dog >= reptile && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                    return "Rodent - Hamster - Aligns with your choices";
                } else if (bird >= reptile && bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                    return "Rodent - Gerbil - Aligns with your choices";
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                    return "Rodent - Mouse - Aligns with your choices";
                } else { 
                    // [3rd Place: Fish Code Here]
                    return "Rodent - Dwarf Hamster - Aligns with your choices";
                }
            } else if (bird >= reptile && bird >= fish) {
                // [2nd Place: Bird Code Here]

                if (dog >= cat && dog >= reptile && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                    return "Rodent - Fancy Rat - Aligns with your choices";
                } else if (cat >= reptile && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                    return "Rodent - Hedgehog - Aligns with your choices";
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                    return "Rodent - Sugar Glider - Aligns with your choices";
                } else { 
                    // [3rd Place: Fish Code Here]
                    return "Rodent - Prairie Dog - Aligns with your choices";
                }
            } else if (reptile >= fish) {
                // [2nd Place: Reptile Code Here]

                if (dog >= cat && dog >= bird && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                    return "Rodent - Naked Mole Rat - Aligns with your choices";
                } else if (cat >= bird && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                    return "Rodent - Fat tailed Gerbil - Aligns with your choices";
                } else if (bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                    return "Rodent - Spiny Mouse - Aligns with your choices";
                } else { 
                    // [3rd Place: Fish Code Here]
                    return "Rodent - African Pygmy Dormouse - Aligns with your choices";
                }
            } else {
                // [2nd Place: Fish Code Here]

                if (dog >= cat && dog >= bird && dog >= reptile) { 
                    // [3rd Place: Dog Code Here]
                    return "Rodent - Capybara - Aligns with your choices";
                } else if (cat >= bird && cat >= reptile) { 
                    // [3rd Place: Cat Code Here]
                    return "Rodent - Water Vole - Aligns with your choices";
                } else if (bird >= reptile) { 
                    // [3rd Place: Bird Code Here]
                    return "Rodent - Muskrat - Aligns with your choices";
                } else { 
                    // [3rd Place: Reptile Code Here]
                    return "Rodent - Beaver - Aligns with your choices";
                }
            }
        }
        // =========================================================================
        // 1ST PLACE: REPTILE
        // =========================================================================
        else if (reptile >= fish && reptile >= bird && reptile >= rodent) {
            // [1st Place: Reptile Code Here]

            if (dog >= cat && dog >= bird && dog >= rodent && dog >= fish) {
                // [2nd Place: Dog Code Here]

                if (cat >= bird && cat >= rodent && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                    return "Reptile - Bearded Dragon - Aligns with your choices";
                } else if (bird >= rodent && bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                    return "Reptile - Blue-Tongued Skink - Aligns with your choices";
                } else if (rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                    return "Reptile - Leopard Gecko - Aligns with your choices";
                } else { 
                    // [3rd Place: Fish Code Here]
                    return "Reptile - Water Dragon - Aligns with your choices";
                }
            } else if (cat >= bird && cat >= rodent && cat >= fish) {
                // [2nd Place: Cat Code Here]

                if (dog >= bird && dog >= rodent && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                    return "Reptile - Corn Snake - Aligns with your choices";
                } else if (bird >= rodent && bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                    return "Reptile - Crested Gecko - Aligns with your choices";
                } else if (rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                    return "Reptile - Ball Python - Aligns with your choices";
                } else { 
                    // [3rd Place: Fish Code Here]
                    return "Reptile - Red-Eared Slider Turtle - Aligns with your choices";
                }
            } else if (bird >= rodent && bird >= fish) {
                // [2nd Place: Bird Code Here]

                if (dog >= cat && dog >= rodent && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                    return "Reptile - Chameleons - Aligns with your choices";
                } else if (cat >= rodent && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                    return "Reptile - Green Iguana - Aligns with your choices";
                } else if (rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                    return "Reptile - Uromastyx - Aligns with your choices";
                } else { 
                    // [3rd Place: Fish Code Here]
                    return "Reptile - Asian Water Monitor - Aligns with your choices";
                }
            } else if (rodent >= fish) {
                // [2nd Place: Rodent Code Here]

                if (dog >= cat && dog >= bird && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                    return "Reptile - Kenyan Sand Boa - Aligns with your choices";
                } else if (cat >= bird && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                    return "Reptile - African Fat-Tailed Gecko - Aligns with your choices";
                } else if (bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                    return "Reptile - Gargoyle Gecko - Aligns with your choices";
                } else { 
                    // [3rd Place: Fish Code Here]
                    return "Reptile - Pacman Frog (Amphibian-adjacent) - Aligns with your choices";
                }
            } else {
                // [2nd Place: Fish Code Here]

                if (dog >= cat && dog >= bird && dog >= rodent) { 
                    // [3rd Place: Dog Code Here]
                    return "Reptile - Chinese Water Dragon - Aligns with your choices";
                } else if (cat >= bird && cat >= rodent) { 
                    // [3rd Place: Cat Code Here]
                    return "Reptile - Turtle (Musk Turtle) - Aligns with your choices";
                } else if (bird >= rodent) { 
                    // [3rd Place: Bird Code Here]
                    return "Reptile - Caiman Lizard - Aligns with your choices";
                } else { 
                    // [3rd Place: Rodent Code Here]
                    return "Reptile - Anole - Aligns with your choices";
                }
            }
        }
        // =========================================================================
        // 1ST PLACE: FISH
        // =========================================================================
        else if (fish >= bird && fish >= rodent && fish >= reptile && fish >= cat && fish >= dog) {
            // [1st Place: Fish Code Here]

            if (dog >= cat && dog >= bird && dog >= rodent && dog >= reptile) {
                // [2nd Place: Dog Code Here]

                if (cat >= bird && cat >= rodent && cat >= reptile) { 
                    // [3rd Place: Cat Code Here]
                    return "Fish - Oscar Fish - Aligns with your choices";
                } else if (bird >= rodent && bird >= reptile) { 
                    // [3rd Place: Bird Code Here]
                    return "Fish - Rainbowfish - Aligns with your choices";
                } else if (rodent >= reptile) { 
                    // [3rd Place: Rodent Code Here]
                    return "Fish - Cichlid - Aligns with your choices";
                } else { 
                    // [3rd Place: Reptile Code Here]
                    return "Fish - Arowana - Aligns with your choices";
                }
            } else if (cat >= bird && cat >= rodent && cat >= reptile) {
                // [2nd Place: Cat Code Here]

                if (dog >= bird && dog >= rodent && dog >= reptile) { 
                    // [3rd Place: Dog Code Here]
                    return "Fish - Betta Fish - Aligns with your choices";
                } else if (bird >= rodent && bird >= reptile) { 
                    // [3rd Place: Bird Code Here]
                    return "Fish - Guppy - Aligns with your choices";
                } else if (rodent >= reptile) { 
                    // [3rd Place: Rodent Code Here]
                    return "Fish - Neon Tetra - Aligns with your choices";
                } else { 
                    // [3rd Place: Reptile Code Here]
                    return "Fish - Angelfish - Aligns with your choices";
                }
            } else if (bird >= rodent && bird >= reptile) {
                // [2nd Place: Bird Code Here]

                if (dog >= cat && dog >= rodent && dog >= reptile) { 
                    // [3rd Place: Dog Code Here]
                    return "Fish - Discus - Aligns with your choices";
                } else if (cat >= rodent && cat >= reptile) { 
                    // [3rd Place: Cat Code Here]
                    return "Fish - Fancy Guppy - Aligns with your choices";
                } else if (rodent >= reptile) { 
                    // [3rd Place: Rodent Code Here]
                    return "Fish - Zebra Danio - Aligns with your choices";
                } else { 
                    // [3rd Place: Reptile Code Here]
                    return "Fish - Koi - Aligns with your choices";
                }
            } else if (rodent >= reptile) {
                // [2nd Place: Rodent Code Here]

                if (dog >= cat && dog >= bird && dog >= reptile) { 
                    // [3rd Place: Dog Code Here]
                    return "Fish - Pleco - Aligns with your choices";
                } else if (cat >= bird && cat >= reptile) { 
                    // [3rd Place: Cat Code Here]
                    return "Fish - Corydoras Catfish - Aligns with your choices";
                } else if (bird >= reptile) { 
                    // [3rd Place: Bird Code Here]
                    return "Fish - Loach - Aligns with your choices";
                } else { 
                    // [3rd Place: Reptile Code Here]
                    return "Fish - Goldfish - Aligns with your choices";
                }
            } else {
                // [2nd Place: Reptile Code Here]

                if (dog >= cat && dog >= bird && dog >= rodent) { 
                    // [3rd Place: Dog Code Here]
                    return "Fish - Turtle-Tank Cichlid - Aligns with your choices";
                } else if (cat >= bird && cat >= rodent) { 
                    // [3rd Place: Cat Code Here]
                    return "Fish - Axolotl - Aligns with your choices";
                } else if (bird >= rodent) { 
                    // [3rd Place: Bird Code Here]
                    return "Fish - Mudskipper - Aligns with your choices";
                } else { 
                    // [3rd Place: Rodent Code Here]
                    return "Fish - African Dwarf Frog - Aligns with your choices";
                }
            }
        }
        return result;
    }
}