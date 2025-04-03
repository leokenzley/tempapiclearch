package com.leokenzley.templateapi.core.usecase.users;

import com.leokenzley.templateapi.core.domain.UserDomain;

/**
 * UpdateUserUseCase interface defines the contract for updating a user.
 * It provides a method to execute the update of a user with the given ID and UserDomain object.
 */
public interface UpdateUserUseCase {
  /**
   * Executes the update of a user with the given ID and UserDomain object.
   *
   * @param id         the ID of the user to be updated
   * @param userDomain the UserDomain object representing the updated user information
   */
  void execute(Long id, UserDomain userDomain);
}
