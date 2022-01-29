package com.promineotech.jeep.controller.support;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

public class FetchJeepTestSupport extends BaseTest{
  protected List<Jeep> buildExpected() {
    List<Jeep> list= new LinkedList<>();
    // @formatter:off
    list.add(Jeep.builder()
        .modelID(JeepModel.GLADIATOR)
        .trimLevel("Rubicon")
        .numDoors(4)
        .wheelSize(17)
        .basePrice(new BigDecimal("44140.00"))
        .build());
    list.add(Jeep.builder()
        .modelID(JeepModel.GLADIATOR)
        .trimLevel("Rubicon")
        .numDoors(4)
        .wheelSize(17)
        .basePrice(new BigDecimal("44140.00"))
        .build());
    return list;
  }
}