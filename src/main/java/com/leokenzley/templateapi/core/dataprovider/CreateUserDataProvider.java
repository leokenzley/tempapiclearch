package com.leokenzley.templateapi.core.dataprovider;

import com.leokenzley.templateapi.core.domain.UserDomain;

/**
 * Interface for creating user data provider.
 * This interface defines the method for executing the creation of a user.
 */
public interface CreateUserDataProvider { void execute(UserDomain userDomain); }
