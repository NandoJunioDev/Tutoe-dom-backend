package nandojuniodev.tutor.dom.Controller;


import nandojuniodev.tutor.dom.dto.ErroResponse;
import nandojuniodev.tutor.dom.exception.CodigoDeBarrasJaCadastradoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class TratadorDeErros {

    @ExceptionHandler(CodigoDeBarrasJaCadastradoException.class)
    public ResponseEntity<ErroResponse> tratarCodigoDeBarrasJaCadastrado(CodigoDeBarrasJaCadastradoException ex) {
       ErroResponse erro = new ErroResponse(HttpStatus.CONFLICT.value(), ex.getMessage(), LocalDateTime.now());
               return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
    }
}
