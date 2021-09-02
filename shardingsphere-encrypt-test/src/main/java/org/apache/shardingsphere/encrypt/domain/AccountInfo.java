package org.apache.shardingsphere.encrypt.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName account_info
 */
@Data
public class AccountInfo implements Serializable {
    /**
     * 
     */
    private Long id;

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