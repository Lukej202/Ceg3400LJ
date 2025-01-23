package Lists;

import java.util.Iterator;

public class SingleLinkedList<E> implements Iterable<E>{
    private Node<E> head;
    private Node<E> tail;
    private int count;

    public SingleLinkedList(){
        head = null;
        tail = null;
    }
    
    public boolean addFirst(E item){
        if(head == null){
            head = new Node<E>(item);
            tail = head;
        }
        else{
            Node<E> newNode = new Node<E>(item);
            newNode.next = head;
            head = newNode;
        }
        count++;
        return true;
    }

    
    public boolean addLast(E item){
        if(head == null){
            head = new Node<E>(item);
            tail = head;
        }else{
            tail.next = new Node<E>(item);
            tail = tail.next;
        }
        count++;
        return true;
    }


    public String toString(){
        String result = "[";
        Node<E> current = head;
        while(current != null){
            result += current.item.toString();
            current = current.next;
            if(current != null){
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    public void add(int index, E value){
        if(index < 0 || index > count){
            throw new IndexOutOfBoundsException("Index out of bounds in add");
        }

        if(index == 0){
            this.addFirst(value);
            return;
        }

        if(index == count){
            this.addLast(value);
            return;
        }
        
        Node<E> current = head;
        for(int i =0; i< index-1; i++){
            current = current.next;
        }

        Node<E> newNode = new Node<>(value);
        newNode.next = current.next;
        current.next= newNode;
        count++;
    }

    public Iterator<E> iterator(){
        return new SLLIterator();
    }

    class SLLIterator implements Iterator<E>{
        Node<E> nextItem;
        public SLLIterator(){
            nextItem = head;
        }

        public boolean hasNext(){
            if(nextItem != null){
                return true;
            }
            else{
                return false;
            }
        }

        public E next(){
            E returnValue = nextItem.item;
            nextItem = nextItem.next;
            return returnValue;
        }
    }

    class Node<E>{
        public E item;
        public Node<E> next;

        public Node(E newItem){
            item = newItem;
            next = null;
        }
    }
}
