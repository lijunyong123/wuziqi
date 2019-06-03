package com.service.lj2048.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestLj2048 {

        Lj2048Delegate lj2048Delegate = new Lj2048Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = lj2048Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}