package com.multimedia.p3.services;

import com.multimedia.p3.entities.Postal;
import com.multimedia.p3.repository.PostalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostalService {

    @Autowired
    private PostalRepository postalRepository;

    public void save(Postal p1) {
        postalRepository.save(p1);
    }
}
