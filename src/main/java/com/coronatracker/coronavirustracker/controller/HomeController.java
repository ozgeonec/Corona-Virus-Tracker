package com.coronatracker.coronavirustracker.controller;

import com.coronatracker.coronavirustracker.model.LocationStats;
import com.coronatracker.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    
    @Autowired
    CoronaVirusDataService coronaVirusDataService;
    List<LocationStats> allStats= coronaVirusDataService.getAllStats();
    int totalReportCases = allStats.stream().mapToInt(stat -> stat.getLatestTotal()).sum();
    int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
    @GetMapping("/")
    public String Home(Model model){
        model.addAttribute("locationStat", coronaVirusDataService.getAllStats());
        return "home";
    }

}
