package com.example.proyectdoc.Manager;

import com.example.proyectdoc.DTO.UserDataDTO;

public interface ServiceManager {
    int autentificacion(String userName, String password);
    UserDataDTO obtenerDatosUsuario(String username);
}
