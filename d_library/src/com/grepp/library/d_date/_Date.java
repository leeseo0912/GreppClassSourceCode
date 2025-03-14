// 2025.03.14 (금)
package com.grepp.library.d_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Calendar;
import java.util.Date;

public class _Date {

  public static void main(String[] args) {
    //studyDate();
    //studyCalender();
    studyLocalDateTime();
    studyOffsetDateTime();
  }

  private static void studyOffsetDateTime() {
    OffsetDateTime now = OffsetDateTime.now();
    System.out.println(now);
    System.out.println(now.toEpochSecond() * 1000);

  }

  private static void studyLocalDateTime() {
    LocalDateTime now = LocalDateTime.now();
    System.out.println(now);

    System.out.println("연도 : " + now.getYear());
    System.out.println("월 : " + now.getMonth());
    System.out.println("일 : " + now.getDayOfMonth());
    System.out.println("시 : " + now.getHour());
    System.out.println("분 : " + now.getMinute());
    System.out.println("초 : " + now.getSecond());

    // 불변 객체라 다시 해야함
    // 메서드 체인 방식임
    now = now.plusMonths(6).plusDays(10).plusHours(3);
    LocalDate java = LocalDate.of(2025,3,19);
    System.out.println(now);
    System.out.println(java);

  }

  private static void studyCalender() {
    Calendar now = Calendar.getInstance();
    System.out.println(now);
    System.out.println("연도 : " + now.get(Calendar.YEAR));
    System.out.println("월 : " + (now.get(Calendar.MONTH) + 1));
    System.out.println("일 : " + now.get(Calendar.DATE));
    System.out.println("시 : " + now.get(Calendar.HOUR));
    System.out.println("분 : " + now.get(Calendar.MINUTE));
    System.out.println("초 : " + now.get(Calendar.SECOND));
  }

  // NOTE DA01 : 자바 1버전 때 제공된 날짜 관련 클래스
  // 국제표준양식을 딸지 않기 때문에 잘 사용하지 않는다.
  public static void studyDate(){
    Date now = new Date();
    System.out.println(now);
    System.out.println("연도 : " + now.getYear());
    System.out.println("월 : " + now.getMonth());
    System.out.println("일 : " + now.getDate());
    System.out.println("시 : " + now.getHours());
    System.out.println("분 : " + now.getMinutes());
    System.out.println("초 : " + now.getSeconds());
    System.out.println("요일 : " + now.getDay());
  }
}
