package com.leokenzley.templateapi.dataprovider;

import com.leokenzley.templateapi.core.dataprovider.GetAllUsersDataProvider;
import com.leokenzley.templateapi.core.domain.UserDomain;
import com.leokenzley.templateapi.dataprovider.database.repository.UserRepository;
import com.leokenzley.templateapi.dataprovider.database.repository.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Implementation of the GetAllUsersDataProvider interface.
 * This class is responsible for retrieving all users from the database.
 */
@Component
public class GetAllUsersDataProviderImpl implements GetAllUsersDataProvider {
  @Autowired
  private UserRepository userRepository;
  @Autowired
  private UserMapper mapper;

  /**
   * Retrieves all users.
   *
   * @return a list of UserDomain objects representing all users
   */
  @Override
  public List<UserDomain> get() {
    return userRepository.findAll().stream().map(mapper::toDomain).toList();
  }
}
