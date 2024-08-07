package chap09;

import java.util.*;

class BinTree<K,V> {
    // 노드
    static class Node<K,V> {
        private K key;
        private V data;
        private Node<K,V> left; // 왼쪽 자식 노드에 대한 참조
        private Node<K,V> right; // 오른쪽 자식 노드에 대한 참조

        // 생성자
        Node(K key, V data, Node<K,V> left, Node<K,V> right){
            this.key = key;
            this.data = data;
            this.left = left;
            this.right = right;
        }

        // 키값을 반환
        K getKey() { return key; }

        // 데이터를 반환
        V getValue() { return data; }

        // 데이터를 출력
        void print() { System.out.println(data); }
    }

    private Node<K,V> root; // 루트
    private Comparator<? super K> comparator = null; // 비교자

    // 생성자
    public BinTree() {
        root = null;
    }

    public BinTree(Comparator<? super K> c) {
        this();
        comparator = c;
    }

    // 두 키값을 비교
    private int comp(K key1, K key2) {
        return (comparator == null) ? ((Comparable<K>)key1).compareTo(key2) : comparator.compare(key1, key2);
    }

    // 키로 검색
    public V search(K key) {
        Node<K,V> p = root; 

        while(true) {
            if(p == null) // 검색 실패
                return null;
            int cond = comp(key, p.getKey()); // key와 node p의 key값 비교
            if(cond == 0)
                return p.getValue();
            else if(cond < 0)
                p = p.left;
            else
                p = p.right;
        }
    }

    // node를 루트로 하는 서브트리에 노드<K,V>를 삽입
    private void addNode(Node<K,V> node, K key, V data) {
	    int cond = comp(key, node.getKey());
	    if(cond == 0)
		    return; // key가 이진검색트리에 이미 존재
	    else if(cond < 0) {
		    if(node.left == null)
			    node.left = new Node<K,V>(key, data, null, null);
		    else
			    addNode(node.left, key, data);
	    }
	    else {
		    if(node.right == null)
			    node.right = new Node<K, V>(key, data, null, null);
		    else
			    addNode(node.right, key, data); 
	    }
    }

    // 노드를 삽입
    public void add(K key, V data) {
        if(root == null)
            root = new Node<K,V>(key, data, null, null);
        else
            addNode(root, key, data);
    }

    // 키값이 key인 노드를 삭제
    public boolean remove(K key) {
        Node<K,V> p = root; // 스캔 중인 노드
        Node<K,V> parent = null; // 스캔 중인 노드의 부모 노드
        boolean isLeftChild = true; // p가 부모 노드의 왼쪽 자식 노드인가?
        
        while(true) {
            if(p == null)
                return false;
            int cond = comp(key, p.getKey());
            if(cond == 0)
                break;
            else {
                parent = p;
                if(cond < 0) {
                    isLeftChild = true;
                    p = p.left;
                }
                else {
                    isLeftChild = false;
                    p = p.right;
                }
            }
        }
        
        if(p.left == null) {
            if(p == root)
                root = p.right;
            else if(isLeftChild)
                parent.left = p.right;
            else
                parent.right = p.right;
        }
        else if(p.right == null) {
            if(p == root)
                root = p.left;
            else if(isLeftChild)
                parent.left = p.left;
            else
                parent.right = p.left;
        }
        else {
            parent = p;
            Node<K,V> left = p.left;
            isLeftChild = true;
            while(left.right != null) {
                parent = left;
                left = left.right;
                isLeftChild = false;
            }
            p.key = left.key;
            p.data = left.data;
            if(isLeftChild)
                parent.left = left.left;
            else
                parent.right = left.left;
        }
        return true;
    }

    // node를 루트로 하는 서브트리의 노드를 키값의 오름차순으로 출력
    private void printSubTree(Node node) {
        if(node != null) {
            printSubTree(node.left);
            System.out.println(node.key + " " + node.data);
            printSubTree(node.right);
        }
    }

    // 모든 노드를 키값의 오름차순으로 출력
    public void print() {
        printSubTree(root);
    }
}