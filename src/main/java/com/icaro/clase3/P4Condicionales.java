package com.icaro.clase3;

public class P4Condicionales {

    public static void main(String[] args) {

        int var1 = 100;
        int var2 = 200;

        if (var1 < var2) {
            System.out.println("var1 es menor a var2");
        }
        char var3 = 'C';
        char var4 = 'N';

        if (var3 == var4) {
            System.out.println("var3 es igual a var4");
        }
        else {
            System.out.println("Son distintos");
        }

        long var5 = 1000;
        if (var5 < 10) {
            System.out.println("numero chico");
        } else if (var5 > 50 && var5 < 200) {
            System.out.println("numero mediano");
        } else if (var5 > 500 && var5 < 1000) {
            System.out.println("numero grande");
        }else {
            System.out.println("numero muy grande");
        }

        String dia = "Domingo";

        switch (dia) {
            case "lunes":
                System.out.println("Es lunes");
                break;
            case "Martes":
                System.out.println("Es Martes");
                break;
            case "Miercoles":
                System.out.println("Es Miercoles");
                break;
                case "Jueves":
                System.out.println("Es Jueves");
                break;
                case "Viernes":
                System.out.println("Es Viernes");
                break;
            default:
                System.out.println("Es fin de semana");
        }
    }
}
