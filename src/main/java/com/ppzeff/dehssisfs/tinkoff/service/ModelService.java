package com.ppzeff.dehssisfs.tinkoff.service;

import com.ppzeff.dehssisfs.tinkoff.model.ModelRatesForGraph;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ModelService {
    List<ModelRatesForGraph> getRatesByData(int code, long period);
     String toStringByCode(int code);
}
