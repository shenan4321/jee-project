package cn.shenan.upms.rpc.api;

import cn.shenan.common.base.BaseServiceMock;
import cn.shenan.upms.dao.mapper.UpmsUserMapper;
import cn.shenan.upms.dao.model.UpmsUser;
import cn.shenan.upms.dao.model.UpmsUserExample;

/**
* 降级实现UpmsUserService接口
* Created by shenan on 2017/11/3.
*/
public class UpmsUserServiceMock extends BaseServiceMock<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {

}
