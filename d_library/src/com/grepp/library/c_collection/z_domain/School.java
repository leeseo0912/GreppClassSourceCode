// 2025.03.12 (수)
package com.grepp.library.c_collection.z_domain;

import java.util.Objects;

public class School implements Comparable<School> {
  private String name;
  private String address;
  private Integer level;

  public School(String name, String address, Integer level) {
    this.name = name;
    this.address = address;
    this.level = level;
  }

  @Override
  public String toString() {
    return "School{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", level=" + level +
        '}';
  }

  // NOTR CZ 제어반전
  // 개발자가 작성한 compareTo 메서드를 Collections가 호출
  // 정렬을 위한 흐름을 Collections가 제어, 개발자가 작성한 코드는 Collections에 의해 사용

  // Spring framework : 웹 개발을 위한 A-Z는 미리 구현
  // O, P, Q, R 정도만 개발자에게 구현을 맡김.

  // Comparable 인터페이스의 역할
  // compareTro 메서드의 override를 강제
  // 우리가 정한 정렬기준은 Comparable 인터페이스의 compareTo 메서드를 통해 전달.
  @Override
  public int compareTo(School o) {
    // 0. 학교레벨을 기준으로 내림차순 정렬 // return o.level - this.level;

    // 1. 학교명으로 오름차순(a,b,c) 정렬될 수 있도록 기준을 변경
    int nameCompare = this.name.compareTo(o.name);
    if (nameCompare != 0) {
      return nameCompare;
    }

    // 2. 학교 레벨을 기준으로 오름차순 정렬(작은 값 → 큰 값)
    if (!this.level.equals(o.level)) {
      return this.level - o.level;
    }

    // 3. 레벨이 같다면 학교명을 기준으로 내림차순 정렬(ㅎ,ㅍ,ㅌ)
    return o.name.compareTo(this.name);
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof School school)) {
      return false;
    }
    return Objects.equals(name, school.name) && Objects.equals(address,
        school.address) && Objects.equals(level, school.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, level);
  }

  public String getName() {
    return this.name = name;
  }
}
