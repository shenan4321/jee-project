package cn.shenan.upms.rpc.mapper;


import cn.shenan.upms.dao.model.UpmsPermission;
import cn.shenan.upms.dao.model.UpmsRole;

import java.util.List;

/**
 * 用户VOMapper
 * Created by shenan on 2017/01/07.
 */
public interface UpmsApiMapper {

	// 根据用户id获取所拥有的权限
	List<UpmsPermission> selectUpmsPermissionByUpmsUserId(Integer upmsUserId);

	// 根据用户id获取所属的角色
	List<UpmsRole> selectUpmsRoleByUpmsUserId(Integer upmsUserId);
	
}