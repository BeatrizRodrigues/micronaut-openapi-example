package com.example.micronaut.example;

import io.micronaut.http.annotation.Controller;
import jakarta.validation.Valid;
import micronaut.example.api.DefaultApi;
import micronaut.example.model.BaseUser;
import micronaut.example.model.BuscarTipoUsuarioGetUserTypeParameter;

import java.util.List;

@Controller
public class DefaultApiImpl implements DefaultApi {


    @Override
    public List<@Valid BaseUser> buscarTipoUsuarioGet(BuscarTipoUsuarioGetUserTypeParameter userType) {
        return List.of();
    }
}
