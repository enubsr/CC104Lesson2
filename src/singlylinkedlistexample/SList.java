/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlistexample;

/**
 *
 * @author Enubs
 */
public class SList<E> {
    private int size;
    private SNode<E> head;
    private SNode<E> tail;
    
    public SList(){
        head = null;
        tail = null;
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public void addFirst(E element){
        head = new SNode<>(element, head);
        if(isEmpty()){
            tail = head;
        }
        size++;
    }
    
    public void addLast(E element){
        SNode<E> newNode = new SNode<>(element, null);
        if(isEmpty()){
            head = newNode;
        }
        else{
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }
    
    public E removeFirst(){
        if(isEmpty()){
            return null;
        }
        
        E tempElement = head.getElement();
        head = head.getNext();
        size--;
        
        if(isEmpty()){
            tail = null;
        }
        
        return tempElement;
    }
}
