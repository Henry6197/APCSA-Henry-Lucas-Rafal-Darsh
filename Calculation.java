import java.util.List;

public class Calculations {

    public String calculatePet(List<Integer> scores) {
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) <= -50) {
                scores.set(i, 0); // Reset scores to 0 so they dont effect anything
        }

        int dog = scores.get(0);
        int cat = scores.get(1);
        int fish = scores.get(2);
        int bird = scores.get(4);
        int rodent = scores.get(3);
        int reptile = scores.get(5);

        String result = "";

        // =========================================================================
        // 1ST PLACE: DOG
        // =========================================================================
        if (dog >= cat && dog >= fish && dog >= bird && dog >= rodent && dog >= reptile) {
            // [1st Place: Dog Code Here]

            if (cat >= bird && cat >= rodent && cat >= reptile && cat >= fish) {
                // [2nd Place: Cat Code Here]

                if (bird >= rodent && bird >= reptile && bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                } else if (rodent >= reptile && rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                } else { 
                    // [3rd Place: Fish Code Here]
                }
            } else if (bird >= rodent && bird >= reptile && bird >= fish) {
                // [2nd Place: Bird Code Here]

                if (cat >= rodent && cat >= reptile && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                } else if (rodent >= reptile && rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                } else { 
                    // [3rd Place: Fish Code Here]
                }
            } else if (rodent >= reptile && rodent >= fish) {
                // [2nd Place: Rodent Code Here]

                if (cat >= bird && cat >= reptile && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                } else if (bird >= reptile && bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                } else { 
                    // [3rd Place: Fish Code Here]
                }
            } else if (reptile >= fish) {
                // [2nd Place: Reptile Code Here]

                if (cat >= bird && cat >= rodent && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                } else if (bird >= rodent && bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                } else if (rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                } else { 
                    // [3rd Place: Fish Code Here]
                }
            } else {
                // [2nd Place: Fish Code Here]

                if (cat >= bird && cat >= rodent && cat >= reptile) { 
                    // [3rd Place: Cat Code Here]
                } else if (bird >= rodent && bird >= reptile) { 
                    // [3rd Place: Bird Code Here]
                } else if (rodent >= reptile) { 
                    // [3rd Place: Rodent Code Here]
                } else { 
                    // [3rd Place: Reptile Code Here]
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
                } else if (rodent >= reptile && rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                } else { 
                    // [3rd Place: Fish Code Here]
                }
            } else if (bird >= rodent && bird >= reptile && bird >= fish) {
                // [2nd Place: Bird Code Here]

                if (dog >= rodent && dog >= reptile && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                } else if (rodent >= reptile && rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                } else { 
                    // [3rd Place: Fish Code Here]
                }
            } else if (rodent >= reptile && rodent >= fish) {
                // [2nd Place: Rodent Code Here]

                if (dog >= bird && dog >= reptile && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                } else if (bird >= reptile && bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                } else { 
                    // [3rd Place: Fish Code Here]
                }
            } else if (reptile >= fish) {
                // [2nd Place: Reptile Code Here]

                if (dog >= bird && dog >= rodent && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                } else if (bird >= rodent && bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                } else if (rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                } else { 
                    // [3rd Place: Fish Code Here]
                }
            } else {
                // [2nd Place: Fish Code Here]

                if (dog >= bird && dog >= rodent && dog >= reptile) { 
                    // [3rd Place: Dog Code Here]
                } else if (bird >= rodent && bird >= reptile) { 
                    // [3rd Place: Bird Code Here]
                } else if (rodent >= reptile) { 
                    // [3rd Place: Rodent Code Here]
                } else { 
                    // [3rd Place: Reptile Code Here]
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
                } else if (rodent >= reptile && rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                } else { 
                    // [3rd Place: Fish Code Here]
                }
            } else if (cat >= rodent && cat >= reptile && cat >= fish) {
                // [2nd Place: Cat Code Here]

                if (dog >= rodent && dog >= reptile && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                } else if (rodent >= reptile && rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                } else { 
                    // [3rd Place: Fish Code Here]
                }
            } else if (rodent >= reptile && rodent >= fish) {
                // [2nd Place: Rodent Code Here]

                if (dog >= cat && dog >= reptile && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                } else if (cat >= reptile && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                } else { 
                    // [3rd Place: Fish Code Here]
                }
            } else if (reptile >= fish) {
                // [2nd Place: Reptile Code Here]

                if (dog >= cat && dog >= rodent && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                } else if (cat >= rodent && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                } else if (rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                } else { 
                    // [3rd Place: Fish Code Here]
                }
            } else {
                // [2nd Place: Fish Code Here]

                if (dog >= cat && dog >= rodent && dog >= reptile) { 
                    // [3rd Place: Dog Code Here]
                } else if (cat >= rodent && cat >= reptile) { 
                    // [3rd Place: Cat Code Here]
                } else if (rodent >= reptile) { 
                    // [3rd Place: Rodent Code Here]
                } else { 
                    // [3rd Place: Reptile Code Here]
                }
            }
        }

        // =========================================================================
        // 1ST PLACE: RODENT
        // =========================================================================
        else if (rodent >= fish && rodent >= reptile) {
            // [1st Place: Rodent Code Here]

            if (dog >= cat && dog >= bird && dog >= reptile && dog >= fish) {
                // [2nd Place: Dog Code Here]

                if (cat >= bird && cat >= reptile && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                } else if (bird >= reptile && bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                } else { 
                    // [3rd Place: Fish Code Here]
                }
            } else if (cat >= bird && cat >= reptile && cat >= fish) {
                // [2nd Place: Cat Code Here]

                if (dog >= bird && dog >= reptile && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                } else if (bird >= reptile && bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                } else { 
                    // [3rd Place: Fish Code Here]
                }
            } else if (bird >= reptile && bird >= fish) {
                // [2nd Place: Bird Code Here]

                if (dog >= cat && dog >= reptile && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                } else if (cat >= reptile && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                } else if (reptile >= fish) { 
                    // [3rd Place: Reptile Code Here]
                } else { 
                    // [3rd Place: Fish Code Here]
                }
            } else if (reptile >= fish) {
                // [2nd Place: Reptile Code Here]

                if (dog >= cat && dog >= bird && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                } else if (cat >= bird && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                } else if (bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                } else { 
                    // [3rd Place: Fish Code Here]
                }
            } else {
                // [2nd Place: Fish Code Here]

                if (dog >= cat && dog >= bird && dog >= reptile) { 
                    // [3rd Place: Dog Code Here]
                } else if (cat >= bird && cat >= reptile) { 
                    // [3rd Place: Cat Code Here]
                } else if (bird >= reptile) { 
                    // [3rd Place: Bird Code Here]
                } else { 
                    // [3rd Place: Reptile Code Here]
                }
            }
        }

        // =========================================================================
        // 1ST PLACE: REPTILE
        // =========================================================================
        else if (reptile >= fish) {
            // [1st Place: Reptile Code Here]

            if (dog >= cat && dog >= bird && dog >= rodent && dog >= fish) {
                // [2nd Place: Dog Code Here]

                if (cat >= bird && cat >= rodent && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                } else if (bird >= rodent && bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                } else if (rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                } else { 
                    // [3rd Place: Fish Code Here]
                }
            } else if (cat >= bird && cat >= rodent && cat >= fish) {
                // [2nd Place: Cat Code Here]

                if (dog >= bird && dog >= rodent && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                } else if (bird >= rodent && bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                } else if (rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                } else { 
                    // [3rd Place: Fish Code Here]
                }
            } else if (bird >= rodent && bird >= fish) {
                // [2nd Place: Bird Code Here]

                if (dog >= cat && dog >= rodent && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                } else if (cat >= rodent && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                } else if (rodent >= fish) { 
                    // [3rd Place: Rodent Code Here]
                } else { 
                    // [3rd Place: Fish Code Here]
                }
            } else if (rodent >= fish) {
                // [2nd Place: Rodent Code Here]

                if (dog >= cat && dog >= bird && dog >= fish) { 
                    // [3rd Place: Dog Code Here]
                } else if (cat >= bird && cat >= fish) { 
                    // [3rd Place: Cat Code Here]
                } else if (bird >= fish) { 
                    // [3rd Place: Bird Code Here]
                } else { 
                    // [3rd Place: Fish Code Here]
                }
            } else {
                // [2nd Place: Fish Code Here]

                if (dog >= cat && dog >= bird && dog >= rodent) { 
                    // [3rd Place: Dog Code Here]
                } else if (cat >= bird && cat >= rodent) { 
                    // [3rd Place: Cat Code Here]
                } else if (bird >= rodent) { 
                    // [3rd Place: Bird Code Here]
                } else { 
                    // [3rd Place: Rodent Code Here]
                }
            }
        }

        // =========================================================================
        // 1ST PLACE: FISH
        // =========================================================================
        else {
            // [1st Place: Fish Code Here]

            if (dog >= cat && dog >= bird && dog >= rodent && dog >= reptile) {
                // [2nd Place: Dog Code Here]

                if (cat >= bird && cat >= rodent && cat >= reptile) { 
                    // [3rd Place: Cat Code Here]
                } else if (bird >= rodent && bird >= reptile) { 
                    // [3rd Place: Bird Code Here]
                } else if (rodent >= reptile) { 
                    // [3rd Place: Rodent Code Here]
                } else { 
                    // [3rd Place: Reptile Code Here]
                }
            } else if (cat >= bird && cat >= rodent && cat >= reptile) {
                // [2nd Place: Cat Code Here]

                if (dog >= bird && dog >= rodent && dog >= reptile) { 
                    // [3rd Place: Dog Code Here]
                } else if (bird >= rodent && bird >= reptile) { 
                    // [3rd Place: Bird Code Here]
                } else if (rodent >= reptile) { 
                    // [3rd Place: Rodent Code Here]
                } else { 
                    // [3rd Place: Reptile Code Here]
                }
            } else if (bird >= rodent && bird >= reptile) {
                // [2nd Place: Bird Code Here]

                if (dog >= cat && dog >= rodent && dog >= reptile) { 
                    // [3rd Place: Dog Code Here]
                } else if (cat >= rodent && cat >= reptile) { 
                    // [3rd Place: Cat Code Here]
                } else if (rodent >= reptile) { 
                    // [3rd Place: Rodent Code Here]
                } else { 
                    // [3rd Place: Reptile Code Here]
                }
            } else if (rodent >= reptile) {
                // [2nd Place: Rodent Code Here]

                if (dog >= cat && dog >= bird && dog >= reptile) { 
                    // [3rd Place: Dog Code Here]
                } else if (cat >= bird && cat >= reptile) { 
                    // [3rd Place: Cat Code Here]
                } else if (bird >= reptile) { 
                    // [3rd Place: Bird Code Here]
                } else { 
                    // [3rd Place: Reptile Code Here]
                }
            } else {
                // [2nd Place: Reptile Code Here]

                if (dog >= cat && dog >= bird && dog >= rodent) { 
                    // [3rd Place: Dog Code Here]
                } else if (cat >= bird && cat >= rodent) { 
                    // [3rd Place: Cat Code Here]
                } else if (bird >= rodent) { 
                    // [3rd Place: Bird Code Here]
                } else { 
                    // [3rd Place: Rodent Code Here]
                }
            }
        }
            }
        }