package com.sneid.inc.data_controller.controllers;

import com.sneid.inc.data_controller.entity.Data;
import com.sneid.inc.data_controller.repositories.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {

    @Autowired
    DataRepository dataRepository;

    @PostMapping(path = "/add")
    public String onAdd(@RequestParam(name = "title") String title,
                        @RequestParam(name = "content") String content){
        Data data = new Data();
        data.setTitle(title);
        data.setContent(content);
        dataRepository.save(data);
        return "saved\n";
    }

}
