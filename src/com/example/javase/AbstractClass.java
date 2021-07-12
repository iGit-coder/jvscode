package com.example.javase;

import com.example.entities.EntityExtendsAbs;
import com.example.interfaces.TestInterface;

public class AbstractClass implements TestInterface{

    @Override
    public void test() {
        // TODO Auto-generated method stub
        int s = EntityExtendsAbs.a;
        int b = EntityExtendsAbs.b;
    }
    
}
