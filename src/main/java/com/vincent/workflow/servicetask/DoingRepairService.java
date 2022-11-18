package com.vincent.workflow.servicetask;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

/**
 * @author wang_cheng
 * @date 2022/11/18 15:47
 * @desc
 **/
@Service("doRepair")
public class DoingRepairService implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("开始上门修理");
        // 当前活动名称
        String currentActivityName = execution.getCurrentActivityName();
        System.out.println("当前活动名：" + currentActivityName);
        execution.setVariable("repairManName","王小满");
    }
}
