package com.queue;
import java.util.Scanner;

class QueueOperation{

    public static void main(String args[]){
            Scanner in = new Scanner(System.in);
		Queue q = new Queue();
		
		for ( ; ; )
    {
        //Reading the choice
        System.out.printf("\nEnter\n1.Insert\n2.Delete\n3.Display\n4.Exit\n\n");
        System.out.print("Enter the choice : ");
        int choice = in.nextInt();

        switch (choice)
        {
        case 1 : 
            System.out.println("\nEnter the element to push : "); //Read element to push
            int element = in.nextInt();
            q.fnInsert(element);
            break;

        case 2 :
            q.fnDelete();
            break;

        case 3 :
            q.fnDisplay(); //Dispalys the queue
            break;

        case 4 : 
            System.exit(0);  

        default:
            System.out.println("\n!!! Invalid Choice !!!\n");
        }
	}
}
}