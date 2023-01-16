package com.test.cosmos.repo;

import com.test.cosmos.dto.Accounts;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountsRepo extends CrudRepository<Accounts,Long> {

}
