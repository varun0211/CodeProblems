// Move all negative numbers to beginning and positive to end with constant extra space

// Difficulty Level : Easy

// An array contains both positive and negative numbers in random order. 
// Rearrange the array elements so that all negative numbers appear before all positive numbers.

// Examples : 

// Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
// Output: -12 -13 -5 -7 -3 -6 11 6 5

// ************************************************************************************************

class Test {

   // Approach 1:
   static void rearrange(int[] arr, int n) {
      int j=0, temp;
      for(int i=0; i<n; i++) {
         if(arr[i]<0) {
            if(i!=j) {
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
            j++;
         }
      }
   }

   // Approach 2:
   static void rearrange(int arr[], int n)
   {
      int j=n-1, temp;
      for(int i=0; i<=j; i++) {
         if(arr[j]<=0) {
            if(arr[i]>=0) {
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               j--;
            }
         } else {
            j--;
            i--;
         }
      }
   }

   static void printArray(int arr[], int n)
   {
      for (int i = 0; i < n; i++)
         System.out.print(arr[i] + " ");
   }

   public static void main(String args[])
   {
      int arr[] = { -12, 11, -13, 0, -5, 6, -7, 5, -3, 11 };
      // -12 -3 -13 -5 -7 6 5 11 11
      // int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
      // -1 -3 -7 4 5 6 2 8 9
      // int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
      // -12 -13 -5 -7 -3 -6 11 6 5
      int n = arr.length;

      rearrange(arr, n);
      printArray(arr, n);
   }
}
