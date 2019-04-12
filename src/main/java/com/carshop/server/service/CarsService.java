package com.carshop.server.service;

import java.util.List;
import java.util.Map;

public interface CarsService {
    Map<String,Object> addCar(Map<String,String> params);

    Map<String,Object> checkCarId(Map<String,String> params);

    Map<String,Object> editCar(Map<String,String> params);

    Map<String,Object> getCarListPage(Map<String,String> params);

    Map<String,Object> removeCars(List<Map<String,String>> params);
}
