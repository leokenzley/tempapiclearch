package com.leokenzley.templateapi.core.usecase.users.handler.exception;

public class BusinessBusinnesRulesException extends RuntimeException{
    private static final long serialVersionUID = 1L;

  private final String messageKey;
  private final Object[] args;

  public BusinessBusinnesRulesException(String messageKey, Object... args) {
    super(messageKey);
    this.messageKey = messageKey;
    this.args = args;
  }

  public String getMessageKey() {
    return messageKey;
  }

  public Object[] getArgs() {
    return args;
  }
}
