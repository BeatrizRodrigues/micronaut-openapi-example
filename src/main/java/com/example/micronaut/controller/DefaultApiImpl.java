package com.example.micronaut.controller;

import com.example.micronaut.api.DefaultApi;
import com.example.micronaut.model.ServerDTO;
import com.example.micronaut.model.StatusResponse;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import jakarta.validation.Valid;

@Controller
public class DefaultApiImpl implements DefaultApi {

    @Override
    public HttpResponse<@Valid StatusResponse> createDeposit(ServerDTO serverDTO) {
        return HttpResponse.ok();
    }
}
