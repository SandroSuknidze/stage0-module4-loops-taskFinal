package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        if (numberTableToPrint < 0) {
        } else {
            for (int i = 1; i <= 10; i++) {
                int sum = i * numberTableToPrint;
                String result = i + " x " + numberTableToPrint + " = " + sum;
                System.out.println(result);
            }
        }
    }
}
