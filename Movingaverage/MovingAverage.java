package Week7;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class MovingAverage {
	
	int capacity;
	double sum;
	
	Queue<Integer> q;
	
	public MovingAverage(int size)
	{
		this.capacity =size;
		this.sum = 0;
		q = new LinkedList<Integer>();
	}
	
	
	double next(int val)
	{
		if(q.size() >= capacity)
		{
			sum -= q.poll();
			
		}
		q.add(val);		
		sum += val;
		
		return sum/q.size();		
	}
	
	public static void main(String[] args)
	{
		 MovingAverage m = new MovingAverage(3);
		 System.out.println(m.next(0));		 
		 System.out.println(m.next(0));
		 System.out.println(m.next(0));
		 System.out.println(m.next(0));
		 System.out.println(m.next(0));
		
	}
}


