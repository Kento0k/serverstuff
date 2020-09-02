package com.alexander.serverstuff.service;

import com.alexander.serverstuff.entity.Server;
import com.alexander.serverstuff.repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServerService {
    @Autowired
    ServerRepository serverRepository;

    public Server getServer(Integer id){
        if(serverRepository.findById(id).isPresent()) return serverRepository.findById(id).get();
        else return null;
    }

    @Transactional
    public Server updateServer(Server server){
        return serverRepository.save(server);
    }

    @Transactional
    public Boolean deleteServer(Integer id){
        if(serverRepository.existsById(id)){
            serverRepository.deleteById(id);
            return true;
        } else return false;
    }
}
