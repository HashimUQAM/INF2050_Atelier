import jdk.jfr.Category;
import net.sf.json.JSONArray;
import net.sf.json.JSONSerializer;
import net.sf.json.JSONObject;
import org.apache.commons.io.IOUtils;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class hashClass {
    

    public static JSONObject loadJSONtoJSONObject(String filepath) throws IOException {

        // Converti en un GROS String le fichier JSON
        String stringJson = IOUtils.toString(new FileInputStream(filepath), "UTF-8");

        // Convertie en "JSONObject" l'immense string construit plus haut.
        JSONObject assuranceJSON = (JSONObject) JSONSerializer.toJSON(stringJson);

        return assuranceJSON;

    }

    public static String obtenirLettreContrat(JSONObject jsonObject) {

        return jsonObject.getString("contrat");
    }

    public static List<Integer> obtenirNumerosDeSoins(JSONObject jsonObject) {
        JSONArray reclamations = jsonObject.getJSONArray("reclamations");
        List<Integer> numerosDeSoins = new ArrayList<>();

        for (int i = 0; i < reclamations.size(); i++) {
            numerosDeSoins.add(reclamations.getJSONObject(i).getInt("soin"));
        }

        return numerosDeSoins;
    }

    public static List<Double> obtenirMontants(JSONObject jsonObject) {
        JSONArray reclamations = jsonObject.getJSONArray("reclamations");
        List<Double> montants = new ArrayList<>();

        for (int i = 0; i < reclamations.size(); i++) {
            String montantStr = reclamations.getJSONObject(i).getString("montant").replace("$", "").trim();
            double montant = Double.parseDouble(montantStr);
            montants.add(montant);
        }

        return montants;
    }


    public static List<String> categoriesSoins(List<Integer> numerosSoins) {
        List<String> categories = new ArrayList<>();

        for (int numeroSoin : numerosSoins) {
            String categorie;
            if (numeroSoin == 0) {
                categorie = "Massotherapie";
            } else if (numeroSoin == 100) {
                categorie = "Osteopathie";
            } else if (numeroSoin == 200) {
                categorie = "Psychologie individuelle";
            } else if (numeroSoin >= 300 && numeroSoin <= 399) {
                categorie = "Soins dentaires";
            } else if (numeroSoin == 400) {
                categorie = "Naturopathie, acuponcture";
            } else if (numeroSoin == 500) {
                categorie = "Chiropratie";
            } else if (numeroSoin == 600) {
                categorie = "Physiothérapie";
            } else if (numeroSoin == 700) {
                categorie = "Orthophonie, ergothérapie";
            } else {
                categorie = "Inconnue";
            }
            categories.add(categorie);
        }

        return categories;
    }

}







