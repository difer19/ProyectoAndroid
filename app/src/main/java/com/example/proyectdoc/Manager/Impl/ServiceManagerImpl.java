package com.example.proyectdoc.Manager.Impl;

import com.example.proyectdoc.DAO.Impl.ServiceDAOImpl;
import com.example.proyectdoc.DAO.ServiceDAO;
import com.example.proyectdoc.DTO.UserDataDTO;
import com.example.proyectdoc.Manager.ServiceManager;

public class ServiceManagerImpl implements ServiceManager {
    @Override
    public int autentificacion(String userName, String password) {
        ServiceDAO service = new ServiceDAOImpl();
        return service.autentificacion(userName, password);
        /*if (userName.equals("difer") && password.equals("12345678")){
            return 1;
        }else if (userName.equals("difer") && !password.equals("12345678")){
            return 2;
        }else{
            return 3;
        }*/
    }

    @Override
    public UserDataDTO obtenerDatosUsuario(String username) {
        if (username.equals("difer")){
            UserDataDTO user = new UserDataDTO();
            user.setCedula("1004234590");
            user.setNombre("Diego Fernando Escobar");
            return user;
        }
        return null;
    }
}
