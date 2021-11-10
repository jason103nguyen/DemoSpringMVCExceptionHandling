package com.phuongnt.main;

public class MyException extends RuntimeException {

    private String msgException;
    private String idException;

    public MyException(){
    }

    public MyException(String msgException, String idException) {
        this.msgException = msgException;
        this.idException = idException;
    }

    public String getMsgException() {
        return msgException;
    }

    public void setMsgException(String msgException) {
        this.msgException = msgException;
    }

    public String getIdException() {
        return idException;
    }

    public void setIdException(String idException) {
        this.idException = idException;
    }
}