/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryAritmetica;

import java.util.Scanner;

/**
 *
 * @author LN710Q
 */
public class Suma implements Operacion{

    @Override
    public double operar(double a, double b) {
        return a+b;
    }

}
