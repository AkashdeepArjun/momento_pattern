package src.home;

import java.io.FileWriter;

import home.MyUtils;

public class Client {


    public static void main(String[] args){

        FileWriterHelper fileWriterHelper = new FileWriterHelper();
        FileWriterUtil file_writer= new FileWriterUtil("akeey");
        String data="hello this is akash";
         file_writer.write(data);
        MyUtils.log("SAVING DATA...", data);
        fileWriterHelper.save(file_writer);
        file_writer.write(" poplu ");
        MyUtils.log("NEW DATA", file_writer.toString());

        MyUtils.log("LOADING DATA","Loading old data");
        fileWriterHelper.loadLastSaved(file_writer);
        MyUtils.log("ORIGNAL DATA",file_writer.toString());
    }
    
    
}
