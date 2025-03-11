// 2025.03.11 (화)
package com.grepp.library.c_collection.a_generic;

import com.grepp.library.c_collection.a_generic.domain.Device;
import org.w3c.dom.ls.LSOutput;


// NOTE A01 : Generic
// 클래스 외부에서 클래스 내부에서 사용할 타입을 결정하는 것.
// 클래스 선언부나 메서드 선언부에 <Generic 매개변수>를 선언해 사용 가능
// Generic은 여러개 사용할 수 잇다.

public class GenericArray<E> {

    // device를 저장할수 있는 제네릭 array
    // 타입을 선언하는 지점에서는 제네릭 선언 x
    private Object[] elements; //object 자리에 E안됨
    private int size;
    private int pointer;

    public GenericArray(int size) {
        this.size = size;
        elements = new Object[size];
    }

    public int size(){
        return size;
    }

    // 외부에서 결정한 타입의 인스턴스만 들어올 수 있음
    public void add(E e){
        if(pointer == size){
            System.out.println("용량이 부족합니다.");
            return;
        }
        elements[pointer] = e;
        pointer++;
    }



    public E get(int idx){
        if(idx < 0 || idx >= size) throw new IndexOutOfBoundsException();
        return (E)elements[idx]; //오브젝트 배열에 있던걸 외부에서 정한 걸 캐스팅 해서 리턴함.
    }
}
