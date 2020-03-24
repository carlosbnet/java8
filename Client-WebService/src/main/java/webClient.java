


import com.google.gson.Gson;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;

import java.io.IOException;

public class webClient {

    public static void main(String[] args) throws IOException {

    String conteudo = Request
            .Post("http://localhost:8080/empresas")
            .addHeader("Accept", "application/json")
            .execute()
            .returnContent().asString();


        Gson jsonToString = new Gson();


        String novovalor = new String(conteudo);


        System.out.println(conteudo);
        

      //  System.out.println(novoValor);
    }


}
