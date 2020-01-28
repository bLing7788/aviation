package com.fh.service.impl;

import com.fh.dao.FlightMapper;
import com.fh.entity.po.Flight;
import com.fh.entity.vo.DataTablesData;
import com.fh.entity.vo.Search;
import com.fh.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {
    @Autowired
    private FlightMapper flightMapper;
    @Override
    public DataTablesData<Flight> queryFlight(Search search) {
        Long count = flightMapper.queryCount();
        List<Flight> list= flightMapper.queryList(search);
        DataTablesData tablesData = new DataTablesData();
        tablesData.setData(list);
        tablesData.setRecordsFiltered(count.intValue());
        tablesData.setRecordsTotal(count.intValue());
        tablesData.setDraw(search.getDraw());
        return tablesData;
    }
}
