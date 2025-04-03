package com.leokenzley.templateapi.core.usecase.users.implementation;

import com.leokenzley.templateapi.core.dataprovider.GetUserDataProvider;
import com.leokenzley.templateapi.core.dataprovider.UpdateUserDataProvider;
import com.leokenzley.templateapi.core.domain.UserDomain;
import com.leokenzley.templateapi.core.usecase.users.UpdateUserUseCase;

/**
 * Implementation of the UpdateUserUseCase interface.
 */
public class UpdateUserUseCaseImpl implements UpdateUserUseCase {
  private final UpdateUserDataProvider updateUserDataProvider;

  /**
   * Constructor for UpdateUserUseCaseImpl.
   *
   * @param updateUserDataProvider the data provider for updating users
   */
  public UpdateUserUseCaseImpl(
          GetUserDataProvider getUserDataProvider,
          UpdateUserDataProvider updateUserDataProvider) {
    this.updateUserDataProvider = updateUserDataProvider;
  }

  @Override
  public void execute(Long id, UserDomain userDomain) {
    updateUserDataProvider.execute(id, userDomain);
  }
}
