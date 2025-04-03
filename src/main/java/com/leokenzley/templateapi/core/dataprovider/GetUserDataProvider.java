package com.leokenzley.templateapi.core.dataprovider;

import com.leokenzley.templateapi.core.domain.UserDomain;

/**
 * Interface for getting a user data provider.
 * This interface defines the method for retrieving a user by ID.
 */
public interface GetUserDataProvider { UserDomain get(Long id); }
