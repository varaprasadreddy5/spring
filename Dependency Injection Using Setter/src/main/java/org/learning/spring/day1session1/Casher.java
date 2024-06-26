package org.learning.spring.day1session1;

import java.io.*;
import java.util.Date;

public class Casher {
    private String fileName;
    private String path;
    private BufferedWriter writer;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void openFile() throws IOException {
        File targetDir = new File(path);
        if(!targetDir.exists()){
            targetDir.mkdir();
        }

        File checkoutFile = new File(path, fileName + ".txt");
        if(!checkoutFile.exists()){
            checkoutFile.createNewFile();
        }

        writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(checkoutFile, true)));
    }

    public void checkOut(ShoppingCart cart) throws IOException{
        writer.write(new Date() + "\t" + cart.getItems() + "\r\n");
        writer.flush();
    }

    public void closeFile() throws IOException{
        writer.close();
    }
}
