package com.personal.skyAngel.domain.cost;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.personal.skyAngel.domain.base.IdBestEntity;

/**
 * 学期 -- Entity
 *
 */
@Entity
@Table(name = "semester_records")
@SequenceGenerator(name = "sequenceGenerator", sequenceName = "semester_sequence")
public class Semester extends IdBestEntity {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /** 学期编号 */
    private String semesterNumber;

    /** 学期名称 */
    private String semesterName;

    public Semester() {
    }

    public Semester(String semesterNumber, String semesterName) {
        super();
        this.semesterNumber = semesterNumber;
        this.semesterName = semesterName;
    }

    @JsonProperty
    public String getSemesterNumber() {
        return semesterNumber;
    }

    public void setSemesterNumber(String semesterNumber) {
        this.semesterNumber = semesterNumber;
    }

    @JsonProperty
    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

}
