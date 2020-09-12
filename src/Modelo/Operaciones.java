/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Operaciones {
    private int op1, op2;

    public Operaciones(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    public int getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }
    public int Suma(){
        return op1+op2;
    }
    public int Multi(){
        return op1*op2;
    }
    public int Resta(){
        return op1-op2;
    }
    public double Division(){
        return (double) op1/op2;
    }

}
