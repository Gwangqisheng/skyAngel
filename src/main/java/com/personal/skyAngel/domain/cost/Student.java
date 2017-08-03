package com.personal.skyAngel.domain.cost;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.personal.skyAngel.domain.base.IdBestEntity;

@Entity
@Table(name = "end_user")
@SequenceGenerator(name = "sequenceGenerator", sequenceName = "end_user_sequence")
public class Student extends IdBestEntity {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /** 学号 */
    private String studentNumber;

    /** 学生姓名 */
    private String studentName;

    /** 学生性别 */
    private String gender;

    /** 出生年月 */
    private String birthday;

    /** 学生年龄 */
    private String age;

    /** 家庭住址 */
    private String address;

    /** 监护人 */
    private String guardian;

    /** 监护人电话 */
    private String mobile;

    /** 与监护人关系 */
    private String position;

    /** 所在班级 */
    private Classes classes;

    public Student() {
    }

    public Student(String studentNumber, String studentName, String gender, String birthday, String age, String address,
            String guardian, String mobile, String position, Classes classes) {
        super();
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.gender = gender;
        this.birthday = birthday;
        this.age = age;
        this.address = address;
        this.guardian = guardian;
        this.mobile = mobile;
        this.position = position;
        this.classes = classes;
    }

    @JsonProperty
    @ManyToOne()
    @JoinColumn
    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @JsonProperty
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty
    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    @JsonProperty
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @JsonProperty
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @JsonProperty
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @JsonProperty
    public String getGuardian() {
        return guardian;
    }

    public void setGuardian(String guardian) {
        this.guardian = guardian;
    }

    @JsonProperty
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @JsonProperty
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
