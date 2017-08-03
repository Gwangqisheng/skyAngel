package com.personal.skyAngel.domain.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.validation.groups.Default;

@MappedSuperclass
@EntityListeners(EntityListener.class)
public abstract class BaseEntity implements Serializable {

//	/** id */
//	public static final String ID_PROPERTY_NAME = "id";
	/** 创建日期 */
	public static final String CREATE_DATE_PROPERTY_NAME = "createDate";
	/** 修改日期 */
	public static final String MODIFY_DATE_PROPERTY_NAME = "modifyDate";

	/**
	 * 保存验证组
	 */
	public interface Save extends Default {

	}

	/**
	 * 更新验证组
	 */
	public interface Update extends Default {

	}


	/** 创建日期 */
	private Date creatDate;
	/** 修改日期 */
	private Date modifyDate;


	@JsonProperty
	@Column(nullable=false,insertable=true,name="create_date",updatable = false)
	public Date getCreatDate() {
		return creatDate;
	}
	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}
	@JsonProperty
	@Column(name="modify_date")
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
            return true;
        }
		if (obj == null) {
            return false;
        }
		if (getClass() != obj.getClass()) {
            return false;
        }
		return true;
	}


}
