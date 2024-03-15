package com.utilitytracker.repository;

import com.utilitytracker.entity.Utility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilityRepository extends JpaRepository<Utility, Long> {
}
