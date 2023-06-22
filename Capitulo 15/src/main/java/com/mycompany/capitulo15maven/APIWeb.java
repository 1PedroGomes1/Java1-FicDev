package com.mycompany.capitulo15maven;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIWeb {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.boredapi.com/api/activity");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            StringBuilder resposta;
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                String linha;
                resposta = new StringBuilder();
                while ((linha = reader.readLine()) != null) {
                    resposta.append(linha);
                }
            }
            System.out.println(resposta.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
