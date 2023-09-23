package com.example.assignment3.Information;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InformationRepository extends JpaRepository<Information, Long> {

    @Query("SELECT i FROM Information i ORDER BY i.date_created DESC")
    Information findLatestInformation();
}