package primerdesign_b025;

import java.util.ArrayList;
import java.util.Collections;

public class PrimerData {

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
