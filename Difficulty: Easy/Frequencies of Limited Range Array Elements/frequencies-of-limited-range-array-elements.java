//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
        int t = Integer.parseInt(br.readLine().trim()); 
        while(t-->0){
            
            //size of array
            int N = Integer.parseInt(br.readLine().trim()); 
            int arr[] = new int[N];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements to the array
            for(int i = 0 ; i < N; i++){
                arr[i]=Integer.parseInt(inputLine[i]); 
            }
            int P= Integer.parseInt(br.readLine().trim());
            //calling frequncycount() function
            Solution ob = new Solution();
            ob.frequencyCount(arr, N, P); 
            
            //printing array elements
            for(int i = 0; i < N ; i++)
                System.out.print(arr[i] + " " );
            System.out.println();
        }
    }
}




// } Driver Code Ends


class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        Map<Integer, Integer> mp = new HashMap<>(); // Create a HashMap to store the frequency of each element in the array
         for(int i = 0; i < N; i++) { // Iterate over the array from index 0 to N-1
    if(mp.containsKey(arr[i])) { // If the HashMap already contains the element arr[i]
        mp.put(arr[i], mp.get(arr[i]) + 1); // Increment the count of arr[i] by 1
    } else { // If the HashMap does not contain the element arr[i]
        mp.put(arr[i], 1); // Add arr[i] to the HashMap with a count of 1
    }
}

for(int i = 1; i <= N; i++) { // Iterate from 1 to N
    if(mp.containsKey(i)) { // If the HashMap contains the key i
        arr[i - 1] = mp.get(i); // Set arr[i-1] to the count of i in the HashMap
    } else { // If the HashMap does not contain the key i
        arr[i - 1] = 0; // Set arr[i-1] to 0
    }
}

    }
}
