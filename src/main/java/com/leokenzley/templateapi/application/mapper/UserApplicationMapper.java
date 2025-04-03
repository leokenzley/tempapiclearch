package com.leokenzley.templateapi.application.mapper;

import com.leokenzley.templateapi.core.domain.UserDomain;
import com.leokenzley.templateapi.model.UserRequest;
import com.leokenzley.templateapi.model.UserResponse;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

/**
 * Mapper interface for converting between UserEntity and UserDomain.
 * This interface uses MapStruct to generate the implementation at compile time.
 */
@Mapper(
  componentModel = MappingConstants.ComponentModel.SPRING,
  unmappedSourcePolicy =  ReportingPolicy.IGNORE,
  nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface UserApplicationMapper {
  /**
   * Converts a UserRequest object to a UserDomain object.
   *
   * @param request the UserRequest object to convert
   * @return the converted UserDomain object
   */
  @Mappings({

  })
  UserDomain toDomain(UserRequest request);

  /**
   * Converts a UserDomain object to a UserResponse object.
   *
   * @param domain the UserDomain object to convert
   * @return the converted UserResponse object
   */
  @Mappings({

  })
  UserResponse toResponse(UserDomain domain);
}
