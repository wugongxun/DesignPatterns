package com.wgx.responsibilitychain;

/**
 * @author wgx
 * @since 2023/4/19 16:44
 */
public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 10000) {
            System.out.println("请求id:" + purchaseRequest.getId() + "被" + name + "处理");
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}
