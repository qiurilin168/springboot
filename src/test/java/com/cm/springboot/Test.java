package com.cm.springboot;

public class Test {

    boolean b;
    byte by;
    short s;
    char c;
    int i;
    long l;
    float f;
    double d;

    Boolean B;
    Byte By;
    Short S;
    Character C;
    Integer I;
    Long L;
    Float F;
    Double D;

    String string;




    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("boolean "+test.b);
        System.out.println("byte "+test.by);
        System.out.println("short "+test.s);
        System.out.println("char "+test.c);
        System.out.println("int "+test.i);
        System.out.println("long "+test.l);
        System.out.println("float "+test.f);
        System.out.println("double "+test.d);
        System.out.println("----------------");
        System.out.println("boolean "+test.B);
        System.out.println("byte "+test.By);
        System.out.println("short "+test.S);
        System.out.println("char "+test.C);
        System.out.println("int "+test.I);
        System.out.println("long "+test.L);
        System.out.println("float "+test.F);
        System.out.println("double "+test.D);

        System.out.println(test.string);
    }
}

