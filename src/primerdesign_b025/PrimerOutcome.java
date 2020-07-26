package primerdesign_b025;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

enum PrimerType {
    FORWARD, REVERSE
}

public class PrimerOutcome {

    private String sequence;
    private int startIndex;
    private int length;
    private double temperature;
    private double CG;
    private PrimerType type;

    public PrimerOutcome(String sequence, int startIndex, int length, double temperature, double CG, PrimerType type) {
        this.sequence = sequence;
        this.startIndex = startIndex;
        this.length = length;
        this.temperature = temperature;
        this.CG = CG;
        this.type = type;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getCG() {
        return CG;
    }

    public void setCG(double CG) {
        this.CG = CG;
    }

    public PrimerType getType() {
        return type;
    }

    public void setType(PrimerType type) {
        this.type = type;
    }

    public static void sortOptimalForward(ArrayList<PrimerOutcome> forwardList) {
        for (int i = 0; i < forwardList.size(); i++) {
            if (forwardList.get(i).getLength() == 20 && forwardList.get(i).getTemperature() == 60 && forwardList.get(i).getCG() == 0.5) {
                PrimerOutcome temp = forwardList.get(i);
                forwardList.remove(i);
                forwardList.add(0, temp);
            }
        }
    }

    public static void sortOptimalReverse(ArrayList<PrimerOutcome> reverseList) {
        for (int i = 0; i < reverseList.size(); i++) {
            if (reverseList.get(i).getLength() == 20 && reverseList.get(i).getTemperature() == 60 && reverseList.get(i).getCG() == 0.5) {
                PrimerOutcome temp = reverseList.get(i);
                reverseList.remove(i);
                reverseList.add(0, temp);
            }
        }
    }

    public static void sortLengthForward(ArrayList<PrimerOutcome> forwardList) {
        for (int i = 0; i < forwardList.size() - 1; i++) {
            for (int j = 0; j < forwardList.size() - i - 1; j++) {
                if (Math.abs(forwardList.get(j).getLength() - 20) > Math.abs(forwardList.get(j + 1).getLength() - 20)) {
                    Collections.swap(forwardList, j, j + 1);
                }
            }
        }
    }

    public static void sortLengthReverse(ArrayList<PrimerOutcome> reverseList) {
        for (int i = 0; i < reverseList.size() - 1; i++) {
            for (int j = 0; j < reverseList.size() - i - 1; j++) {
                if (Math.abs(reverseList.get(j).getLength() - 20) > Math.abs(reverseList.get(j + 1).getLength() - 20)) {
                    Collections.swap(reverseList, j, j + 1);
                }
            }
        }
    }

    public static void sortTmForward(ArrayList<PrimerOutcome> forwardList) {
        for (int i = 0; i < forwardList.size() - 1; i++) {
            for (int j = 0; j < forwardList.size() - i - 1; j++) {
                if (Math.abs(forwardList.get(j).getTemperature() - 60) > Math.abs(forwardList.get(j + 1).getTemperature() - 60)) {
                    Collections.swap(forwardList, j, j + 1);
                }
            }
        }
    }

    public static void sortTmReverse(ArrayList<PrimerOutcome> reverseList) {
        for (int i = 0; i < reverseList.size() - 1; i++) {
            for (int j = 0; j < reverseList.size() - i - 1; j++) {
                if (Math.abs(reverseList.get(j).getTemperature() - 60) > Math.abs(reverseList.get(j + 1).getTemperature() - 60)) {
                    Collections.swap(reverseList, j, j + 1);
                }
            }
        }
    }

    public static void sortCGForward(ArrayList<PrimerOutcome> forwardList) {
        for (int i = 0; i < forwardList.size() - 1; i++) {
            for (int j = 0; j < forwardList.size() - i - 1; j++) {
                if (Math.abs(forwardList.get(j).getCG() - 0.5) > Math.abs(forwardList.get(j + 1).getCG() - 0.5)) {
                    Collections.swap(forwardList, j, j + 1);
                }
            }
        }
    }

    public static void sortCGReverse(ArrayList<PrimerOutcome> reverseList) {
        for (int i = 0; i < reverseList.size() - 1; i++) {
            for (int j = 0; j < reverseList.size() - i - 1; j++) {
                if (Math.abs(reverseList.get(j).getCG() - 0.5) > Math.abs(reverseList.get(j + 1).getCG() - 0.5)) {
                    Collections.swap(reverseList, j, j + 1);
                }
            }
        }
    }

    public void display(int i) {
        DecimalFormat df = new DecimalFormat("##.##");

            System.out.println(type.toString() + " PRIMER " + (int) (i + 1) + ":");
            System.out.println(sequence);
            System.out.println();
            System.out.println("Start index: " + startIndex);
            System.out.println("Length:      " + (int) Math.rint(length) + " bp");
            System.out.println("Tm:          " + (int) Math.rint(temperature) + " °C");
            System.out.println("CG%:         " + df.format(CG * 100) + "%");
            System.out.println("_____________");
        }
    }
