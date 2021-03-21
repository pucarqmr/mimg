package br.pucminas.pos.tcc.mimg.resource;

import br.pucminas.pos.tcc.mimg.exception.NoDataFoundException;
import br.pucminas.pos.tcc.mimg.util.DateUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@ControllerAdvice
public class ControllerAdvisor {


    @ExceptionHandler(NoDataFoundException.class)
    public ResponseEntity<Object> handleNodataFoundException(
            NoDataFoundException ex) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("date", DateUtil.DateFormat(LocalDateTime.now()));
        body.put("message", ex.getMessage());

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }

}
