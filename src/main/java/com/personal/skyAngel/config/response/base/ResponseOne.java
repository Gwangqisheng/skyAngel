package com.personal.skyAngel.config.response.base;

/**
 * 返回一个实体
 * @author peng.yan
 *
 * @param <T>
 */
public class ResponseOne<T> extends BaseResponse {

    private T msg;

    public ResponseOne(){}

    public ResponseOne(T msg) {
        super();
        this.msg = msg;
    }

    public T getMsg() {
        return msg;
    }

    public void setMsg(T msg) {
        this.msg = msg;
    }

}
