package com.leokenzley.templateapi.core.usecase.users;

import com.leokenzley.templateapi.core.domain.UserDomain;

public interface DeleteUserUseCase {
    void execute(Long id);
}
