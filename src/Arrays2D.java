public class Arrays2D {
    public static void main(String[] args) {
        new Arrays2D();
    }

    int [][] grid = new int[3][4];
    int sum = 0;

    public Arrays2D(){
        System.out.println("Welcome to Grid World!");

        System.out.println(grid.length);
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[r].length; c++){
                int random = (int)(Math.random()*101);
                grid[r][c] = random;

            }

        }
        printGrid();
        System.out.println(avgNum() + "= average ");

    }

    public void printGrid(){
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[r].length; c++){
                System.out.println("(" + r +","+c+"): " +grid[r][c]);


            }

        }

    }

    public double avgNum() {

        double average = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                sum += grid[r][c];

            }



        }
        average = (double) sum / (grid.length * grid[0].length);

        return average;

    }


    }


