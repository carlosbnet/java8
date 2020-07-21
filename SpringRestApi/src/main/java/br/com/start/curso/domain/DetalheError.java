package br.com.start.curso.domain;

import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.Locale;

public class DetalheError implements Serializable {

    private Integer statusCode;
    private String statusMessage;
    private String httpMethod;
    private String error;
    private String detalhe;
    private String path;

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public String getError() {
        return error;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public String getPath() {
        return path;
    }
//Usado para criar os objetos do tipo erro
    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{

        private DetalheError error;

        Builder(){
            this.error = new DetalheError();
        }

        public Builder addStatus(HttpStatus status){

            this.error.statusCode = status.value();
            this.error.statusMessage = status.getReasonPhrase();
            return this;
        }

        public Builder addHttpMethod(String method){

            this.error.httpMethod = method;

            return this;
        }

        public Builder addErro(String erro){

            this.error.error = erro;

            return this;
        }


        public Builder addDetalhe(String detalhe){

            this.error.detalhe = detalhe;

            return this;
        }

        public Builder addPath(String path){

            this.error.path = path;

            return this;
        }


        public DetalheError build(){
            return this.error;
        }
    }
}
