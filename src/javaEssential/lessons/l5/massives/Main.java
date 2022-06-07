package javaEssential.lessons.l5.massives;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] mass1 = new int[] {1,4,6};
        int[] mass2 = new int[] {0,4,1};
        int[] ints = mergeToArrays(mass1,mass2);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] mergeToArrays(int[] mass1, int[] mass2) {
        int[] tempMass = new int[mass1.length + mass2.length];
        System.arraycopy(mass1, 0, tempMass, 0, mass1.length);
        System.arraycopy(mass2, 0, tempMass, mass1.length, mass2.length);
        return tempMass;
    }
}
