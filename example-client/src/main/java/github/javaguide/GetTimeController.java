package github.javaguide;

import github.javaguide.annotation.RpcReference;
import github.javaguide.annotation.RpcService;

public class GetTimeController {

    @RpcReference(version = "1.0", group = "time")
    public TimeService timeService;

    public void test() throws InterruptedException {
        String time = timeService.getServerTime("yyyy-MM-dd HH:mm:ss");
        Thread.sleep(12000);
        for (int i = 0; i < 10; i++) {
            System.out.println(timeService.getServerTime("yyyy-MM-dd HH:mm:ss"));
        }
    }



}
