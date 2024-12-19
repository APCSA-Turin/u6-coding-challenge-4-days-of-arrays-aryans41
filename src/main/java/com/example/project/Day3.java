package com.example.project;

public class Day3 {
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];

        for (int x = 0; x < size; x++) {
          for (int j = 0; j < size; j++) {
            if (x + j == size - 1 || x == size / 2 || x == j || j == size / 2) {
              grid[x][j] = "*" ;
            }
            else {
              grid[x][j] = " ";
            }    
          }
        }
        return grid;
    }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
        
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
    }
}
