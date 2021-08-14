package github.javaguide.serviceimpl;

import github.javaguide.TimeService;
import github.javaguide.annotation.RpcService;
import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@RpcService(version = "1.0", group = "Time")
public class TimeServiceImpl implements TimeService {

    @Override
    public String getServerTime(String dateFormat) {
        log.info("Receive time service request , time format is " + dateFormat);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        String time = simpleDateFormat.format(new Date());
        log.info("return server time :" + time);
        return time;
    }
}
