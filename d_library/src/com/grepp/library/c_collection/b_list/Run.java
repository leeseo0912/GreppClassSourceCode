// 2025.03.12 (수)
package com.grepp.library.c_collection.b_list;

import com.grepp.library.c_collection.b_list.grepp._ArrayList;
import com.grepp.library.c_collection.b_list.grepp._LinkedList;
import com.grepp.library.c_collection.b_list.grepp._List;
import com.grepp.library.c_collection.z_domain.School;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Run {

  public static void main(String[] args) {

    // NOTE B01 : CRUD
    // 데이터를 조작하는 방법을 줄여서 말함
    // Create, Read, Update, Delete
    // pracAdd();
    // pracGet();
    // pracSet();
    // pracRemove();
     pracSort();
    // pracSortQuiz();
    // pracIterable();
    
  }

  private static void pracIterable() {
    _List<Integer> list = new _LinkedList<>();
    //_LinkedList<Integer> list = new _LinkedList<>();
    //_List<Integer>  list = new _ArrayList<>();
   //  list = new _ArrayList<>(); //arrayList로도 한 번 해보고 잘 되면 linkedList로 해보라고 주석 넣어주셨고
    for (int i = 0; i<10; i++){
      list.add(i);
    }

//    for (int i = 0; i < 9; i++){
//      System.out.println(list.get(i));
//    }

    for (Integer i : list){ //아직 linkedList에서 iterator가 구현이 안 되어서 작동하지 않기에 주석
      System.out.println(i);
    }
  }

  private static void pracSortQuiz() {
    School seoul = new School("서울대", "관악구", 4);
    School yeonsae = new School("연세대", "신촌",3);
    School minsa = new School("민사고", "대전", 3);
    School grepp = new School("그랩","삼성", 10);
    School semyoung = new School("세명초", "속초",1);

    List<School> schools = new ArrayList<>(List.of(seoul, yeonsae, minsa, grepp, semyoung));

    Collections.sort(schools);
    System.out.println(schools);


  }

  private static void pracSort() {
    School seoul = new School("서울대", "관악구", 4);
    School yeonsae = new School("연세대", "신촌",3);
    School minsa = new School("민사고", "대전", 3);
    School grepp = new School("그랩","삼성", 10);
    School semyoung = new School("세명초", "속초",1);

    List<School> schools = new ArrayList<>(List.of(seoul, yeonsae, minsa, grepp, semyoung));
    List<Integer> nums = new ArrayList<>(List.of(13, 122, 54, 321, 21, 654, 658)); // 그냥 list.of 했으면 변경 불가능한 list인데 그걸 arraylist로 해줘서 변경가능한 리스트가 됨.

    Collections.sort(nums); // 리턴 타입이 void -> 원본 배열에 영향을 줌
    System.out.println(nums);
    Collections.sort(schools, (a,b)-> a.getName().compareTo(b.getName()));
    System.out.println(schools);
  }

  private static void pracRemove() {
    _LinkedList<Integer> list = new _LinkedList<>();
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }
    System.out.println(list); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    list.remove(2);
    for (int i = 0; i < 9; i++) {
      System.out.println(list.get(i));;
    }


    // list.remove(0);
    // System.out.println(list);

    // 0, 1, 2, 3 인덱스 삭제시 for의 경우 퐁당퐁당 = 삭제되면 바로 뒤에 값을 가져오기 때문에
//    for (int i = 0; i < 4; i++) {
//      list.remove(i);
//    }

    // 0, 1, 2, 3 인덱스 삭제
//    List<Integer> subList = list.subList(0, 4);
//    System.out.println(subList);  // [0, 1, 2, 3]
//    list.removeAll(subList);
//    System.out.println(list); // [4, 5, 6, 7, 8, 9]

  }

  private static void pracSet() {
    School seoul = new School("서울대", "관악구", 4);
    School yeonsae = new School("연세대", "신촌",3);
    School minsa = new School("민사고", "대전", 3);
    School grepp = new School("그랩","삼성", 10);
    School semyoung = new School("세명초", "속초",1);

    _LinkedList<School> list = new _LinkedList<>();
    list.add(seoul);
    list.add(yeonsae);
    System.out.println(list.get(0)); // 수정전

    list.set(0, grepp); //수정후
    System.out.println(list.get(0));
  }

  private static void pracGet() {
    List<String> list = new ArrayList<>();
    list.add("안녕");
    list.add("hi");
    list.add("hello");

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
      //System.out.println(list.getFirst());
      //System.out.println(list.getLast());

    }
  }

  // ArryList는 보통 List를 씀
  private static void pracAdd() {
    _ArrayList<Integer> list = new _ArrayList<>();

    for (int i = 0; i < 30; i++) {
      list.add(i);
      // System.out.println(list.add(i)); // Boolean 값
    }

    for (int i = 0; i < 30; i++) {
      System.out.println(list.get(i) + " ");
    }

    System.out.println("=================");
  }

}
