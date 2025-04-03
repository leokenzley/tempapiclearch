package com.leokenzley.templateapi.dataprovider;

import com.leokenzley.templateapi.core.dataprovider.CreateUserDataProvider;
import com.leokenzley.templateapi.core.domain.UserDomain;
import com.leokenzley.templateapi.dataprovider.database.entity.UserEntity;
import com.leokenzley.templateapi.dataprovider.database.repository.UserRepository;
import com.leokenzley.templateapi.dataprovider.database.repository.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Implementation of the CreateUserDataProvider interface.
 * This class is responsible for creating a new user in the database.
 */
@Component
public class CreateUserDataProviderImpl implements CreateUserDataProvider {

  @Autowired
  private UserRepository userRepository;
  @Autowired
  private UserMapper userMapper;

  @Override
  public void execute(UserDomain userDomain) {
    UserEntity entity = userMapper.toEntity(userDomain);
    userRepository.save(entity);
  }
}
