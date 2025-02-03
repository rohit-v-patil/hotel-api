package com.hotel.api.service.impl;

import com.hotel.api.dto.RatingReportDto;
import com.hotel.api.model.Hotel;
import com.hotel.api.service.HotelService;
import com.hotel.api.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class DefaultRatingService implements RatingService {
  private final HotelService hotelService;

  @Autowired
  DefaultRatingService(HotelService hotelService) {
    this.hotelService = hotelService;
  }

  @Override
  public RatingReportDto getRatingAverage(Long cityId) {
    return getRatingAverage(hotelService.getHotelsByCity(cityId));
  }

  @Override
  public RatingReportDto getRatingAverage(List<Hotel> hotels) {
    double ratingSum = 0;
    int ratingCount = 0;

    for (Hotel hotel : hotels) {
      ratingSum += hotel.getRating();
      ratingCount++;
    }

    return new RatingReportDto(ratingCount, ratingSum / ratingCount);
  }
}
