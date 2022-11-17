package com.gas.webapp.main.sample.persistence;

import com.gas.webapp.main.sample.dto.SampleDto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Leeyouje on 2022-10-31.
 */
//레파지토리는 소문자로 생성하도록한다.
@Repository("sampleMapper")
public interface SampleMapper {
    List<SampleDto> selectSampleList(Map<String, Object> _map);
}
