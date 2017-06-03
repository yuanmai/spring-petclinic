package org.springframework.samples.petclinic.system;

import javax.persistence.Column;

/**
 * Created by jared.li on 6/3/17.
 */
public class Result {
    public static String STYLE_SUCCESS = "alert  alert-success";
    public static String STYLE_ERROR = "alert  alert-danger";

    public static String MSG_SUCCESS = "A reset password email has been sent to your mailbox. Please check.";
    public static String MSG_ERROR = "Send email error.";


    @Column(name = "message")
    private String message;

    @Column(name = "klass")
    private String klass;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getKlass() {
        return klass;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }
}
