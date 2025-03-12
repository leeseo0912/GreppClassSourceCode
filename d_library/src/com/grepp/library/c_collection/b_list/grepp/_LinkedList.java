// 2025.03.12 (수)
package com.grepp.library.c_collection.b_list.grepp;

import com.grepp.library.c_collection.z_domain.Node;

public class _LinkedList<E> implements _List<E>{


    private int pointer;
    private Node<E> head;

  public int size(){
      return pointer;
    }

    public boolean isEmpty(){
      return pointer == 0;
    }

    public boolean add(E e){
      Node<E> current = new Node<>(e);


      if(pointer == 0){
        head = current;
        pointer++;
        return true;
      }

      Node<E> link = head;
      while(link.next() != null){
        link = link.next();
      }

      link.setNext(current); //link다음 노드로 current 들어감
      pointer++;
      return true;

    }

    public E get(int index){
      if(index <0 || index >= pointer) throw new IndexOutOfBoundsException();

      Node<E> link = head;
      for (int i = 0; i < index; i++) {
        link = link.next();
      }
      return link.data();
    }

    public E set(int index, E e){
      if(index < 0 || index >= pointer) throw new IndexOutOfBoundsException();

      Node<E> link = head;

      for (int i = 0; i < index; i++) { // 해당하는 노드 찾아보기
        link = link.next();
      }

      E modified = link.data(); // data 덮어쓰기
      link.setDate(e);
      return modified;
    }

    public E remove(int index){
      if(index <0 || index >= pointer) throw new IndexOutOfBoundsException();

      Node<E> link = head; //탐색용
      Node<E> prevNode = head;

      if(index == 0){
        head = head.next();
        pointer--;
        return prevNode.data();  //이전 노드의 값 리턴
      }

      for (int i = 0; i < index; i++) {
        prevNode = link;
        link = link.next();
      }

      prevNode.setNext(link.next()); //이전노드에 타깃의 다음로드를 넣어줌
      pointer--; //삭제했으니 포인터 하나 줄여줌
      return link.data(); // 삭제한 노드 저장
    }
}
