package com.jetblue.dao;


import com.microsoft.azure.storage.CloudStorageAccount;
import com.microsoft.azure.storage.blob.CloudBlobClient;
import com.microsoft.azure.storage.blob.CloudBlobContainer;
import com.microsoft.azure.storage.blob.CloudBlobDirectory;
import com.microsoft.azure.storage.blob.CloudBlockBlob;

public class BlobOperationsDAO {
    private String  connectionString;

    public BlobOperationsDAO() {
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public void createBlob(String continerName,String blobName,String directoryStructure, String event) {
        try {
            CloudStorageAccount account = CloudStorageAccount.parse(this.connectionString);
            CloudBlobClient blobClient = account.createCloudBlobClient();
            CloudBlobContainer container = blobClient.getContainerReference(continerName);
            CloudBlockBlob blob = container.getBlockBlobReference(blobName);




        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
