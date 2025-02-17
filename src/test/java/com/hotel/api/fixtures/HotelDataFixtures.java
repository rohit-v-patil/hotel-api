package com.hotel.api.fixtures;

import com.hotel.api.model.Hotel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class HotelDataFixtures {
  public List<Hotel> getHotelsWithRatingValues(Double... ratings) {
    return Stream.of(ratings)
        .map(rating -> Hotel.builder().setRating(rating).build())
        .collect(Collectors.toList());
  }
}
