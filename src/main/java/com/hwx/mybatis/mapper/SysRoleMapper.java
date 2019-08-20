package com.hwx.mybatis.mapper;

import com.hwx.mybatis.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 *
 * @author hwx
 * @since 2019-04-30
 */
@Mapper
@Component
public interface SysRoleMapper {
    SysRole selectById(int id);
    int insert(SysRole sysRole);

}
