package cn.shenan.upms.rpc.api;

import cn.shenan.common.base.BaseServiceMock;
import cn.shenan.upms.dao.mapper.UpmsLogMapper;
import cn.shenan.upms.dao.model.UpmsLog;
import cn.shenan.upms.dao.model.UpmsLogExample;

/**
* 降级实现UpmsLogService接口
* Created by shenan on 2017/11/9.
*/
public class UpmsLogServiceMock extends BaseServiceMock<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

}
