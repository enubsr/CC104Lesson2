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
public class SNode<E> {
    
    private E element;
    private SNode<E> next;
        
    public SNode(E element, SNode<E> next){
        this.element = element;
        this.next = next;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public SNode<E> getNext() {
        return next;
    }

    public void setNext(SNode<E> next) {
        this.next = next;
    }
}

