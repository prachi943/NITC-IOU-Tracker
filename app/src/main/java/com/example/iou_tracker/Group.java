package com.example.iou_tracker;

import java.util.List;
public class Group {
    private String gName;
    private int noOfmembers;
    List<String> names;
    public Group(){

    }
    public Group(String gName,int noOfmembers, List<String> names){
        this.gName = gName;
        this.noOfmembers = noOfmembers;
        this.names = names;
    }

    public String getgName() {
        return gName;
    }

    public int getNoOfmembers() {
        return noOfmembers;
    }

    public List<String> getNames() {
        return names;
    }
}
