package com.sneid.inc.data_controller.services;

import com.sneid.inc.data_controller.entity.Data;
import com.sneid.inc.data_controller.repositories.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    @Autowired
    private final DataRepository dataRepository;

    public DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public void addData(Data data){
        dataRepository.save(data);
    }

    public void deleteData(Data data){
        dataRepository.delete(data);
    }

    public List<Data> findAll(){
        return dataRepository.findAll();
    }

    public List<Data> findByContentContains(String piece_content){
        return dataRepository.findByContentContains(piece_content);
    }

    public List<Data> findFirst10ByContentContains(String piece_content){
        return dataRepository.findFirst10ByContentContains(piece_content);
    }

    public List<Data> findByTitleContains(String piece_title){
        return dataRepository.findByTitleContains(piece_title);
    }

    public List<Data> findFirst10ByTitleContains(String piece_title){
        return dataRepository.findFirst10ByTitleContains(piece_title);
    }

}
