package sensoremctrl.iotproject.paad.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import sensoremctrl.iotproject.paad.entities.Chart;

public class ChartItemProcessor implements ItemProcessor<Chart, Chart> {

    private static final Logger log = LoggerFactory.getLogger(ItemProcessor.class);


    @Override
    public Chart process(final Chart chart) throws Exception {
        final String name = chart.getDate_stamp().toUpperCase();

        final Chart transformedChart = new Chart(chart.getId(), name, chart.getTime_stamp());

        log.info("Converting : {" + chart + "} into {" + transformedChart
                + "}");
        return transformedChart;
    }
}
