package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceZ {
    public String printZ(int size) {


        StringBuilder newString = new StringBuilder();
        newString.append("\n");
        for(int row=0; row<size; row++) {
            for (int col=0;col<size;col++){
                String appender = " ";
                if (row==0 || row==size-1){
                    appender = "*";
                }
                if (row==size-col-1) {
                    appender = "*";
                }
                newString.append(appender);
            }
            newString.append("\n");
        }
        return "Service Z " + newString;
    };
}
