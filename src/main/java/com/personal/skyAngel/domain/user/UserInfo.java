package com.personal.skyAngel.domain.user;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.personal.skyAngel.domain.base.IdBestEntity;

@Entity
@Table(name = "user_info")
@SequenceGenerator(name = "sequenceGenerator", sequenceName = "user_info_sequence")
public class UserInfo extends IdBestEntity {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

}
