package chap08;

import java.util.*;

public class LinkedList<E> {
	// node class
	class Node<E> {
		private E data; // 데이터
		private Node<E> next; // 다음 포인터
		
		/* constructor */
		Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private Node<E> head; // 머리 포인터
	private Node<E> crnt; // 선택 포인터
}
