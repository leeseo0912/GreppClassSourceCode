// 2025.03.14 (금)
package com.grepp.library.f_stream.b_stream;

import com.grepp.library.f_stream.z_domain.Exam;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Run {

  public static void main(String[] args) {
    //testStream();
    //testSort();
    //testFilter();
    //testMap();
    //testGroupBy();
    //testReduce();
    testForeach();
  }

  private static Consumer<String> testForeach() {
    List<Exam> exams = createList();
    // NOTE fb01 : 람다 내부에서 지역변수를 사용할 수 없음
    // 사용하려면 상수처럼 쓸 수 있도록 추가적인 조치가 필요함.
    exams.forEach(System.out::println);
    int num = 0;
    Consumer<String> res = e -> System.out.println(e + ": " + num);
    return res;
  }

  //람다 내부에서 지역변수의 변수 쓸 수 없음

  private static void testReduce() {
    List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int sum = list.stream().reduce((a, b) -> a + b).orElse(0);

    System.out.println(sum);
    // practiceReduceToFilter(createList());
    praciceReduceToMap(createList());
  }

  // exams에서 학생 이름을 추출해, set으로 반환하는 reduce를 작성하시오
  private static void praciceReduceToMap(List<Exam> list) {
    Set<String> nameSet = list.stream()
        .reduce(new LinkedHashSet<>(),
            (a,b) -> {
              a.add(b.name());
              return a;
            }, (a, b) -> null); //stram에선 안씀
    System.out.println(nameSet);
  }

private static void practiceReduceToFilter(List<Exam> list) {
  List<Exam> filtered = list.stream()
      .reduce(new ArrayList<>(),
          (result, exam) -> {
            if (exam.score() <= 70) {
              result.add(exam);
            }
            return result;
          },
          (a, b) -> null); //stram에선 안씀

  System.out.println("=== practicReduceToFilter ===");
  System.out.println(filtered);
}

private static void testGroupBy() {
  // 이름 별 list
//    List<Exam> exams = createList();
//    Map<String, List<Exam>> grouped = exams.stream()
//        .collect(Collectors.groupingBy(e -> e.name()));

  // 총점
//    List<Exam> exams = createList();
//    Map<String, Integer> grouped = exams.stream()
//        .collect(Collectors.groupingBy(e -> e.name(),
//            Collectors.summingInt(e->e.score())));

  // 평균
  List<Exam> exams = createList();
  Map<String, Double> grouped = exams.stream()
      .collect(Collectors.groupingBy(e -> e.name(),
          Collectors.averagingInt(e -> e.score()))
      );

  System.out.println(grouped);


}

private static void testMap() {
  List<Exam> exams = createList();

  // exams에서 시험 과목만 추출
  //List<String> list = exams.stream().map(e-> e.subject()).toList();
  //System.out.println(list);

  // exams에서 과목명에 '어'가 포함되는 시험 과목만 추출
  List<String> list = exams.stream()
      .map(e -> e.subject())
      .filter(e -> e.contains("어")).toList();

  // 시험을 본 학생들의 성만 추출해서 출력
  // [하, 어, 어, 하]
  list = exams.stream()
      .map(e -> e.name().substring(0, 1))
      .toList();
  System.out.println(list);

  // 중복값 빼고 어,하
  Set<String> set = exams.stream()
      .map(e -> e.name().substring(0, 1))
      .collect(Collectors.toSet());
  System.out.println(set);
}

private static void testFilter() {
  List<Exam> exams = createList();
  // 점수가 70점 이하인 시험 출력
  System.out.println("=== filiter ===");

  List<Exam> list = exams.stream().filter(e -> e.score() <= 70).toList();
  System.out.println(list);

  list = exams.stream().filter(e -> e.name().equals("어선정")).toList();


}

private static void testSort() {
  List<Exam> list = createList();
  list = list.stream()
      .sorted((a, b) -> a.score() - b.score()).toList();

  System.out.println(list);
}

private static void testStream() {
  // NOTE B01 Stream
  // 1. Stream 생성
  Stream<Integer> iStream = Stream
      .<Integer>builder()
      .add(10).add(12).add(93).add(54)
      .build();

  List<Integer> list = iStream
      .sorted((a, b) -> -(a - b))      // 2. 중간연산, 내림차순정렬
      .toList();     // 3. 결과연산

  System.out.println(list);

}

private static List<Exam> createList() {
  List<Exam> list = new ArrayList<>();
  list.add(new Exam("국어", "하명도", 90));
  list.add(new Exam("수학", "어선정", 100));
  list.add(new Exam("영어", "어선정", 100));
  list.add(new Exam("과학", "하명도", 46));
  return list;
}
}
