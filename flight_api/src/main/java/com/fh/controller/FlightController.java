package com.fh.controller;

import com.fh.entity.po.Flight;
import com.fh.entity.vo.DataTablesData;
import com.fh.entity.vo.Search;
import com.fh.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping
public class FlightController {
    @Autowired
    private FlightService flightService;

    @RequestMapping("queryFlight")
    public DataTablesData<Flight> queryFlight(Search search){
        DataTablesData<Flight> flightList=flightService.queryFlight(search);
        return flightList;
    }

}
