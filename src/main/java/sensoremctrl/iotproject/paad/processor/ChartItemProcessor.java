//package sensoremctrl.iotproject.paad.processor;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.batch.item.ItemProcessor;
//import sensoremctrl.iotproject.paad.csvdata.DataValue;
//import sensoremctrl.iotproject.paad.entities.Chart;
//
//import java.util.Date;
//
//public class ChartItemProcessor implements ItemProcessor<DataValue, DataValue> {
//
//    private static final Logger log = LoggerFactory.getLogger(ItemProcessor.class);
//
//
//    @Override
//    public DataValue process(final DataValue dataValue) throws Exception {
//        final Float humidity = dataValue.getHumidity();
//
//        final DataValue transformedChart = new DataValue(dataValue.getTemperature(), humidity, dataValue.getDateTime());
//
//        log.info("Converting : {" + dataValue + "} into {" + transformedChart
//                + "}");
//        return transformedChart;
//    }
//}
