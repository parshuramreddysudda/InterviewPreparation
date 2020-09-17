#include <bits/stdc++.h>
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

void merge(int arr[], int l, int m, int r) 
{ 
    int i, j, k; 
    int n1 = m - l + 1; 
    int n2 = r - m; 
  
    /* create temp arrays */
    int L[n1], R[n2]; 
  
    /* Copy data to temp arrays L[] and R[] */
    for (i = 0; i < n1; i++) 
        L[i] = arr[l + i]; 
    for (j = 0; j < n2; j++) 
        R[j] = arr[m + 1 + j]; 
  
    /* Merge the temp arrays back into arr[l..r]*/
    i = 0; // Initial index of first subarray 
    j = 0; // Initial index of second subarray 
    k = l; // Initial index of merged subarray 
    while (i < n1 && j < n2) { 
        if (L[i] <= R[j]) { 
            arr[k] = L[i]; 
            i++; 
        } 
        else { 
            arr[k] = R[j]; 
            j++; 
        } 
        k++; 
    } 
  
    /* Copy the remaining elements of L[], if there 
       are any */
    while (i < n1) { 
        arr[k] = L[i]; 
        i++; 
        k++; 
    } 
  
    /* Copy the remaining elements of R[], if there 
       are any */
    while (j < n2) { 
        arr[k] = R[j]; 
        j++; 
        k++; 
    } 
} 
  
/* l is for left index and r is right index of the 
   sub-array of arr to be sorted */
void mergeSort(int arr[], int l, int r) 
{ 
    if (l < r) { 
        // Same as (l+r)/2, but avoids overflow for 
        // large l and h 
        int m = l + (r - l) / 2; 
  
        // Sort first and second halves 
        mergeSort(arr, l, m); 
        mergeSort(arr, m + 1, r); 
  
        merge(arr, l, m, r); 
    } 
}
void printArray(int A[], int size) 
{ 
    int i; 
    for (i = 0; i < size; i++) 
        printf("%d ", A[i]); 
} 
int main() {
	//code  
	int t;
	cin>>t;
	while(t-->0){
	     int firstLength,secondLength;
		cin>>firstLength>>secondLength;
			int firstArray[firstLength];
			int secondArray[secondLength];
				cout<<"Size of First is"<<firstLength;
			cout<<"Size of Second is"<<secondLength,"\n";
			for (int i = 0; i < firstLength; i++) {
					cin>>firstArray[i];
			}
			for (int i = 0; i < secondLength; i++) {
				cin>>secondArray[i];
			}
		
			 printf("\n"); 
			printArray(firstArray,firstLength);
			int first = firstLength-1, second = 0, temp = 0;
			while (first >= 0 && second < secondLength-1) {
				if (firstArray[first] > secondArray[second]) {
					temp = secondArray[second];
					secondArray[second] = firstArray[first];
					firstArray[first] = temp;
					
					cout<<"First Array Value is "<<firstArray[first]<<"\n";
				}
				first--;
				second++;

			}
			
			mergeSort(firstArray,0,firstLength);
			mergeSort(secondArray,0,secondLength);
			 printf(" FIrst Array\n");  printf("\n"); 
			printArray(firstArray,firstLength);
			 printf("\n"); 
			 printf("Second Array\n"); 
			printArray(secondArray,secondLength);
			 printf("\n");  printf("\n"); 
	
	}
	return 0;
}
