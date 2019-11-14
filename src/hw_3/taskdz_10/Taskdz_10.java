package hw_3.taskdz_10;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Taskdz_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Vvedite chislo bolshe 3: ");
        int n = sc.nextInt();
        if (n < 3) {
            System.out.println("Vvedeno chislo menshe 3");
        }
        if (n == 3) {
            System.out.println("Vvedeno chislo ravno 3");
        }

        int[] firstArr = new int[n];
        Random rand = new Random();
        int counter = 0;
        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = rand.nextInt(n);
            if (firstArr[i] % 2 == 0 && firstArr[i] != 0) {
                counter++;
            }
        }
        System.out.println(Arrays.toString(firstArr));
        System.out.println(counter);

        int counterArr = 0;
        int[] secondArr = new int[counter];
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] % 2 == 0 && firstArr[i] != 0) {
                secondArr[counterArr] = firstArr[i];
                counterArr++;
            }
        }
        System.out.println(Arrays.toString(secondArr));
// dop zadanie 1
        int multiply = 1;
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] % 3 == 0 && firstArr[i] != 0) {
                multiply *= firstArr[i];
            }
        }
        System.out.println("Proizvedenie elementov kratnyh 3: " + multiply);
// dop zadanie 2
        int sumAbsNechetIndex = 0;

        int counterAbsNechetIndex = 0;
        for (int i = 0; i < firstArr.length; i++) {
            if (i % 2 != 0) {
                sumAbsNechetIndex += firstArr[i];
                counterAbsNechetIndex++;
            }
        }
        float absNechetIndex = (float) sumAbsNechetIndex / counterAbsNechetIndex;
        System.out.println("Srednee arifmeticheskoe elementov s nechetnymi indeksami: " + absNechetIndex);

// dop zadanie 3
        System.out.println("Vvedite chislo: ");
        int c = sc.nextInt();
        int sumAbsC = 0;
        int counterAbsC = 0;
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] > c) {
                sumAbsC += firstArr[i];
                counterAbsC++;
            }
        }
        float absC = (float) sumAbsC / counterAbsC;
        System.out.println("Srednee arifmeticheskoe elementov, kotorye bolshe " + c + ": " + absC);
// dop zadanie 4
        int minNechet = firstArr[1];
        for (int i = 0; i < firstArr.length; i++) {
            if (i % 2 != 0 && firstArr[i] < minNechet) {
                minNechet = firstArr[i];
            }
        }
        System.out.println("Naimenshii nechetnyi element: " + minNechet);
// dop zadanie 5
        int[] arrNechet0 = new int[firstArr.length];
        for (int i = 0; i < firstArr.length; i++) {
            arrNechet0[i] = firstArr[i];
            if (i % 2 != 0) {
                arrNechet0[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arrNechet0));
// dop zadanie 6
        int tempMemory = firstArr[0];
        int counterMemory = 0;

        for (int i = 0; i < firstArr.length; i++) {
            tempMemory = firstArr[i];
            counterMemory = 0;
            for (int j = 0; j < firstArr.length; j++) {
                if (firstArr[j] == tempMemory) {
                    counterMemory++;
                    if (counterMemory > 1) break;
                }
            }
            if (counterMemory > 1) break;
        }
        if (counterMemory == 1) {
            System.out.println("Massiv s razlichnymi elementami");
        } else System.out.println("Massiv s odinakovymi elementami");
// dop zadanie 7
        System.out.print("Vvedite chislo: ");
        int num = sc.nextInt();
        int counterRepeat = 0;
        for (int i = 0; i < firstArr.length; i++) {
            if (num == firstArr[i]) {
                counterRepeat++;
            }
        }
        System.out.println("Chislo " + num + " vstrechayetsya " + counterRepeat + " раз/а");
// dop zadanie 8
        HashSet<Integer> myHashSet = new HashSet<Integer>();
        for (int i = 0; i < firstArr.length; i++) {
            myHashSet.add(firstArr[i]);
        }
        for (int i : myHashSet) {
            System.out.print(i + " ");

        }
        System.out.println();
        Object[] myArr = myHashSet.toArray();
        System.out.println(myArr[myArr.length - 2]);


// dop zadanie 9

        int counter9 = 0;

        for (int i = 0; i < firstArr.length; i++) {
            if (i % 2 == 0 && i != 0){
                counter9++;
            }
        }
        int[] naimArr = new int[counter9];
        counter9 = 0;
        for (int i = 2; i < firstArr.length; i += 2) {
           naimArr[counter9] = firstArr[i];
           counter9++;
        }
        Arrays.sort(naimArr);
        System.out.println("Naimenshii element s chetnym indeksom: " + naimArr[0]);
// dop zadanie 10
        int max = firstArr[0];
        int mem = 0;
        int buf;
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] >= max){
                mem = i;
            }
        }
        buf = firstArr[0];
        firstArr[0] = firstArr[mem];
        firstArr[mem] = buf;
        System.out.println(Arrays.toString(firstArr));


    }
}
