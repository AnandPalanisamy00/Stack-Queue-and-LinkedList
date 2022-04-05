package datastructure;

import java.util.*;
import java.util.Scanner;

public class linkedlist {
	public static void main(String[] args)
	{
		lloperations llops=new lloperations();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("\n1.Insert Front \n2.Insert Last \n3.Insert Middle \n4.Delete Front \n5.Delete Last \n6.Delete Middle \n7.Value is present in the list or not  \n8.Display the value \n9.Count the values ");
			System.out.println("Enter the option :");
			int n=sc.nextInt();
			switch(n) {
				case 1 :
					System.out.println("Enter the value to be inserted at first: ");
					int beg=sc.nextInt();
					llops.insertAtBeginning(beg);
					break;
				case 2 :
					System.out.println("Enter the value to be inserted at end : ");
					int end=sc.nextInt();
					llops.insertAtLast(end);
					break;
				case 3 :
					System.out.println("Enter the value to be inserted at middle : ");
					int mid=sc.nextInt();
					System.out.println("Enter the value to be inserted to a specified position : ");
					int pos=sc.nextInt();
					llops.insertAtMiddle(mid,pos);
					break;
				case 4 :
					llops.deleteAtBeginning();
					break;
				case 5 :
					llops.deleteAtLast();
					break;
				case 6:
					System.out.println("Enter the value to be delete to a specified position : ");
					int pos1=sc.nextInt();
					llops.deleteAtMiddle(pos1);
					break;
				case 7 :
					System.out.println("Enter the value to be searched : ");
					int srch=sc.nextInt();
					llops.search(srch);
					break;
				case 8 :
					llops.display();
					break;
				case 9 :
					llops.countNode();
					break;
				default:
					System.out.println("Selected Option is wrong.\nGive Correct Option.\n");
			}
		}
	}
}
