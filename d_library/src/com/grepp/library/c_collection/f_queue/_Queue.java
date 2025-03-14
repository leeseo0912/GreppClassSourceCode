package com.grepp.library.c_collection.f_queue;

import com.grepp.library.c_collection.z_domain.Node;

public class _Queue <E>{
  private Node<E> top;
  private Node<E> tail;
  private int size;

  public void offer(E e){
    Node<E> node = new Node<>(e);

    if(top == null) {
      top = node;
      tail = node;
      size++;
      return;
    }

    // tail 만들기 전
//    Node<E> link = top;
//    while(link.next() != null){
//      link = link.next();
//    }
//
//    link.setNext(node);
    tail.setNext(node);
    tail = node;
    size++;
  }

  public E peek(){
    if(top == null) return null;
    return top.data();
  }

  public E poll(){
    if(top == null) return null;
    E data = top.data();
    top = top.next();
    size--;
    return data;
  }

  public boolean empty(){
    return size == 0;
  }

  public int size(){
    return size;
  }





}
