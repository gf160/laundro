package com.gas.webapp.main.manager.persistence;

import com.gas.webapp.main.manager.dto.ManagerDto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by GTP on 2022-11-05.
 */
//레파지토리는 소문자로 생성하도록한다.
@Repository("managerMapper")
public interface ManagerMapper {
    List<ManagerDto> selectProductGroupList(Map<String, Object> _map);
    List<ManagerDto> saveProductGroupList(Map<String, Object> _map);
    List<ManagerDto> selectProductGroupListForList(Map<String, Object> _map);
}
