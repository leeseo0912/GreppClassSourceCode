// 2025.03.11 (화)
// 2025.03.12 (수)
package com.grepp.library.c_collection.a_generic;

import com.grepp.library.c_collection.a_generic.domain.*;

public class Run {
    public static void main(String[] args) {

        Computer mac = new Computer("mac", "apple");
        Computer galaxyBook = new Computer("galaxyBook", "intel");
        SmartPhone iphone = new SmartPhone("iphone", "긱벤치", "SKT");
        SmartPhone galaxy = new SmartPhone("galaxy", "intel", "SKT");
        Book book = new Book("해리포터", "조앤롤링");
        Tv tv = new Tv("삼텐바이", 50);

        // Object[] objs = new Object[3];
//        Object[] objs = {book, computer, tv};
//
//        for(Object obj : objs){
//            System.out.println(obj);
//        }

        // 제네릭 매개변수에 넘겨줄 타입 변수를 설정 e = Device
        // Device 타입만 넣어줄 수 있음, Book 타입을 하게 되면 에러 발생
        GenericArray<Device> devices = new GenericArray<>(2);
        devices.add(tv);
        devices.add(galaxyBook);

        for (int i = 0; i < devices.size() ; i++) {
            //System.out.println(genericArray.get(i));
            devices.get(i).on(); // 디바이스의 메서드 사용 가능
        }

        GenericArray<Book> books = new GenericArray<>(2);
        books.add(book);
        System.out.println(books.get(0));

        // 제네릭 메서드를 사용할 때는
        // 매개변수, 반환타입을 기반으로 컴파일러가 제네릭타입을 추론
        GenericArray<Device> g1 = GenericArray.<Device>practiceGeneric(mac);
        // Type parameter 'com.grepp.library.c_collection.a_generic.domain.Book' is not within its bound; should extend 'com.grepp.library.c_collection.a_generic.domain.Device'
        // T extends Device : Device 타입을 가지고 있지 않은 Book은 올 수 없다.
        // GenericArray<Book> g2 = GenericArray.<Book>practiceExtends(book);
        GenericArray<Device> g2 = GenericArray.<Device>practiceExtends(mac);

        // NOTE 04 generic은 무공변성이다. casting이 안됨
        // GenericArray<Device>은 GenericArray.<Computer> 상위 타입이 아님
        // GenericArray<Device> g3 = GenericArray.<Computer>practiceExtends(mac);

        // NOTE 05 와일드 카드 : ?
        // 제네릭메서드에서는 사용할 수 없다.(뒤쪽 Computer 자리)
        // 상한 경계 : < ? extends T >
        // GenericArray<? extends Device>이 Device의 후손타입을 제네릭 타입으로 가지는
        // GenericArray<T>에 대해 상위타입이 된다.
        GenericArray<? extends Device> g3 = GenericArray.<Computer>practiceExtends(mac);

        // NOTE 06 하안 경계
        // <? super T>
        // T 타입의 선조타입
        // computer랑 상관없는 book, number등은 들어 올 수 없음
        // 하한 경계는 잘 안씀
        GenericArray<? super Computer> g4 = GenericArray.<Device>practiceGeneric(mac);

        // object로 잡아버림
        // g4.add(mac);
        // g4.get(mac).




    }
}
