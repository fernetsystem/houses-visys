package com.visys.houses.repository;

import com.visys.houses.models.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House, Long> {


}
