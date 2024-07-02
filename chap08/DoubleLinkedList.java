package chap08;

import java.util.*;

/* 원형 이중 연결 리스트 클래스 */

public class DoubleLinkedList<E> {
    class Node<E> {
        private E data;
        private Node<E> prev;
        private Node<E> next;

        // 생성자
        Node() {
            data = null;
            prev = next = this;
        }

        // 생성자
        Node(E obj, Node<E> prev, Node<E> next) {
            data = obj;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node<E> head; // 머리 포인터
    private Node<E> crnt; // 선택 포인터

    // 생성자
    public DoubleLinkedList() {
        head = crnt = new Node<E>(); // 더미 노드를 생성
    }

    // 리스트가 비어 있는가?
    public boolean isEmpty() {
        return head.next == head;
    }
}
