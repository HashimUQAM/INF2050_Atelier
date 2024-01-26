import net.sf.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class calcul {
    public static double montantCalcul;
    public static List<Double> montantRembourse(List<String> categoriesSoins, String lettreContrat, List<Double> montants) throws IOException {
        List<Double> montantsRembourses = new ArrayList<>();
        double montantCalcul = 0;

        for (int i = 0; i < categoriesSoins.size(); i++) {
            String categorieSoin = categoriesSoins.get(i);
            double montant = montants.get(i);


            if (categorieSoin.equals("Massotherapie")) {
                if (lettreContrat.equals("A")) {
                    montantCalcul = montant * 0.25;
                } else if (lettreContrat.equals("B")) {
                    montantCalcul = montant * 0.50;
                    if (montantCalcul > 40.0) {
                        montantCalcul = 40.0;
                    }
                } else if (lettreContrat.equals("C")) {
                    montantCalcul = montant * 0.90;
                } else if (lettreContrat.equals("D")) {
                    montantCalcul = montant;
                    if (montantCalcul > 85.0) {
                        montantCalcul = 85.0;
                    }
                }
            } else if (categorieSoin.equals("Osteopathie")) {
                if (lettreContrat.equals("A")) {
                    montantCalcul = montant * 0.25;
                } else if (lettreContrat.equals("B")) {
                    montantCalcul = montant * 0.50;
                    if (montantCalcul > 50.0) {
                        montantCalcul = 50.0;
                    }
                } else if (lettreContrat.equals("C")) {
                    montantCalcul = montant * 0.90;
                } else if (lettreContrat.equals("D")) {
                    montantCalcul = montant;
                    if (montantCalcul > 75.0) {
                        montantCalcul = 75.0;
                    }
                }
            } else if (categorieSoin.equals("Psychologie individuelle")) {
                if (lettreContrat.equals("A")) {
                    montantCalcul = montant * 0.25;
                } else if (lettreContrat.equals("B")) {
                    montantCalcul = montant;
                    if (montantCalcul > 70.0) {
                        montantCalcul = 70.0;
                    }
                } else if (lettreContrat.equals("C")) {
                    montantCalcul = montant * 0.90;
                } else if (lettreContrat.equals("D")) {
                    montantCalcul = montant;
                    if (montantCalcul > 100.0) {
                        montantCalcul = 100.0;
                    }
                }
            } else if (categorieSoin.equals("Soins dentaires")) {
                if (lettreContrat.equals("A")) {
                    montantCalcul = 0;
                } else if (lettreContrat.equals("B")) {
                    montantCalcul = montant * 0.50;
                } else if (lettreContrat.equals("C")) {
                    montantCalcul = montant * 0.90;
                } else if (lettreContrat.equals("D")) {
                    montantCalcul = montant;
                }
            } else if (categorieSoin.equals("Naturopathie, acuponcture")) {
                if (lettreContrat.equals("A")) {
                    montantCalcul = 0;
                } else if (lettreContrat.equals("B")) {
                    montantCalcul = 0;
                } else if (lettreContrat.equals("C")) {
                    montantCalcul = montant * 0.90;
                } else if (lettreContrat.equals("D")) {
                    montantCalcul = montant;
                    if (montantCalcul > 65.0) {
                        montantCalcul = 65.0;
                    }
                }
            } else if (categorieSoin.equals("Chiropratie")) {
                if (lettreContrat.equals("A")) {
                    montantCalcul = montant * 0.25;
                } else if (lettreContrat.equals("B")) {
                    montantCalcul = montant * 0.50;
                    if (montantCalcul > 50.0) {
                        montantCalcul = 50.0;
                    }
                } else if (lettreContrat.equals("C")) {
                    montantCalcul = montant * 0.90;
                } else if (lettreContrat.equals("D")) {
                    montantCalcul = montant;
                    if (montantCalcul > 75.0) {
                        montantCalcul = 75.0;
                    }
                }
            } else if (categorieSoin.equals("Physiothérapie")) {
                if (lettreContrat.equals("A")) {
                    montantCalcul = montant * 0.40;
                } else if (lettreContrat.equals("B")) {
                    montantCalcul = montant;
                } else if (lettreContrat.equals("C")) {
                    montantCalcul = montant * 0.90;
                } else if (lettreContrat.equals("D")) {
                    montantCalcul = montant;
                    if (montantCalcul > 100.0) {
                        montantCalcul = 100.0;
                    }
                }
            } else if (categorieSoin.equals("Orthophonie, ergothérapie")) {
                if (lettreContrat.equals("A")) {
                    montantCalcul = 0;
                } else if (lettreContrat.equals("B")) {
                    montantCalcul = montant * 0.70;
                } else if (lettreContrat.equals("C")) {
                    montantCalcul = montant * 0.90;
                } else if (lettreContrat.equals("D")) {
                    montantCalcul = montant;
                    if (montantCalcul > 90.0) {
                        montantCalcul = 90.0;
                    }
                }
            }
            montantsRembourses.add(montantCalcul);
        }
        return  montantsRembourses;
    }
}
