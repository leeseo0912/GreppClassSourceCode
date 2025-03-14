// 2025.03.14 (금)
package com.grepp.oop.h_lamda.function;

@FunctionalInterface
public interface Consumer<T> {
  void accept(T t);
}
