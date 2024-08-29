package ar.edu.unju.escmi.ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Declaración de variables
        int a = 8;
        int b = 3;
        int c = -5;

        // a) a + b + c
        int resultadoA = a + b + c;
        System.out.println("a) a + b + c = " + resultadoA);

        // b) 2 * b + 3 * (a – c)
        int resultadoB = 2 * b + 3 * (a - c);
        System.out.println("b) 2 * b + 3 * (a – c) = " + resultadoB);

        // c) a / b (resultado decimal)
        double resultadoC = (double) a / b;
        System.out.println("c) a / b = " + resultadoC);

        // d) a % b
        int resultadoD = a % b;
        System.out.println("d) a % b = " + resultadoD);

        // e) a / c (resultado decimal)
        double resultadoE = (double) a / c;
        System.out.println("e) a / c = " + resultadoE);

        // f) a % c
        int resultadoF = a % c;
        System.out.println("f) a % c = " + resultadoF);

        // g) a * b / c (resultado decimal)
        double resultadoG = (double) (a * b) / c;
        System.out.println("g) a * b / c = " + resultadoG);

        // h) a * (b / c) (resultado decimal)
        double resultadoH = a * ((double) b / c);
        System.out.println("h) a * (b / c) = " + resultadoH);

        // i) (a * c) % b
        int resultadoI = (a * c) % b;
        System.out.println("i) (a * c) % b = " + resultadoI);

        // j) a * (c % b)
        int resultadoJ = a * (c % b);
        System.out.println("j) a * (c % b) = " + resultadoJ);

        // k) (3 * a – 2 * b) % (2 * a – c)
        int resultadoK = (3 * a - 2 * b) % (2 * a - c);
        System.out.println("k) (3 * a – 2 * b) % (2 * a – c) = " + resultadoK);

        // l) 2 * ( a / 5 + (4 - b * 3)) % (a + c - 2)
        int resultadoL = 2 * (a / 5 + (4 - b * 3)) % (a + c - 2);
        System.out.println("l) 2 * ( a / 5 + (4 - b * 3)) % (a + c - 2) = " + resultadoL);

        // m) (a - 3 * b) % (c + 2 * a) / (a - c) (resultado decimal)
        double resultadoM = (double) ((a - 3 * b) % (c + 2 * a)) / (a - c);
        System.out.println("m) (a - 3 * b) % (c + 2 * a) / (a - c) = " + resultadoM);

        // n) a - b - c * 2
        int resultadoN = a - b - c * 2;
        System.out.println("n) a - b - c * 2 = " + resultadoN);
    }
}
