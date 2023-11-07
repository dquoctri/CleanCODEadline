package com.dqtri.clean.handbook.formatting;

public class HorizontalOpennessAndDensity {
    int lineCount = 0;
    int totalChars = 0;
    private TeamRules.LineWidthHistogram lineWidthHistogram;
    private void recordWidestLine(int lineSize) {

    }

    private void measureLine(String line) {
        lineCount++;
        int lineSize = line.length();
        totalChars += lineSize;
        lineWidthHistogram.addLine(lineSize, lineCount);
        recordWidestLine(lineSize);
    }



    class Quadratic {
        public static double root1(double a, double b, double c) {
            double determinant = determinant(a, b, c);
            return (-b + Math.sqrt(determinant)) / (2*a);
        }
        public static double root2(int a, int b, int c) {
            double determinant = determinant(a, b, c);
            return (-b - Math.sqrt(determinant)) / (2*a);
        }
        private static double determinant(double a, double b, double c) {
            return b*b - 4*a*c;
        }
    }


}
