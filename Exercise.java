public class Exercise {
    public static void main(String[] args) throws Exception {
  
        int[][] mdArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15 ,16}};
    
  
        // PATTERN 1
        int total = 0;
        for (int row = 0; row < mdArray.length; row++) {
            for (int column = 0; column < mdArray.length; column++) {
                if (row == 0) {
                    total += mdArray[row][column];
                }
            }
        }
      
        System.out.println("1. SUM OF PATTERN 1: " + total);

       

    
        
        
        // PATTERN 2

        int totalpt2 = 0;
        for (int row = 0; row< mdArray.length; row++) {
            for (int column = 0; column < mdArray.length; column++) {
                if (row == 0) {
                    totalpt2 += mdArray[column][row];
                }
            }
        }

        System.out.println("");
        System.out.println("2. SUM OF PATTERN 2: " + totalpt2);


        // PATTERN 3

        int totalpt3 = 0;
        for (int row = 0; row< mdArray.length; row++) {
            for (int column = 0; column < mdArray.length; column++) {
                if (row == 0 || column == 0) {
                    totalpt3 += mdArray[row][column];

                    
                }
            }
        }


        System.out.println("");
        System.out.println("3. SUM OF PATTERN 3: " + totalpt3);
        
        // PATTERN 4

        int totalpt4 = 0;
        for (int row = 0; row< mdArray.length; row++) {
            for (int column = 0; column < mdArray.length; column++) {
                if (row % 3 == 0 && ( column == 0 || column == 3)) {
                    totalpt4 += mdArray[row][column];
                }
            }
        }
        System.out.println("");
        System.out.println("4. SUM OF PATTERN 4: " + totalpt4);
        
        // PATTERN 5

        int totalpt5 = 0;
        for (int row = 0; row < mdArray.length; row++) {
            
            for (int column = 0; column < mdArray.length; column++) {
                if ((row == 1 && column == 1) || (row == 1 && column == 2) || (row == 2 && column == 1) || (row == 2 && column == 2)){
                    totalpt5 += mdArray[row][column];
                }
            }
            
        } 
        System.out.println("");
        System.out.println("5. SUM OF PATTERN 5: " + totalpt5);
       
      
        // PATTERN 6
        
        int totalpt6 = 0;
        for (int row = 0; row < mdArray.length; row++) {
            
            for (int column = 0; column < mdArray.length; column++) {
                if ((row == 1 && column == 1) || (row == 1 && column == 2) || (row == 2 && column == 1) || (row == 2 && column == 2) || row % 3 == 0 && ( column == 0 || column == 3)){
                    totalpt6 += mdArray[row][column];
                }
            }
            
        } 
        System.out.println("");
        System.out.println("5. SUM OF PATTERN 5: " + totalpt6);

    }
}
