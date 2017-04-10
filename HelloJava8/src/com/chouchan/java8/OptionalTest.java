package com.chouchan.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * chouchan
 */
public class OptionalTest {
    public static void main(String args[]){
//        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
//        System.out.println("all of the number:");
//        eval(list,n->true);
        // 默认方法
//        Younger younger = new Student();
//        younger.print();

        //Optional
        OptionalTest tester = new OptionalTest();
        Integer value1 = null;
        Integer value2 = null;

        // ofNullable 允许传参时给出 null
        Optional<Integer> a = Optional.ofNullable(value1);

        // 如果传递的参数为null，那么 of 将抛出空指针异常（NullPointerException）
        Optional<Integer> b = Optional.of(value2);
        System.out.println(tester.sum(a,b));
    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b){

        // isPresent 用于检查值是否存在

        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        // 如果当前返回的是传入的默认值，orElse 将返回它
        Integer value1 = a.orElse(new Integer(0));

        // get 用于获得值，条件是这个值必须存在
        Integer value2 = b.get();
        return value1 + value2;
    }


    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list) {
            if(predicate.test(n)) {
                System.out.println(n);
            }
        }
    }

    interface Younger {
        default void print() {
            System.out.println("I am a younger.");
        }

        static void sayHi() {
            System.out.println("Young is the capital.");
        }
    }

    interface Learner {
        default void print() {
            System.out.println("I am a learner.");
        }
    }

    static class Student implements Younger, Learner {
        public void print() {
            Younger.super.print();
            Learner.super.print();
            Younger.sayHi();
            System.out.println("I am a student!");
        }
    }
}
