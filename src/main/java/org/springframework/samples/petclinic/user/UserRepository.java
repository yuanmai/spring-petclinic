/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.UserEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends Repository<UserEntity, Integer> {

    //@Query("SELECT user FROM user u WHERE u.email = :email and u.password= :password")
    @Transactional(readOnly = true)
    List<UserEntity> findByEmailAndPassword(@Param("email") String email, @Param("password") String password);

    //@Query("SELECT user FROM user u WHERE u.phoneNumber = :phoneNumber and u.password= :password")
    @Transactional(readOnly = true)
    List<UserEntity> findByPhoneNumberAndPassword(@Param("phoneNumber") String phoneNumber,@Param("password") String password);

}