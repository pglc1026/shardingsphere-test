package org.apache.shardingsphere.encrypt.controller.message.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class SaveAccountRequest implements Serializable {

    /**
     *
     */
    private String accountName;

    /**
     *
     */
    private String accountIdCard;

    /**
     *
     */
    private String accountMobile;

    private static final long serialVersionUID = 1L;
}
