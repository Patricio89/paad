//package sensoremctrl.iotproject.paad.listener;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.batch.core.BatchStatus;
//import org.springframework.batch.core.JobExecution;
//import org.springframework.batch.core.listener.JobExecutionListenerSupport;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import sensoremctrl.iotproject.paad.csvdata.DataValue;
//import sensoremctrl.iotproject.paad.entities.Chart;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//public class JobCompletionNotificationListener extends JobExecutionListenerSupport {
//
//    private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);
//
//    private final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public JobCompletionNotificationListener(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    @Override
//    public void afterJob(JobExecution jobExecution) {
//        if(jobExecution.getStatus() == BatchStatus.COMPLETED) {
//            log.info("--- JOB FINISHED! ---");
//            log.info("Results:");
//
//            List<DataValue> results = jdbcTemplate.query("SELECT temperature, humidity, dateTime FROM datavalue", new RowMapper<Chart>() {
//                @Override
//                public Chart mapRow(ResultSet rs, int row) throws SQLException {
//                    return new Chart(rs.getFloat(1), rs.getFloat(2), rs.getDate());
//                }
//            });
//
//            for (DataValue dataValue : results) {
//                log.info("--- " + dataValue + " ---");
//            }
//
//        }
//    }
//}
