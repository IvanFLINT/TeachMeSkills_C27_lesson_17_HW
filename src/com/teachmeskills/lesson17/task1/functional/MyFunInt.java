package com.teachmeskills.lesson17.task1.functional;

/**
 * The functional interface contains the doSomething method.
 */
@FunctionalInterface
public interface MyFunInt<T>{
    T doSomething(T obj);
}
