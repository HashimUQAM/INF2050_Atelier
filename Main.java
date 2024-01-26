import java.io.IOException;
import java.util.List;

import static java.lang.System.*;
import net.sf.json.JSONObject;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        JSONObject assuranceJSON = hashClass.loadJSONtoJSONObject("src/Assurance.json");
        String lettreContrat = hashClass.obtenirLettreContrat(assuranceJSON);
        out.println(lettreContrat);
        List<Integer> numeroDeSoin = hashClass.obtenirNumerosDeSoins(assuranceJSON);
        out.println(numeroDeSoin);
        List<Double> montants = hashClass.obtenirMontants(assuranceJSON);
        out.println(montants);
        List<String> categoriesSoins = hashClass.categoriesSoins(numeroDeSoin);
        out.println(categoriesSoins);
        List<Double> montantRembourse = calcul.montantRembourse(categoriesSoins,lettreContrat,montants);
        out.println(montantRembourse);
    }
}