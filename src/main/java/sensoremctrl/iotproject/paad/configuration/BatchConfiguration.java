//package sensoremctrl.iotproject.paad.configuration;
//
//import org.springframework.batch.core.Job;
//import org.springframework.batch.core.JobExecutionListener;
//import org.springframework.batch.core.Step;
//import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
//import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
//import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
//import org.springframework.batch.core.launch.support.RunIdIncrementer;
//import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
//import org.springframework.batch.item.database.JdbcBatchItemWriter;
//import org.springframework.batch.item.file.FlatFileItemReader;
//import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
//import org.springframework.batch.item.file.mapping.DefaultLineMapper;
//import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.jdbc.core.JdbcTemplate;
//import sensoremctrl.iotproject.paad.csvdata.DataValue;
//import sensoremctrl.iotproject.paad.entities.Chart;
//import sensoremctrl.iotproject.paad.listener.JobCompletionNotificationListener;
//import sensoremctrl.iotproject.paad.processor.ChartItemProcessor;
//
//import javax.sql.DataSource;
//import java.util.ArrayList;
//import java.util.List;
//
//
//@Configuration
//@EnableBatchProcessing
//public class BatchConfiguration {
//
//    @Autowired
//    public JobBuilderFactory jobBuilderFactory;
//
//    @Autowired
//    public StepBuilderFactory stepBuilderFactory;
//
//    @Bean
//    public FlatFileItemReader<DataValue> reader() {
//        FlatFileItemReader<DataValue> reader = new FlatFileItemReader<>();
//        reader.setResource(new ClassPathResource("sensor_data.csv"));
//        reader.setLineMapper(new DefaultLineMapper<DataValue>() {{
//            setLineTokenizer(new DelimitedLineTokenizer() {{
//                setNames(new String[] { "temperature", "humidity", "dateTime" });
//            }});
//            setFieldSetMapper(new BeanWrapperFieldSetMapper<DataValue>() {{
//                setTargetType(DataValue.class);
//            }});
//        }});
//        return reader;
//    }
//
//
//    @Bean
//    public ChartItemProcessor processor() {
//        return new ChartItemProcessor();
//    }
//
//    @Bean
//    public JdbcBatchItemWriter<DataValue> writer(DataSource dataSource) {
//        JdbcBatchItemWriter<DataValue> writer = new JdbcBatchItemWriter<>();
//
//        writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<DataValue>());
//        writer.setSql("INSERT INTO chart (time_stamp, date_stamp) VALUES (:time_stamp, :date_stamp)");
//        writer.setDataSource(dataSource);
//        return writer;
//    }
//
//    @Bean
//    public Job importUserJob(DataSource dataSource) {
//        return jobBuilderFactory.get("importUserJob")
//                .incrementer(new RunIdIncrementer())
//                .listener(listener(dataSource))
//                .flow(step1(dataSource))
//                .end()
//                .build();
//    }
//
//    @Bean
//    public Step step1(DataSource dataSource) {
//        return stepBuilderFactory.get("step1")
//                .<Chart, Chart> chunk(10)
//                .reader(reader())
//                .processor(processor())
//                .writer(writer(dataSource))
//                .build();
//    }
//
//    @Bean
//    public JobExecutionListener listener(DataSource dataSource) {
//        return new JobCompletionNotificationListener(new JdbcTemplate(dataSource));
//    }
//}
