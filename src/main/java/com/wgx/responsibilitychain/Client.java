package com.wgx.responsibilitychain;

import java.util.UUID;

/**
 * @author wgx
 * @since 2023/4/19 16:48
 */
public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 1, 3000);
        DepartmentApprover departmentApprover = new DepartmentApprover("主任");
        CollegeApprover collegeApprover = new CollegeApprover("院长");
        ViceShcoolMasterApprover viceShcoolMasterApprover = new ViceShcoolMasterApprover("副校长");
        ShcoolMasterApprover shcoolMasterApprover = new ShcoolMasterApprover("校长");


        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceShcoolMasterApprover);
        viceShcoolMasterApprover.setApprover(shcoolMasterApprover);


        departmentApprover.processRequest(purchaseRequest);
    }
}
