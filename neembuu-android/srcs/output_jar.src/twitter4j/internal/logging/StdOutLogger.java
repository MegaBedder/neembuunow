package twitter4j.internal.logging;

import java.io.PrintStream;
import java.util.Date;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationContext;

final class StdOutLogger
  extends Logger
{
  private static final boolean DEBUG = ConfigurationContext.getInstance().isDebugEnabled();
  
  public void debug(String paramString)
  {
    if (DEBUG) {
      System.out.println("[" + new Date() + "]" + paramString);
    }
  }
  
  public void debug(String paramString1, String paramString2)
  {
    if (DEBUG) {
      debug(paramString1 + paramString2);
    }
  }
  
  public void error(String paramString)
  {
    System.out.println("[" + new Date() + "]" + paramString);
  }
  
  public void error(String paramString, Throwable paramThrowable)
  {
    System.out.println(paramString);
    paramThrowable.printStackTrace(System.err);
  }
  
  public void info(String paramString)
  {
    System.out.println("[" + new Date() + "]" + paramString);
  }
  
  public void info(String paramString1, String paramString2)
  {
    info(paramString1 + paramString2);
  }
  
  public boolean isDebugEnabled()
  {
    return DEBUG;
  }
  
  public boolean isErrorEnabled()
  {
    return true;
  }
  
  public boolean isInfoEnabled()
  {
    return true;
  }
  
  public boolean isWarnEnabled()
  {
    return true;
  }
  
  public void warn(String paramString)
  {
    System.out.println("[" + new Date() + "]" + paramString);
  }
  
  public void warn(String paramString1, String paramString2)
  {
    warn(paramString1 + paramString2);
  }
}


/* Location:           F:\neembuu\Research\android_apps\output_jar.jar
 * Qualified Name:     twitter4j.internal.logging.StdOutLogger
 * JD-Core Version:    0.7.0.1
 */