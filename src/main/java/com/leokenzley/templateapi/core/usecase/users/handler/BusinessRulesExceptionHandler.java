package com.leokenzley.templateapi.core.usecase.users.handler;

import com.leokenzley.templateapi.core.usecase.users.handler.exception.BusinessBusinnesRulesException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import java.util.Locale;
@ControllerAdvice
public class BusinessRulesExceptionHandler {

  @Autowired
  private MessageSource messageSource;

  @ExceptionHandler(BusinessBusinnesRulesException.class)
  public ResponseEntity<ProblemDetail> handleBusinnesRulesException(
    BusinessBusinnesRulesException ex,
    WebRequest request) {
    Locale locale = request.getLocale(); // ou extraia de outro lugar se preferir
    String defaultMessage = messageSource.getMessage(
      ex.getMessageKey(),
      ex.getArgs(),
      locale
    );
    ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, defaultMessage);
    return new ResponseEntity<>(problemDetail, HttpStatus.BAD_REQUEST);
  }
}
