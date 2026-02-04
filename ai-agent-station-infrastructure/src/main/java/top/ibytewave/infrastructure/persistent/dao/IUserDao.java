package top.ibytewave.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import top.ibytewave.infrastructure.persistent.po.User;

import java.util.List;

@Mapper
public interface IUserDao {

    List<User> queryUserList();

}
