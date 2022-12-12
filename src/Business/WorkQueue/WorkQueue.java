/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author richajain
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }
    
    public ArrayList<WorkRequest> getInstance(){
        if(workRequestList==null){
            workRequestList=new ArrayList<WorkRequest>();
        }
        return workRequestList;
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        if(workRequestList==null){
            workRequestList=new ArrayList<WorkRequest>();
        }
        return workRequestList;
    }
    
}
