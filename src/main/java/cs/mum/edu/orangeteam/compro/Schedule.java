package cs.mum.edu.orangeteam.compro;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class Schedule {

    @Scheduled(cron =  "0 0 */6 ? * *") // every 6 hours this cron works
    public void cptReportReminder(){
        System.out.println("REMIND CPT REPORT");
    }

}
