/**
* Solution to Leetcode problem 73 - Set Matrix Zeroes
* See: https://leetcode.com/problems/set-matrix-zeroes/
* Problem Statement: Given an m x n integer matrix matrix, if an element is 0,
* set its entire row and column to 0's, and return the matrix. Must be done in place.
* @author leedsjb
*/
class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[][] zeros = new int[m*n][2];
        int zeroCount = 0;
        
        // loop over each row in the matrix (matrix[outer])
        for(int row=0; row<m; row++){
        
            // for each col in the row I would loop over
            for(int col=0; col<n; col++){
        
                // if the int in the cell is a 1 => 
                if(matrix[row][col] == 0){
                    
                    zeros[zeroCount][0] = row;
                    zeros[zeroCount][1] = col;
                    zeroCount++;
                     
                }
            }
        }
        
        
        // zeros = [ [1,2], [3,4], ...[row, col] ]
        
        for(int i=0; i<zeroCount; i++){ // loop over each zero
            System.out.println(i);
            int zeroRow = zeros[i][0];
            int zeroCol = zeros[i][1];
            
            // loop over zero's row and col
            // set any others vals to 0
            // for loop over just the row
            for(int colZ=0; colZ < n; colZ++){
                matrix[zeroRow][colZ] = 0;
            }
            // for loop over just the col (inner)
            for(int rowZ=0; rowZ<m; rowZ++){
                matrix[rowZ][zeroCol] = 0;
            }   
        }
    }
}

// trivial complexity: nested for loop is O(m*n) + O(m+n)
