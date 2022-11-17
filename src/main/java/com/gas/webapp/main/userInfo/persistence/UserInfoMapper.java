package com.gas.webapp.main.userInfo.persistence;

import com.gas.webapp.main.dropOff.dto.UserInfoDto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("userInfoMapper")
public interface UserInfoMapper {
    List<UserInfoDto> selectUserInfoList();
}
