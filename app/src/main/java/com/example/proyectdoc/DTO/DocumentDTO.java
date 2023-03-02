package com.example.proyectdoc.DTO;

import java.util.ArrayList;

public class DocumentDTO {
    private String documentName, documentURL;
    ArrayList<String> sharedUsers;

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentURL() {
        return documentURL;
    }

    public void setDocumentURL(String documentURL) {
        this.documentURL = documentURL;
    }

    public ArrayList<String> getSharedUsers() {
        return sharedUsers;
    }

    public void setSharedUsers(ArrayList<String> sharedUsers) {
        this.sharedUsers = sharedUsers;
    }
}
