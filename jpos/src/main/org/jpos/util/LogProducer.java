package uy.com.cs.jpos.util;

import java.io.*;
import java.util.*;

/**
 * @author apr@cs.com.uy
 * @version $Id$
 */
public interface LogProducer {
    public void setLogger (Logger logger, String realm);
    public String getRealm ();
    public Logger getLogger ();
}

