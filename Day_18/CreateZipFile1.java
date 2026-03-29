package Day_18;

import java.util.zip.*;
import java.io.*;

public class CreateZipFile1 {
    static final int BUFFER=1024;
    public static void main(String[] args) {
        zipFile();
    }
    private static void zipFile(){
        ZipOutputStream zos=null;
        BufferedInputStream bis=null;
        try{
            String fileName="D:\\Java\\Java_Training\\src\\Day_18\\test.txt";
            File file=new File(fileName);
            FileInputStream fis=new FileInputStream(file);
            bis=new BufferedInputStream(fis,BUFFER);
            FileOutputStream fos=new FileOutputStream("D:\\Java\\Java_Training\\src\\Day_18\\demo.zip");
            zos=new ZipOutputStream(fos);
            ZipEntry ze=new ZipEntry(file.getName());
            zos.putNextEntry(ze);
            byte[] data=new byte[BUFFER];
            int count;
            while((count=bis.read(data,0,BUFFER))!=-1){
                zos.write(data,0,count);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            if(zos!=null){
                try{
                    zos.close();
                }
                catch(IOException e){
                    System.out.println(e.getMessage());
                }
            }
             if(bis!=null){
                try{
                    bis.close();
                }
                catch(IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
