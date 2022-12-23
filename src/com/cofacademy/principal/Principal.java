package com.cofacademy.principal;
import com.cofacademy.calculadora.Calculadora;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Selecciona la opcion que deseas utilizar" +
                " 1) suma " + " 2) resta " + " 3) multiplicacion " + " 4) division ");

        String Seleccion = JOptionPane.showInputDialog("Ingresa la operación que deseas realizar");
        int operacion = Integer.parseInt(Seleccion);
        String NUM1 = JOptionPane.showInputDialog("Ingresa el primer número");
        String NUM2 = JOptionPane.showInputDialog("Ingresa el segundo número");

        //DECLARACION DE VARIABLES FLOAT PARA EL INGRESO DE NUMEROS CON DECIMAL A PARTIR DE UN STRING
        float num1 = Float.parseFloat(NUM1);
        float num2 = Float.parseFloat(NUM2);

        //CREACION DE OBJETO DE LA CLASE CALCULADORA
        Calculadora cal = new Calculadora();

        //ALMACENAMIENTO DE RESULTADO DE MÉTODO DE OBJETO DE LA CLASE CALCULADOR
        switch (operacion){
            case 1 :
                float add = cal.operacionSuma(num1,num2);
                JOptionPane.showMessageDialog(null,"The results is " + add);
                break;
            case 2 :
                float less = cal.operacioResta(num1,num2);
                JOptionPane.showMessageDialog(null,"The result is " + less);
                break;
            case 3 :
                float mult = cal.operacionMultiplicacion(num1,num2);
                JOptionPane.showMessageDialog(null,"The result is " + mult);
                break;
            case 4 :
                if(num2 == 0) {
                    JOptionPane.showMessageDialog(null,"No es posible divir entre 0");
                }else {
                    float div = cal.operacioDivision(num1, num2);
                    JOptionPane.showMessageDialog(null, String.format("The result is " + div));
                    break;
                }
        }
    }
}

