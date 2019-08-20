package com.hwx.mybatis.mapper;

import com.hwx.mybatis.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 *
 * @author hwx
 * @since 2019-04-30
 */
@Mapper
@Component
public interface SysUserMapper {
    SysUser selectById (int id);
    int insert(SysUser sysUser);

}
