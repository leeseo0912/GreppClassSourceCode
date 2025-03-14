// 2025.03.13 (목)
package com.grepp.library.c_collection.d_map.grepp;

import java.util.Objects;

public class _Entry<K,V> {

  private K key;
  private V value;

  public _Entry(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }

  public void setValue(V value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof _Entry<?, ?> entry)) {
      return false;
    }
    return Objects.equals(key, entry.key);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(key);
  }

  @Override
  public String toString() {
    return super.toString();
  }
}