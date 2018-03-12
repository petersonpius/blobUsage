package com.jetblue.service;

import com.jetblue.dao.BlobOperationsDAO;

public class BlobServices {
    private static BlobServices INSTANCE=new BlobServices();
    private static BlobOperationsDAO blobOperationsDAO=new BlobOperationsDAO();

    private BlobServices() {
    }

    public void createBlob(String directoryStructure, String event){
        blobOperationsDAO.createBlob(directoryStructure,event);
    }
}
