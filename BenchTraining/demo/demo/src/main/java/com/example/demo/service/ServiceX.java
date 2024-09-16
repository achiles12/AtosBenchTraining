package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceX {
    public String printX(int size) {

        StringBuilder newString = new StringBuilder();
        newString.append("\n");
        newString.append("\n");
        for(int row=0; row<size; row++) {
            for (int col=0;col<size;col++){
                String appender = " ";
                if (row==col || row==size-1-col){
                    appender = "*";
                }

                newString.append(appender);
            }
            newString.append("\n");
        }
        return "Service X " + newString;

    };
}
