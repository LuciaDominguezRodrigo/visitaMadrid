package com.multimedia.p3.repository;


import com.multimedia.p3.entities.Postal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostalRepository extends JpaRepository<Postal, Long> {
}
