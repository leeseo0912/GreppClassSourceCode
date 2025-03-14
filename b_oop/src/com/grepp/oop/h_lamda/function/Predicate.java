// 2025.03.14 (금)
package com.grepp.oop.h_lamda.function;

@FunctionalInterface
public interface Predicate<T> {
  boolean test(T t);
}