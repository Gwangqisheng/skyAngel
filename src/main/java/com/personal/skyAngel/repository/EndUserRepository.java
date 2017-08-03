package com.personal.skyAngel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.personal.skyAngel.domain.user.EndUser;

@Repository
public interface EndUserRepository extends JpaRepository<EndUser, Long> {

    /** 通过 昵称 （nickname） 查询 */
    @Query
    EndUser findByNickname(String nickname);

    /** 通过userId 查询 */
    @Query
    EndUser findByUserId(String userId);

    /** 通过 身份证 查询 */
    @Query
    EndUser findByIdCard(String idCard);
}
