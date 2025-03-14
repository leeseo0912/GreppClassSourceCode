// 2025.03.12 (수)
package com.grepp.oop.g_inner.builder;

public class Book {

  private String title;
  private String author;
  private Integer price;
  private  Boolean activated;


  private Book(String title, String author, Integer price, Boolean activated) {
    this.title = title;
    this.author = author;
    this.price = price;
    this.activated = activated;
  }

  // NOTE G5 builder 패턴
  public static class Builder{
    private String title;
    private String author;
    private Integer price;
    private  Boolean activated;

    // NOTE G6 메서드 체인 방식
    // this를 반환해서 인스턴스 메서드를 연쇄적으로 호출

    public Builder title(String author){
      this.title = title;
      return this;
    }

    public Builder author(String author){
      this.author = author;
      return this;
    }

    public Builder price(Integer price){
      this.price = price;
      return this;
    }

    public Builder activated(Boolean activated){
      this.activated = activated;
      return this;
    }


    public Book build() {
      return new Book(title, author, price, activated);
    }
  }


  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", price=" + price +
        ", activated=" + activated +
        '}';
  }
}
