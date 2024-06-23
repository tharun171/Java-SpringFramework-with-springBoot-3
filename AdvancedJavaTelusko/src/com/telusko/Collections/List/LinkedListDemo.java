package com.telusko.Collections.List;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		/*
		 * We can add or remove elements from both sides
		 * Can contain duplicate elements
		 * maintains Insertion order
		 * non Synchronized
		 * Manipulation is fast,because no shifting needs to occur
		 */
		LinkedList<String> list = new LinkedList<String>();
		
		//add
		list.add("Zach Dempsey");
		list.add("Bryce Walker");
		list.add("Hannah Baker");
		list.add("Clay Jensen");
		list.add("Amy");
		list.add("Justin Foley");
		
		list.add(1,"Jessica Davis");
		
		//addFirst = adds at begin of list
		list.addFirst("AddFirst");
		//addLast
		list.addLast("AddLast");
		//contains
		System.out.println(list.contains("Amy"));
		
		//GET
		//retrieve first element of list
		System.out.println("get 1: "+list.element());
		//get
		System.out.println("get 1: "+list.get(1));
		//getFirst
		System.out.println("getFirst: "+list.getFirst());
		//getLast
		System.out.println("getLast: "+list.getLast());
		
		//index
		System.out.println(list.indexOf("Amy"));
		
		//Peek - get first element
		System.out.println("Peek - "+list.peek());
		//PeekFirst = get first element
		System.out.println("PeekFirst - "+list.peekFirst());
		//PeekLast = get last element
		System.out.println("PeekLast - "+list.peekLast());
		
		//Poll = retrieve and remove first element of list
		//PollFirst = retrieve and remove 1st element of list, return null if list is empty
		//PollLast = retrieve and remove last element of list, return null if list is empty
		
		//Pop - pops an element from stack represented by list
		//removes 1st element from list
		System.out.println("Pop - "+list.pop());
		
		//Push - adds at 1st starting
		list.push("addFirst");
		
		//remove - retrieve and removes first element of list
		//remove(index)
		//remove(Object)
		
		//removeFirst() - removes and return the first element from list
		//removeLast() - remove and return the last element from list
		
		//set(index,element)
		//to array - return object
		
		//SIZE
		System.out.println("size: "+list.size());
		
		System.out.println(list);
		
		
		
		
	}

}
