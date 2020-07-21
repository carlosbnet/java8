package br.com.start.curso.resource.exception;

import br.com.start.curso.domain.DetalheError;
import br.com.start.curso.exception.IdNaoValidoServiceException;
import br.com.start.curso.exception.NaoExisteDaoException;
import javassist.NotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//Notação responsavel por pega as exeçoes, fica ouvindo quando as exceções forem lancaçadas
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {


    //define o tipo de execao que o controller vai ficar ouvindo, quando ocorrer qualquer lacamento de uma das duas o controller pega
    @ExceptionHandler({NullPointerException.class,IllegalArgumentException.class})
    public ResponseEntity<Object> serverException(RuntimeException ex, WebRequest request) {
        //as duas exceções acima fazem parte do RumtimeException, se tivesse outros tipos em entao seria necessario colocalas
        //Webrequest quero pega o request para enviar dentro do handle, e tambem captura informações da exeção

        //Metodo que possibilia
        return handleExceptionInternal(
                ex, DetalheError.builder() //Lembrando que metodo de builder nao ficou muito mais facil, pois ao inves de criar um obejto e setar tudo eu so chamo o builder e preencho cada opção da class
                        .addDetalhe("Uma exceção foi lançada")
                        .addErro(ex.getMessage())
                        .addStatus(HttpStatus.INTERNAL_SERVER_ERROR)
                        .addHttpMethod(getHttpMethod(request))
                        .addPath(getPath(request))
                        .build(),
                new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

    //Para valores nullos
    @ExceptionHandler({org.hibernate.PropertyValueException.class})
    public ResponseEntity<Object> propriedadeNula(org.hibernate.PropertyValueException nf, WebRequest request){


        return handleExceptionInternal(
                nf, DetalheError.builder() //Lembrando que metodo de builder nao ficou muito mais facil, pois ao inves de criar um obejto e setar tudo eu so chamo o builder e preencho cada opção da class
                        .addDetalhe("O campo: "+nf.getPropertyName()+", nao pode ser nula")
                        .addErro(nf.getMessage())
                        .addStatus(HttpStatus.BAD_REQUEST)
                        .addHttpMethod(getHttpMethod(request))
                        .addPath(getPath(request))
                        .build(),
                new HttpHeaders(), HttpStatus.BAD_REQUEST, request);




    }

    //Para Ids nao validos
    @ExceptionHandler({IdNaoValidoServiceException.class})
    public ResponseEntity<Object> idInvalido(IdNaoValidoServiceException nf, WebRequest request){


        return handleExceptionInternal(
                nf, DetalheError.builder() //Lembrando que metodo de builder nao ficou muito mais facil, pois ao inves de criar um obejto e setar tudo eu so chamo o builder e preencho cada opção da class
                        .addErro(nf.getMessage())
                        .addStatus(HttpStatus.BAD_REQUEST)
                        .addHttpMethod(getHttpMethod(request))
                        .addPath(getPath(request))
                        .build(),
                new HttpHeaders(), HttpStatus.BAD_REQUEST, request);




    }

    //Exception para valores nulos que nao existem
    @ExceptionHandler(NaoExisteDaoException.class)
    public ResponseEntity<Object> entidadeNaoEncontrada(NaoExisteDaoException nf, WebRequest request){


        return handleExceptionInternal(
                nf, DetalheError.builder() //Lembrando que metodo de builder nao ficou muito mais facil, pois ao inves de criar um obejto e setar tudo eu so chamo o builder e preencho cada opção da class
                        .addDetalhe("Recurso nao encontrado")
                        .addErro(nf.getMessage())
                        .addStatus(HttpStatus.NOT_FOUND)
                        .addHttpMethod(getHttpMethod(request))
                        .addPath(getPath(request))
                        .build(),
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);




    }


    //pega a url que tentou acessar o app
    private String getPath(WebRequest request) {

        return ((ServletWebRequest) request).getRequest().getRequestURI();

    }

    //pega o metodo que foi usado
    private String getHttpMethod(WebRequest request) {

        return ((ServletWebRequest) request).getRequest().getMethod();

    }


}
