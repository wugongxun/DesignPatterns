package com.wgx.responsibilitychain;

/**
 * @author wgx
 * @since 2023/4/19 16:44
 */
public class ShcoolMasterApprover extends Approver {
    public ShcoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        System.out.println("请求id:" + purchaseRequest.getId() + "被" + name + "处理");
    }
}
