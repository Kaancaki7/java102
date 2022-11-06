package collection;

import SiniflarArasiIliskiler.Course;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {

        Map<String,String> country = new HashMap<>();

        //key - value ikilisini kayıt eder
        country.put("TR","TURKIYE");
        country.put("EN","INGILTERE");
        country.put("FR","FRANSA");
        country.put("GR","ALMANYA");
        country.put("US","AMERIKA");


        //tamamen siler
        //country.clear();

        //anahtar önceden girilmiş mi diye sorgular
        System.out.println(country.containsKey("TR"));

        //değer önceden girilmiş mi diye sorgular
        System.out.println(country.containsValue("BREZILYA"));

        //anahtara karşılık gelen objeyi döndürür
        System.out.println(country.get("TR"));

        //belli bir anahtara karşılık gelen yeri siler
        country.remove("US");

        //listeyi gösterir
        System.out.println(country.size());

        //keye karşılık gelen objeyi değiştirir
        country.replace("EN","Ingiltere");

        //listeyi gezebilirz for-each'le iterator kullanılmaz maplerde

        //keyler gezilir
        for (String countryKey : country.keySet()) {
            System.out.println(countryKey);
        }

        //value' ler gezilir
        for (String countryValue : country.values()) {
            System.out.println(countryValue);
        }
    }
}
