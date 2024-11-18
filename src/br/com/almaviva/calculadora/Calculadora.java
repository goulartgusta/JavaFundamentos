package br.com.almaviva.calculadora;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculadora {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String operacao = sc.nextLine();
        double resultado = calcularPorOrdem(operacao);
        System.out.println("Resultado = " + resultado);
        sc.close();
    }

    public static double calcularPorOrdem(String operacao) {
        operacao = calcularParenteses(operacao);
        operacao = calcularMultDiv(operacao);    
        double resultadoFinal = calcularSomaSub(operacao);
       
        return resultadoFinal;
    }

    public static String calcularParenteses(String operacao) {
        Pattern operacaoParentesesPattern = Pattern.compile("\\(([^()]+)\\)");
        Matcher matcher = operacaoParentesesPattern.matcher(operacao);

        while (matcher.find()) {
            String operacaoParenteses = matcher.group(1);
            double resultado = calcularPorOrdem(operacaoParenteses);
            int start = matcher.start();
            int end = matcher.end();
            operacao = operacao.substring(0, start) + resultado + operacao.substring(end);

            matcher = operacaoParentesesPattern.matcher(operacao);
        }

        return operacao;
    }

    public static String calcularMultDiv(String operacao) {
        Pattern multDivPattern = Pattern.compile("(-?\\d+\\.?\\d*)([*/])(-?\\d+\\.?\\d*)");
        Matcher matcher = multDivPattern.matcher(operacao);

        while (matcher.find()) {
            double numAntecessor = Double.parseDouble(matcher.group(1));
            String operador = matcher.group(2);
            double numSucessor = Double.parseDouble(matcher.group(3));

            double resultado;
            if (operador.equals("*")) {
                resultado = numAntecessor * numSucessor;
            } else {
                resultado = numAntecessor / numSucessor;
            }

            System.out.println(numAntecessor + " " + operador + " " + numSucessor + " = " + resultado);
            int start = matcher.start();
            int end = matcher.end();
            operacao = operacao.substring(0, start) + resultado + operacao.substring(end);
            System.out.println(operacao);
            matcher = multDivPattern.matcher(operacao);
        }

        return operacao;
    }

    private static double calcularSomaSub(String operacao) {
        Pattern somaSubPattern = Pattern.compile("(-?\\d+\\.?\\d*)([+-])(-?\\d+\\.?\\d*)");
        Matcher matcher = somaSubPattern.matcher(operacao);

        while (matcher.find()) {
            double numAntecessor = Double.parseDouble(matcher.group(1));
            String operador = matcher.group(2);
            double numSucessor = Double.parseDouble(matcher.group(3));

            double resultado;
            if (operador.equals("+")) {
                resultado = numAntecessor + numSucessor;
            } else {
                resultado = numAntecessor - numSucessor;
            }

            System.out.println(numAntecessor + " " + operador + " " + numSucessor + " = " + resultado);
            int start = matcher.start();
            int end = matcher.end();
            operacao = operacao.substring(0, start) + resultado + operacao.substring(end);
            matcher = somaSubPattern.matcher(operacao);
        }

        return Double.parseDouble(operacao);
    }
}
