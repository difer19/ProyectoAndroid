package com.example.proyectdoc.DTO;

import java.util.ArrayList;

public class UserDataDTO {
    private String cedula, Nombre, email, telefono, userName, password;
    private ArrayList<DocumentDTO> documentosPropios;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<DocumentDTO> getDocumentosPropios() {
        return documentosPropios;
    }

    public void setDocumentosPropios(ArrayList<DocumentDTO> documentosPropios) {
        this.documentosPropios = documentosPropios;
    }
}
