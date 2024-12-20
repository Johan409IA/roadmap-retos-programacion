public class JotaScript {

    public static void main(String[] args) {

        // operadores aritmeticos
        int num = 5;
        int num2 = 4;
        int suma = num + num2; // suma
        int resta = num - num2; // resta
        int multiplicacion = num * num2; // multiplicacion
        int division = num / num2; // division
        int potencia = num ^ num2; // potencia
        int modulo = num % num2; // modulo

        // operadores relacionales e igualdad
        boolean igual = num == num2; // igual que
        boolean mayor = num > num2;  // mayor que
        boolean menor = num < num2; // menor que
        boolean menor_o = num <= num2; // menor o igual que
        boolean mayor_o = num <= num2; // mayor o igual que
        int asignacion = num = num2; // asignar un valor a

        // operadores logicos
        boolean and = num2 < num2 && num <= num2; // y
        boolean or = num < num2 || num2 >= num; // 0
        boolean not = num != num2; // no

        // operadores de bit a bit
        int desplazamiento = 2;
        int result_bit_and = 5 & 4;
        int result_bit_or = 5 | 4;
        int result_bit_XOR = ~5;
        int result_bit_COM = 4 ^ 5;
        int desplazamientos = 4 >> desplazamiento;
        int desplaza = 5 << desplazamiento;

        // operadores unarios y de incremento/decremento
        num++;
        ++num;
        num2++;
        --num2;
        num = +2;
        num2 = -3;

        // estructuras de contro
        int edad = 20;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");

        }

        while (edad > 18) {
            System.out.println("Eres mayor");
            edad--;
        }

        do {
            System.out.println("Hola Java!");
        } while (edad > 20);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }

        int dia = 5;
        switch (5) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");

            case 4:
                System.out.println("Es jueves");
            case 5:
                System.out.println("Es viernes");
                break;
            default:
                System.out.println("Numero invalido");

        }

        try {
            int divide = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ERROR: " + e);
            System.out.println("No se puede dividir entre 0");
        } finally {
            System.out.println("El programa continua");
        }

        // EXTRA
        for (int i = 10; i < 16; i++) {
            if (i % 2 == 0 && i != 16 && i % 3 != 0) {
                System.out.println(i);
            }

        }

    }

}
