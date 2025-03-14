// 2025.03.14 (금)
package com.grepp.oop.h_lamda.function;

@FunctionalInterface
// 전달 받는건 없는데 주는거는 있는 친구
public interface Supplier<T> {

  T get();

}
