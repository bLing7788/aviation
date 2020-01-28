package com.fh.service;

import com.fh.entity.po.Flight;
import com.fh.entity.vo.DataTablesData;
import com.fh.entity.vo.Search;

public interface FlightService {
    DataTablesData<Flight> queryFlight(Search search);
}
