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
import org.springframework.samples.petclinic.model.RcUser;

import java.util.List;

public interface UserRepository extends Repository<RcUser, Integer> {

    @Query("SELECT ru FROM RcUser ru WHERE ru.email = :email and ru.password= :password")
    List<RcUser> findByEmailAndPassword(@Param("email") String email, @Param("password") String password);

    @Query("SELECT ru FROM RcUser ru WHERE ru.phoneNumber = :phoneNumber and ru.password= :password")
    List<RcUser> findByPhoneNumberAndPassword(@Param("phoneNumber") String phoneNumber, @Param("password") String password);

    @Query("SELECT ru FROM RcUser ru WHERE ru.phoneNumber = :phoneNumber and ru.password= :password and ru.extension= :extension")
    List<RcUser> findByPhoneNumberExtAndPassword(@Param("phoneNumber") String phoneNumber, @Param("password") String password, @Param("extension") String extension);

}
