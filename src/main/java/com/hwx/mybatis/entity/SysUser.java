package com.hwx.mybatis.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hwx
 * @since 2019-04-30
 */
@Getter
@Setter
@NoArgsConstructor
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String username;
    private String passwd;
    private Date createTime;
    private int roleId;
    private SysRole sysRole;

}
