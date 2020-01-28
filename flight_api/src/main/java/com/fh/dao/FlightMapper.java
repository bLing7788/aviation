package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.entity.po.Flight;
import com.fh.entity.vo.Search;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FlightMapper extends BaseMapper<Flight> {

    Long queryCount();

    List<Flight> queryList(Search search);
}
