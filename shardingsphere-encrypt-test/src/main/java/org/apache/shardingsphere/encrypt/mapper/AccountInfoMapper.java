package org.apache.shardingsphere.encrypt.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.shardingsphere.encrypt.domain.AccountInfo;

/**
 * @Entity org.apache.shardingsphere.encrypt.controller.domain.AccountInfo
 */
@Mapper
public interface AccountInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(AccountInfo record);

    int insertSelective(AccountInfo record);

    AccountInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AccountInfo record);

    int updateByPrimaryKey(AccountInfo record);

}
