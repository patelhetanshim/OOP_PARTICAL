package apack;

public class A {
    public int pubVar;
    protected int protVar;
    private int privVar;

    public A(int pubVar, int protVar, int privVar) {
        this.pubVar = pubVar;
        this.protVar = protVar;
        this.privVar = privVar;
    }

    public int getPrivVar() {
        return privVar;
    }
}
package bpack;

import apack.A;

public class B extends A {

    public B(int pubVar, int protVar, int privVar) {
        super(pubVar, protVar, privVar);
    }

    public void display() {
        System.out.println("\nFrom Class B (Subclass):");
        System.out.println("Public Variable: " + pubVar);
        System.out.println("Protected Variable: " + protVar);
        System.out.println("Private Variable (via getter): " + getPrivVar());
    }
}
package cpack;

import apack.A;

public class C {

    public void display(int pubVar, int protVar, int privVar) {
        A obj = new A(pubVar, protVar, privVar);

        System.out.println("\nFrom Class C (Non-Subclass):");
        System.out.println("Public Variable: " + obj.pubVar);
        System.out.println("Private Variable (via getter): " + obj.getPrivVar());
    }
}
package dpack;

import java.util.Scanner;
import bpack.B;
import cpack.C;

public class pratical13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter values for Class B:");
        System.out.print("Public: ");
        int pub1 = sc.nextInt();
        System.out.print("Protected: ");
        int prot1 = sc.nextInt();
        System.out.print("Private: ");
        int priv1 = sc.nextInt();

        B objB = new B(pub1, prot1, priv1);
        objB.display();

        
        System.out.println("\nEnter values for Class C:");
        System.out.print("Public: ");
        int pub2 = sc.nextInt();
        System.out.print("Protected: ");
        int prot2 = sc.nextInt();
        System.out.print("Private: ");
        int priv2 = sc.nextInt();

        C objC = new C();
        objC.display(pub2, prot2, priv2);

        sc.close();
    }
}