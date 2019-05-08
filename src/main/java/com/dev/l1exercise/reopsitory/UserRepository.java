package com.dev.l1exercise.reopsitory;

import com.dev.l1exercise.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
