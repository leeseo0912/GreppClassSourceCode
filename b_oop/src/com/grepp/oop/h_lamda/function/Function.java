package com.grepp.oop.h_lamda.function;

@FunctionalInterface
public interface Function<T, R> {
  R apply(T arg, T arg2);
}
