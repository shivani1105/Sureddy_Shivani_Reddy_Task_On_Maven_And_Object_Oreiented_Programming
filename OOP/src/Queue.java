import java.io.*;
public class Queue implements Queue_operations {
    
	int front=-1,rear=-1,queue[],n;
	Queue(int num)
	{
		n=num;
		queue=new int[n];
	}
	@Override
	public void enQueue(int x) {
		// TODO Auto-generated method stub
		if(rear==n-1)
			System.out.println("Queue is full");
		else if(rear==-1) {
			front=rear=0;
			queue[rear]=x;
		}
		else
			queue[++rear]=x;

	}

	@Override
	public void deQueue() {
		// TODO Auto-generated method stub
		if(rear==-1)
			System.out.println("Queue is empty");
		else if(front==rear)
		{
			System.out.println("deleted element is"+queue[front]);
			front=rear=-1;
		}
		else
			System.out.println("deleted element is"+queue[front++]);

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("the elements in queue are\n");
		for(int i=front;i<=rear;i++)
		{
			System.out.println(queue[i]);
		}

	}
	public void display(int index)
	{
		System.out.println("the element at the index "+index+" is");
		if(index>0 && (index>=front && index<=rear))
			System.out.println(queue[index]);
		else
			System.out.println("not present");
	}
	public static void main(String args[])
	{
		Queue qu=new Queue(10);
		int x=30;
		for(int i=0;i<10;i++)
		  qu.enQueue(x--);
		qu.deQueue();
		qu.display();
		qu.display(3);
	}

}
