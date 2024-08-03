//{ Driver Code Starts
import java.util.Scanner;

class GfG
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			MyQueue obj = new MyQueue();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
					obj.push(a);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 }
	}
}




// } Driver Code Ends




class MyQueue {

    int front, rear;
	int arr[] = new int[100005];
	int currSize;
	int size;

    MyQueue()
	{
		front=-1;
		rear=-1;
		currSize =0;
		size = arr.length;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	   if(currSize == size) return;
	   if(currSize ==0 ) front = rear = 0;
	   else{
	       rear= (rear+1) % size;
	   }
	   arr[rear] = x;
	   currSize ++;
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		// Your code here
		if(currSize == 0) return -1;
		  int el = arr[front];
		if(currSize==1) front = rear = -1;
		else{
		    front = (front+1) % size;
		}
		currSize --;
		return el;
		}
		
	}




