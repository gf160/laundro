package com.gas.webapp.main.dropOff.persistence;

import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

@Repository("dropOffMapper")
public interface DropOffMapper {
    int insertDropOffData(Map<String, Object> _map);
}
