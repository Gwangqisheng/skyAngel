package com.personal.skyAngel.config.response.base;

import java.util.List;

/**
 * 返回多个实体
 * @author peng.yan
 *
 * @param <T>
 */
public class ResponseMultiple<T> extends BaseResponse {

    private List<T> msg;

    private PageResponse page;

    private List<T> data;

    public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public List<T> getMsg() {
        return msg;
    }

    public void setMsg(List<T> msg) {
        this.msg = msg;
    }

    public PageResponse getPage() {
        return page;
    }

    public void setPage(PageResponse page) {
        this.page = page;
    }

}
