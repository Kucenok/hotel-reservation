package com.example.hotreservation.repository;

import com.example.hotreservation.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
    // Дополнительные пользовательские запросы могут быть добавлены здесь
}
