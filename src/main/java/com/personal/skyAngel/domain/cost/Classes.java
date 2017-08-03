package com.personal.skyAngel.domain.cost;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.personal.skyAngel.domain.base.IdBestEntity;

@Entity
@Table(name = "classes")
@SequenceGenerator(name = "sequenceGenerator", sequenceName = "classes_sequence")
public class Classes extends IdBestEntity {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /** 班级编号 */
    private String classNumber;

    /** 班级名称 */
    private String className;

    public Classes() {
    }

    public Classes(String classNumber, String className) {
        super();
        this.classNumber = classNumber;
        this.className = className;
    }

    @JsonProperty
    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    @JsonProperty
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

}
