//package Programs;
//package com.tk20.seleniumtestassessment.base;
//
//import com.tk20.seleniumtestassessment.datareader.TestCaseInputReader;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Properties;
//import org.apache.log4j.HTMLLayout;
//import org.apache.log4j.Layout;
//import org.apache.log4j.helpers.Transform;
//import org.apache.log4j.spi.LoggingEvent;
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//public class LogLayout
//  extends HTMLLayout
//{
//  String lastvalue;
//  int lastLine;
//  String lastXpath;
//  protected final int BUF_SIZE = 256;
//  protected final int MAX_CAPACITY = 1024;
//  
//  static String TRACE_PREFIX = "<br>&nbsp;&nbsp;&nbsp;&nbsp;";
//  
//
//  private String timestampFormat = "yyyy-MM-dd-HH:mm:ss";
//  
//  private SimpleDateFormat sdf = new SimpleDateFormat(timestampFormat);
//  
//
//
//
//
//  private StringBuffer sbuf = new StringBuffer(256);
//  
//
//
//
//
//
//  /**
//   * @deprecated
//   */
//  public static final String LOCATION_INFO_OPTION = "LocationInfo";
//  
//
//
//
//
//
//  public static final String TITLE_OPTION = "Title";
//  
//
//
//
//
//
//  boolean locationInfo = false;
//  
//  String title = "Application Log";
//  
//  public LogLayout() {}
//  
//  public String format(LoggingEvent event)
//  {
//    if (sbuf.capacity() > 1024) {
//      sbuf = new StringBuffer(256);
//    } else {
//      sbuf.setLength(0);
//    }
//    
//    sbuf.append(Layout.LINE_SEP + "<tr>" + Layout.LINE_SEP);
//    
//    sbuf.append("<td>");
//    sbuf.append(sdf.format(new Date(timeStamp)));
//    sbuf.append("</td>" + Layout.LINE_SEP);
//    
//
//    String keyword = DataProvider.keyword;
//    int currentline = DataProvider.testStepID;
//    if ((keyword == null) && (currentline == 0))
//    {
//      keyword = "Starting the Suite";
//      sbuf.append("<td>");
//      sbuf.append(keyword);
//    }
//    else if ((keyword.equals(lastvalue)) && (currentline == lastLine)) {
//      sbuf.append("<td>");
//    }
//    else if ((keyword.equals(lastvalue)) && (currentline == DataProvider.testInputReader.getRowCount(Constants.TEST_STEPS_SHEET) + 1)) {
//      sbuf.append("<td>");
//    }
//    else {
//      lastvalue = keyword;
//      lastLine = currentline;
//      sbuf.append("<td>");
//      sbuf.append(currentline + "/" + keyword);
//    }
//    
//    sbuf.append("</td>" + Layout.LINE_SEP);
//    
//    String xpath = DataProvider.object;
//    
//    if (xpath == null) {
//      xpath = "Starting the Suite";
//      sbuf.append("<td>");
//      sbuf.append(xpath);
//    }
//    else if (xpath.equals(lastXpath)) {
//      sbuf.append("<td>");
//    }
//    else
//    {
//      lastXpath = xpath;
//      String object = DataProvider.OR.getProperty(xpath);
//      if (object == null) {
//        sbuf.append("<td>");
//      } else {
//        sbuf.append("<td>");
//        sbuf.append(xpath + " = " + object);
//      }
//    }
//    
//    sbuf.append("</td>" + Layout.LINE_SEP);
//    
//
//    sbuf.append("<td title=\"Message\">");
//    
//
//
//
//
//    String message = event.getRenderedMessage();
//    if (message.equals(DataProvider.msg))
//    {
//      sbuf.append("<FONT COLOR=#AF1E2D FACE=AriaL SIZE=2><b>" + Layout.LINE_SEP);
//      sbuf.append(event.getRenderedMessage());
//      sbuf.append("</td>" + Layout.LINE_SEP);
//      sbuf.append("</tr>" + Layout.LINE_SEP);
//    }
//    else {
//      sbuf.append(event.getRenderedMessage());
//      
//      sbuf.append("</td>" + Layout.LINE_SEP);
//      sbuf.append("</tr>" + Layout.LINE_SEP);
//    }
//    
//
//    if (event.getNDC() != null) {
//      sbuf.append("<tr><td bgcolor=\"#EEEEEE\" style=\"font-size : xx-small;\" colspan=\"6\" title=\"Nested Diagnostic Context\">");
//      sbuf.append("NDC: " + Transform.escapeTags(event.getNDC()));
//      sbuf.append("</td></tr>" + Layout.LINE_SEP);
//    }
//    
//    String[] s = event.getThrowableStrRep();
//    if (s != null) {
//      sbuf.append("<tr><td bgcolor=\"#993300\" style=\"color:White; font-size : xx-small;\" colspan=\"6\">");
//      appendThrowableAsHTML(s, sbuf);
//      sbuf.append("</td></tr>" + Layout.LINE_SEP);
//    }
//    
//    return sbuf.toString();
//  }
//  
//
//
//
//  public void setTimestampFormat(String format)
//  {
//    timestampFormat = format;
//    sdf = new SimpleDateFormat(format);
//  }
//  
//
//
//  public String getTimestampFormat()
//  {
//    return timestampFormat;
//  }
//  
//  public void appendThrowableAsHTML(String[] s, StringBuffer sbuf) {
//    if (s != null) {
//      int len = s.length;
//      if (len == 0)
//        return;
//      sbuf.append(Transform.escapeTags(s[0]));
//      sbuf.append(Layout.LINE_SEP);
//      for (int i = 1; i < len; i++) {
//        sbuf.append(TRACE_PREFIX);
//        sbuf.append(Transform.escapeTags(s[i]));
//        sbuf.append(Layout.LINE_SEP);
//      }
//    }
//  }
//  
//
//
//
//  public String getHeader()
//  {
//    StringBuffer sbuf = new StringBuffer();
//    sbuf.append("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">" + Layout.LINE_SEP);
//    sbuf.append("<html>" + Layout.LINE_SEP);
//    sbuf.append("<head>" + Layout.LINE_SEP);
//    sbuf.append("<title>" + title + "</title>" + Layout.LINE_SEP);
//    sbuf.append("<style type=\"text/css\">" + Layout.LINE_SEP);
//    sbuf.append("<!--" + Layout.LINE_SEP);
//    sbuf.append("body, table {font-family: arial,sans-serif; font-size: x-small;}" + Layout.LINE_SEP);
//    sbuf.append("th {background: #336699; color: #FFFFFF; text-align: left;}" + Layout.LINE_SEP);
//    sbuf.append("-->" + Layout.LINE_SEP);
//    sbuf.append("</style>" + Layout.LINE_SEP);
//    sbuf.append("</head>" + Layout.LINE_SEP);
//    sbuf.append("<body bgcolor=\"#FFFFFF\" topmargin=\"6\" leftmargin=\"6\">" + Layout.LINE_SEP);
//    sbuf.append("<hr size=\"1\" noshade>" + Layout.LINE_SEP);
//    sbuf.append("Log session start time " + new Date() + "<br>" + Layout.LINE_SEP);
//    sbuf.append("<br>" + Layout.LINE_SEP);
//    sbuf.append("<table cellspacing=\"0\" cellpadding=\"4\" border=\"1\" bordercolor=\"#224466\" width=\"100%\">" + Layout.LINE_SEP);
//    sbuf.append("<tr>" + Layout.LINE_SEP);
//    sbuf.append("<th>Time</th>" + Layout.LINE_SEP);
//    sbuf.append("<th>Line No/KeyWord</th>" + Layout.LINE_SEP);
//    sbuf.append("<th>Object/Value</th>" + Layout.LINE_SEP);
//    if (locationInfo) {
//      sbuf.append("<th>File:Line</th>" + Layout.LINE_SEP);
//    }
//    sbuf.append("<th>Message</th>" + Layout.LINE_SEP);
//    sbuf.append("</tr>" + Layout.LINE_SEP);
//    return sbuf.toString();
//  }
//  
//  public boolean ignoresThrowable()
//  {
//    return false;
//  }
//}
