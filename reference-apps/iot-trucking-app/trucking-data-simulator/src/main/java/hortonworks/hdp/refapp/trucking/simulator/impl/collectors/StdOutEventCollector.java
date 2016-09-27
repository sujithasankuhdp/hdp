package hortonworks.hdp.refapp.trucking.simulator.impl.collectors;

/**
 * Created by ssanku on 9/20/16.
 */
import hortonworks.hdp.refapp.trucking.simulator.impl.domain.AbstractEventCollector;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class StdOutEventCollector extends AbstractEventCollector {

    protected BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));

    @Override
    public void onReceive(Object message) throws Exception {
        log.write( message.toString() + "\n" );
        log.flush();
    }


}