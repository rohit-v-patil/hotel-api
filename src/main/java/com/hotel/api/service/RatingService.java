package com.hotel.api.service;

import com.hotel.api.dto.RatingReportDto;
import com.hotel.api.model.Hotel;

import java.util.List;

public interface RatingService {
    RatingReportDto getRatingAverage(Long cityId);

    RatingReportDto getRatingAverage(List<Hotel> hotels);
}
