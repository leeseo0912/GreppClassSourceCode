// 2025.03.12 (수)
package com.grepp.library.c_collection.b_list.grepp;

public interface _List<E>  extends  Iterable<E>{
  boolean add(E e);
  E get(int index);
  int size();
}
