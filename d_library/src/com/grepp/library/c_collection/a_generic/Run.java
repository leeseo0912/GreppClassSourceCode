// 2025.03.11 (화)
package com.grepp.library.c_collection.a_generic;

import com.grepp.library.c_collection.a_generic.domain.Book;
import com.grepp.library.c_collection.a_generic.domain.Computer;
import com.grepp.library.c_collection.a_generic.domain.Device;
import com.grepp.library.c_collection.a_generic.domain.Tv;

public class Run {
    public static void main(String[] args) {
        Book book = new Book("해리포터", "조앤롤링");
        Device computer = new Computer("갤럭시북", "intel");
        Device tv = new Tv("삼텐바이", 50);

        // Object[] objs = new Object[3];
//        Object[] objs = {book, computer, tv};
//
//        for(Object obj : objs){
//            System.out.println(obj);
//        }

        // 제네릭 매개변수에 넘겨줄 타입 변수를 설정 e = Device
        // Device 타입만 넣어줄 수 있음, Book 타입을 하게 되면 에러 발생
        GenericArray<Device> genericArray = new GenericArray<>(2);
        genericArray.add(tv);
        genericArray.add(computer);

        GenericArray<Book> books = new GenericArray<>(2);
        books.add(book);

        System.out.println(books.get(0));

        for (int i = 0; i < genericArray.size() ; i++) {
            //System.out.println(genericArray.get(i));
            genericArray.get(i).on(); // 디바이스의 메서드 사용 가능
        }
    }
}
