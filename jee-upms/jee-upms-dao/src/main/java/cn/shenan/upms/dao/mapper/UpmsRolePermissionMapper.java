package cn.shenan.upms.dao.mapper;

import cn.shenan.upms.dao.model.UpmsRolePermission;
import cn.shenan.upms.dao.model.UpmsRolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsRolePermissionMapper {
    long countByExample(UpmsRolePermissionExample example);

    int deleteByExample(UpmsRolePermissionExample example);

    int deleteByPrimaryKey(Integer rolePermissionId);

    int insert(UpmsRolePermission record);

    int insertSelective(UpmsRolePermission record);

    List<UpmsRolePermission> selectByExample(UpmsRolePermissionExample example);

    UpmsRolePermission selectByPrimaryKey(Integer rolePermissionId);

    int updateByExampleSelective(@Param("record") UpmsRolePermission record, @Param("example") UpmsRolePermissionExample example);

    int updateByExample(@Param("record") UpmsRolePermission record, @Param("example") UpmsRolePermissionExample example);

    int updateByPrimaryKeySelective(UpmsRolePermission record);

    int updateByPrimaryKey(UpmsRolePermission record);
}