package primerdesign_b025;

import java.util.ArrayList;
import java.util.Collections;

public class PrimerData {

    private static int count = 0;
    private static final int MIN_SIZE = PrimerSetting.minSize;
    private static final int MAX_SIZE = PrimerSetting.maxSize;

    public static void generateForwardPrimers(DNA dna, ArrayList<PrimerOutcome> forwardPrimers) {

        for (int i = 0; i < dna.getStartIndex() - MIN_SIZE; i++) {
            for (int j = i + MIN_SIZE - 1; j <= i + MAX_SIZE; j++) {
                if (j > dna.getStartIndex()) {
                    break;
                }
                count++;
                String primerSequence = dna.getSequence().substring(i, j);
                int primerLength = primerSequence.length();
                double cCount = primerLength - primerSequence.replace("C", "").length();
                double gCount = primerLength - primerSequence.replace("G", "").length();
                double aCount = primerLength - primerSequence.replace("A", "").length();
                double tCount = primerLength - primerSequence.replace("T", "").length();
                double CGcount = cCount + gCount;
                double cgContent = CGcount / primerLength;
                double tm = (4 * (gCount + cCount) + 2 * (aCount + tCount));

                if (cgContent >= (PrimerSetting.minCG / 100) && cgContent <= (PrimerSetting.maxCG / 100)
                        && tm >= PrimerSetting.minTemperature && tm <= PrimerSetting.maxTemperature) {
                    PrimerOutcome primer = new PrimerOutcome(primerSequence, i, primerLength, tm, cgContent, PrimerType.FORWARD);
                    forwardPrimers.add(primer);
                }
            }
        }System.out.println("All forwards: " + count);
    }

    public static void generateReversePrimers(DNA dna, ArrayList<PrimerOutcome> reversePrimers) {
        for (int i = dna.getEndIndex(); i < dna.getSequence().length() - MIN_SIZE; i++) {
            for (int j = i + MIN_SIZE; j < i + MAX_SIZE + 1; j++) {
                if (j > dna.getSequence().length()) {
                    break;
                }
                count++;
                String primerSequence = dna.getSequence().substring(i, j);
                int primerLength = primerSequence.length();
                double cCount = primerLength - primerSequence.replace("C", "").length();
                double gCount = primerLength - primerSequence.replace("G", "").length();
                double aCount = primerLength - primerSequence.replace("A", "").length();
                double tCount = primerLength - primerSequence.replace("T", "").length();
                double CGcount = cCount + gCount;
                double cgContent = CGcount / primerLength;
                double tm = (4 * (gCount + cCount) + 2 * (aCount + tCount));

                if (cgContent >= (PrimerSetting.minCG / 100) && cgContent <= (PrimerSetting.maxCG / 100)
                        && tm >= PrimerSetting.minTemperature && tm <= PrimerSetting.maxTemperature) {
                    PrimerOutcome primer = new PrimerOutcome(primerSequence, i, primerLength, tm, cgContent, PrimerType.REVERSE);
                    reversePrimers.add(primer);
                }
            }
        }System.out.println("All reverses: " + count);
    }

    public static void sortOptimal(ArrayList<PrimerOutcome> primerOutcomes) {
        for (int i = 0; i < primerOutcomes.size(); i++) {
            if (primerOutcomes.get(i).getLength() == PrimerSetting.OPTIMAL_SIZE
                    && primerOutcomes.get(i).getTemperature() == PrimerSetting.OPTIMAL_TEMPERATURE
                    && primerOutcomes.get(i).getCG() == (PrimerSetting.optimalCG / 100)) {
                PrimerOutcome temp = primerOutcomes.get(i);
                primerOutcomes.remove(i);
                primerOutcomes.add(0, temp);
            }
        }
    }

    public static void sortLength(ArrayList<PrimerOutcome> primerOutcomes) {
        for (int i = 0; i < primerOutcomes.size() - 1; i++) {
            for (int j = 0; j < primerOutcomes.size() - i - 1; j++) {
                if (Math.abs(primerOutcomes.get(j).getLength() - PrimerSetting.OPTIMAL_SIZE) > Math.abs(primerOutcomes.get(j + 1).getLength() - PrimerSetting.OPTIMAL_SIZE)) {
                    Collections.swap(primerOutcomes, j, j + 1);
                }
            }
        }
    }

    public static void sortTm(ArrayList<PrimerOutcome> primerOutcomes) {
        for (int i = 0; i < primerOutcomes.size() - 1; i++) {
            for (int j = 0; j < primerOutcomes.size() - i - 1; j++) {
                if (Math.abs(primerOutcomes.get(j).getTemperature() - PrimerSetting.OPTIMAL_TEMPERATURE) > Math.abs(primerOutcomes.get(j + 1).getTemperature() - PrimerSetting.OPTIMAL_TEMPERATURE)) {
                    Collections.swap(primerOutcomes, j, j + 1);
                }
            }
        }
    }

    public static void sortCG(ArrayList<PrimerOutcome> primerOutcomes) {
        for (int i = 0; i < primerOutcomes.size() - 1; i++) {
            for (int j = 0; j < primerOutcomes.size() - i - 1; j++) {
                if (Math.abs(primerOutcomes.get(j).getCG() - (PrimerSetting.optimalCG / 100)) > Math.abs(primerOutcomes.get(j + 1).getCG() - (PrimerSetting.optimalCG / 100))) {
                    Collections.swap(primerOutcomes, j, j + 1);
                }
            }
        }
    }
}
