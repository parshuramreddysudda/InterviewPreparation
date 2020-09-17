





{
//Initial Template for C++
#include <iostream>
using namespace std;
// Function prototype
void swap(int*, int*);
void swap(int&, int&);
//Position this line where user code will be pasted.
// Driver code
int main() {
	
	int testcase;
	cin >> testcase;
	
	while(testcase--){
	    int A, B;
	    cin >> A >> B;
	    
	    // Swapping by reference
	    swap(A, B);
	    cout << A << " " << B << endl;
	    
	    // Swap by pointers
	    swap(&A, &B);
	    
	    cout << A << " " << B << endl;
	}
	
	return 0;
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for C++
// Function to swap A and B
// using pointers
void swap(int *P, int *Q){
    
    int C=*P;
  *P=*Q;
  *Q=C;
    
}
// Function to swap A and B
// using reference
void swap(int &A, int &B){
  
 
  int c=A;
  A=B;
  B=c;

}



