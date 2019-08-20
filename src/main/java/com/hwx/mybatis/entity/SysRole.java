package com.hwx.mybatis.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author hwx
 * @since 2019-04-30
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String roleName;
    private Integer avilable;
    private List<SysUser> sysUserList;

}
