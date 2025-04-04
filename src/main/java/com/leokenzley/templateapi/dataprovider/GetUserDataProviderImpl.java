package com.leokenzley.templateapi.dataprovider;

import com.leokenzley.templateapi.core.dataprovider.GetUserDataProvider;
import com.leokenzley.templateapi.core.domain.UserDomain;
import com.leokenzley.templateapi.core.usecase.users.handler.exception.BusinessBusinnesRulesException;
import com.leokenzley.templateapi.dataprovider.database.repository.UserRepository;
import com.leokenzley.templateapi.dataprovider.database.repository.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Implementation of the GetUserDataProviderImpl interface.
 */
@Component
public class GetUserDataProviderImpl implements GetUserDataProvider {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private UserMapper mapper;

  @Override
  public UserDomain get(Long id) {
    var userEntity = userRepository.findById(id)
         .orElseThrow(() -> new BusinessBusinnesRulesException("user.notfound"));
    return mapper.toDomain(userEntity);
  }
}
