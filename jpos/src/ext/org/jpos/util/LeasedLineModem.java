/*
 * $Log$
 * Revision 1.1  2000/01/11 01:24:56  apr
 * moved non ISO-8583 related classes from jpos.iso to jpos.util package
 * (AntiHog LeasedLineModem LogEvent LogListener LogProducer
 *  Loggeable Logger Modem RotateLogListener SimpleAntiHog SimpleDialupModem
 *  SimpleLogListener SimpleLogProducer SystemMonitor V24)
 *
 * Revision 1.1  1999/11/24 18:08:56  apr
 * Added VISA 1 Support
 *
 */

package uy.com.cs.jpos.util;

import java.io.*;
import javax.comm.*;

public class LeasedLineModem implements Modem {
    V24 v24;

    public LeasedLineModem (V24 v24) {
	super();
	this.v24 = v24;
    }
    
    public void dial (String phoneNumber, long aproxTimeout) 
	throws IOException
    {
    }
    public void hangup () throws IOException {
	throw new IOException ("LeasedLine - cannot hangup");
    }
    public boolean isConnected() {
	return v24.isConnected();
    }
}
