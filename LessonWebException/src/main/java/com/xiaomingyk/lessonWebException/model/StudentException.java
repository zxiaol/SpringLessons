package com.xiaomingyk.lessonWebException.model;

/**
 * Created by My on 1/12/2017.
 */
public class StudentException extends RuntimeException {

    private String exceptionMsg;

    public StudentException(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public String getExceptionMsg(){
        return this.exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }
}
