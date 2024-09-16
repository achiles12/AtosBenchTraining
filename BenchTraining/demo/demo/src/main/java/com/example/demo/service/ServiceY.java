package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceY {
    public String printY(int size) {
        StringBuilder newString = new StringBuilder();
        newString.append("\n");
        newString.append("\n");
        for(int row=0; row<size; row++) {
            for (int col=0;col<size;col++){
                String appender = " ";
                if ((row==col || row==size-1-col) && row<size/2){
                    appender = "*";
                }
                if (size%2 == 1) {
                    if (row >= Math.round(size/2) && col == size / 2) {
                        appender = "*";
                    }
                }
                if (size%2 == 0) {
                    if (row >= Math.round(size/2) && (col == (size-1) / 2) ){
                        appender = "*";
                    }
                    if (row >= Math.round(size/2) && (col == (size) / 2) ){
                        appender = "*";
                    }
                }
                newString.append(appender);
            }
            newString.append("\n");
        }
        return "Service Y " + newString;
    };
}
