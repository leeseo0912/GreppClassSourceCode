// 2025.03.12 (수)
package com.grepp.library.c_collection.b_list.grepp;

import com.grepp.library.c_collection.z_domain.Node;
import java.util.Iterator;
import java.util.NoSuchElementException;

@SuppressWarnings("unchecked")
public class _ArrayList<E> implements Iterable<E>, _List<E>{

  private Object[] elementData;
  private static final int DEFAULT_CAPACITY= 10;
  private int pointer; // 현재 배열의 사이즈 8
  private int arraySize; // 총배열의 사이즈
  private Node<E> head;

  public _ArrayList() {
    elementData = new Object[DEFAULT_CAPACITY];
    arraySize = DEFAULT_CAPACITY;
  }

//  public boolean add(E e){
//    if(pointer < arraySize){
//      elementData[pointer] = e;
//      pointer++;
//      return true;
//    }
//
//    arraySize *= 2;
//    Object[] temp = new Object[arraySize];
//
//    for (int i = 0; i < pointer; i++) {
//      temp[i] = elementData[i];
//    }
//
//    temp[pointer] = e;
//    elementData = temp;
//    pointer++;
//    return true;
//  }

  public boolean add(E e){
    if(pointer < arraySize){
      elementData[pointer] = e;
      pointer++;
      return true;
    }

    arraySize *= 2;
    Object[] temp = new Object[arraySize];

    for (int i = 0; i < pointer; i++) {
      temp[i] = elementData[i];
    }

    temp[pointer] = e;
    elementData = temp;
    pointer++;
    return true;
  }


  public E get(int index){
    if(index < 0 || index >= pointer) throw new IndexOutOfBoundsException("인덱스 범위를 벗어났습니다.");
    return (E) elementData[index];
  }



  public int size(){
    return pointer;
  }

  public E set(int index, E e){
    // index가 유효한지 검사
    if(index < 0 || index >= pointer) throw new IndexOutOfBoundsException(); // 예외처리

    E modified = (E) elementData[index]; // 수정 전 데이터를 저장
    elementData[index] = e; // 새로운 데이터로 덮어쓰기
    return modified; // 수정 전 데이터 반환
    //  return elementData[index]
  }

  public E remove(int index){
    // 인덱스가 유효한지 검사
    if (index < 0 || index >= pointer) throw new IndexOutOfBoundsException();

    // 탐색을 위한 변수 선언
    E removedElement = (E) elementData[index];

    int newSize = pointer -1;
    // 해당 인덱스 이후의 모든 요소를 한 칸씩 앞당기기
    // pointer는 배열의 현재 크기 -> 삭제 할꺼니까 -1
    for (int i = index; i < newSize; i++) {
      elementData[i] = elementData[i + 1];
    }

    // 마지막 요소를 null로 설정
    elementData[pointer - 1] = null;

    pointer--; // 크기 감소
    return removedElement; // 삭제된 값 반환
  }


  @Override
  public Iterator<E> iterator() {
    return new Iterator<E>() {

      private int pointer;

      @Override
      public boolean hasNext() {
        return pointer < size();
      }

      @Override
      public E next() {
        if(pointer >= size()) throw new NoSuchElementException();

        E e = get(pointer);
        pointer++;
        return e;
      }
    };
  }
}