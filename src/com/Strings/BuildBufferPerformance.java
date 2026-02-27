package com.Strings;

public class BuildBufferPerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Placements");
        for (int i = 0; i <100000000; i++) {
            sbf.append("Training");
        }
        System.out.println("Time taken by String Buffer:" + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        StringBuilder sbl = new StringBuilder("Placements");
        for (int i = 0; i < 100000000; i++) {
            sbl.append("Training");
        }
        System.out.println("Time taken by String Builder: " + (System.currentTimeMillis() - startTime) + "ms");

    }
}

