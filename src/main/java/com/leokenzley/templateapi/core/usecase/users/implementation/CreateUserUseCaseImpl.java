package com.leokenzley.templateapi.core.usecase.users.implementation;

import com.leokenzley.templateapi.core.dataprovider.CreateUserDataProvider;
import com.leokenzley.templateapi.core.domain.UserDomain;
import com.leokenzley.templateapi.core.usecase.users.CreateUserUseCase;

/**
 * Implementation of the CreateUserUseCase interface.
 */
public class CreateUserUseCaseImpl implements CreateUserUseCase {
  private final CreateUserDataProvider createUserDataProvider;

  /**
   * Constructor for CreateUserUseCaseImpl.
   *
   * @param createUserDataProvider the data provider for creating users
   */
  public CreateUserUseCaseImpl(CreateUserDataProvider createUserDataProvider) {
    this.createUserDataProvider = createUserDataProvider;
  }

  @Override
  public void execute(UserDomain userDomain) {
    createUserDataProvider.execute(userDomain);
  }
}
