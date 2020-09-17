<!------------------ ------------------ ------------------ ------------------ ------------------ 


Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9  
The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

Function description

Complete the  function in the editor below. It must return an integer representing the absolute diagonal difference.

diagonalDifference takes the following parameter:

arr: an array of integers .
Input Format

The first line contains a single integer, , the number of rows and columns in the matrix .
Each of the next  lines describes a row, , and consists of  space-separated integers .

Constraints

Output Format

Print the absolute difference between the sums of the matrix's two diagonals as a single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output

15

------------------ ------------------ ------------------ ------------------ ------------------ ------------------ -->

<?php

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

function diagonalDifference($arr) {
    
    $firs=0;
    $sec=0;

    for($i=0;$i<count($arr);$i++)
    {
        for($j=0;$j<count($arr);$j++)
        {
            if($i==$j)
            {
                $firs +=$arr[$i][$j];
                // echo " First".$firs. "\n "; 
            }
            if($i+$j==count($arr)-1)
            {
                $sec +=$arr[$i][$j];
                //  echo " Second  ".$sec."  " .$i ."  ".$j." \n"; 
            }
        }
    }

    // echo $firs;
    // echo  $sec;
    return abs($firs-$sec);

}

$fptr = fopen(getenv("OUTPUT_PATH"), "w");

$n = intval(trim(fgets(STDIN)));

$arr = array();

for ($i = 0; $i < $n; $i++) {
    $arr_temp = rtrim(fgets(STDIN));

    $arr[] = array_map('intval', preg_split('/ /', $arr_temp, -1, PREG_SPLIT_NO_EMPTY));
}

$result = diagonalDifference($arr);

fwrite($fptr, $result . "\n");

fclose($fptr);
?>

