









/****************************************************************************

This is aReference from stackoverflow for Pointer Explanation

There are three ways to pass a 2D array to a function:

The parameter is a 2D array

int array[10][10];
void passFunc(int a[][10])
{
    // ...
}
passFunc(array);
The parameter is an array containing pointers

int *array[10];
for(int i = 0; i < 10; i++)
    array[i] = new int[10];
void passFunc(int *a[10]) //Array containing pointers
{
    // ...
}
passFunc(array);
The parameter is a pointer to a pointer

int **array;
array = new int *[10];
for(int i = 0; i <10; i++)
    array[i] = new int[10];
void passFunc(int **a)
{
    // ...
}
passFunc(array);





********************************************************************************/



{
    
//Initial Template for C++
#include <iostream>
using namespace std;
//Position this line where user code will be pasted.
// Driver code
int main() {
	
	int testcase;
	cin >> testcase;
	
	while(testcase--){
	    int N;
	    cin >> N;
	    
	    // Declaring mat as pointer to pointer
	    int **mat;
	
	    // mat pointer contains array of pointer to array
    	mat = new int*[N];
    	
    	// Taking input to mat[][]
    	for(int i = 0;i<N;i++){
    	    mat[i] = new int[N];
    	}
    	
    	for(int i = 0;i<N;i++){
    	    for(int j = 0;j<N;j++){
    	        cin >> mat[i][j];
    	    }
    	}
    	
    	twoDimensional(mat, N);   
	}
	
	return 0;
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for C++
/* Function to take input for 2D array elements
* Note : Mention matrix in argument also.
* N : size of matrix
*/
void twoDimensional(int **mat,int N)

{
    
    // Loop to iterate through matrix
    for(int i = 0;i<N;i++)
    {
        for(int j = 0;j<N;j++)
        {
            printf("%d ",mat[i][j]);
           
            
        }
         printf("\n");
    }
    
}