//package Programs;
//
//import com.tk20.seleniumtestassessment.base.Constants;
//import com.tk20.seleniumtestassessment.base.DataProvider;
//import com.tk20.seleniumtestassessment.util.KeywordEventsUtill;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.List;
//import java.util.Properties;
//
//import org.apache.log4j.Logger;
//import org.openqa.selenium.By;
//import org.openqa.selenium.TimeoutException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Wait;
//
//public class FE_KeywordEvents
//{
//  KeywordEventsUtill keyUtill = (KeywordEventsUtill)KeywordEventsUtill.keyUtillFactory();
//  int org_cb;
//  int admin_org_cb;
//  
//  public FE_KeywordEvents() {}
//  
//  public String clickOnTemplateBuilder(String object, String data)
//  {
//    DataProvider.logger.debug("click on the template builder link");
//    try {
//      List<WebElement> tempName = KeywordEventsUtill.explictWaitForElementList("temp_name_rows");
//      boolean flag = false;
//      String temp = data.trim();
//      for (int i = 0; i < tempName.size(); i++)
//      {
//        String template_name = ((WebElement)tempName.get(i)).getText().trim();
//        if (template_name.equals(temp))
//        {
//          ((WebElement)tempName.get(i)).click();
//          flag = true;
//          break;
//        }
//      }
//      if (flag)
//      {
//        return Constants.KEYWORD_PASS + "--" + data + "---is found to click";
//      }
//      
//    }
//    catch (TimeoutException ex)
//    {
//      return Constants.KEYWORD_FAIL + "Cause: " + ex.getCause();
//    }
//    catch (Exception nse)
//    {
//      return Constants.KEYWORD_FAIL + nse.getLocalizedMessage();
//    }
//    return Constants.KEYWORD_FAIL + " - Template builder name  is not found to click.";
//  }
//  
//
//
//  public String checkAssessmentTool(String object, String data)
//  {
//    DataProvider.logger.debug("selecting Assessment tool from the checkbox");
//    try
//    {
//      String checked = "";
//      int j = 0;
//      List<WebElement> assessmentTool = KeywordEventsUtill.explictWaitForElementList("temp_asses_tool_rows");
//      List<WebElement> checkboxValue = KeywordEventsUtill.explictWaitForElementList(object);
//      boolean flag = false;
//      String temp = data;
//      String[] allElements = temp.split(Constants.Object_SPLIT);
//      for (int i = 0; i < assessmentTool.size(); i++)
//      {
//        String assessmentToolValue = ((WebElement)assessmentTool.get(i)).getText();
//        j = i; if (j < checkboxValue.size())
//        {
//          checked = ((WebElement)checkboxValue.get(j)).getAttribute(DataProvider.OR.getProperty("ATTRIBUTE_CHECKED"));
//        }
//        
//
//        for (int k = 0; k < allElements.length; k++)
//        {
//          if ((assessmentToolValue.equals(allElements[k])) && (checked == null))
//          {
//            ((WebElement)checkboxValue.get(j - 1)).click();
//            flag = true;
//            break;
//          } }
//      }
//      if (flag)
//      {
//        return Constants.KEYWORD_PASS + "--" + data + "--is found to check";
//      }
//      
//
//      return Constants.KEYWORD_FAIL + " - no Assessment tool is found to check";
//
//    }
//    catch (TimeoutException ex)
//    {
//      return Constants.KEYWORD_FAIL + "Cause: " + ex.getCause();
//    }
//    catch (Exception nse)
//    {
//      return Constants.KEYWORD_FAIL + nse.getLocalizedMessage();
//    }
//  }
//  
//
//
//
//  public String selectPlaceHolderCheckbox(String object, String data)
//  {
//    try
//    {
//      List<WebElement> ptPlaceholderName = KeywordEventsUtill.explictWaitForElementList("temp_name_rows");
//      List<WebElement> checkboxValue = KeywordEventsUtill.explictWaitForElementList(object);
//      boolean flag = false;
//      String temp = data;
//      for (int i = 0; i < ptPlaceholderName.size(); i++)
//      {
//        String PlaceholderName = ((WebElement)ptPlaceholderName.get(i)).getText();
//        if (PlaceholderName.equals(temp))
//        {
//          ((WebElement)checkboxValue.get(i - 2)).click();
//          flag = true;
//          break;
//        }
//      }
//      if (flag) {
//        return Constants.KEYWORD_PASS + "--" + data + "-- is found to check";
//      }
//      return Constants.KEYWORD_PASS + "--Correct Placeholder name is not found to check";
//
//    }
//    catch (TimeoutException ex)
//    {
//      return Constants.KEYWORD_FAIL + "Cause: " + ex.getCause();
//    }
//    catch (Exception nse)
//    {
//      return Constants.KEYWORD_FAIL + nse.getLocalizedMessage();
//    }
//  }
//  
//
//
//  public String selectTemplateNameCheckBox(String object, String data)
//  {
//    DataProvider.logger.debug("selecting Template name from the checkbox");
//    try
//    {
//      String checked = "";
//      int j = 0;
//      List<WebElement> templateName = KeywordEventsUtill.explictWaitForElementList("temp_name_rows");
//      List<WebElement> checkboxValue = KeywordEventsUtill.explictWaitForElementList(object);
//      boolean flag = false;
//      String temp = data;
//      String[] allElements = temp.split(Constants.Object_SPLIT);
//      for (int i = 0; i < templateName.size(); i++)
//      {
//        String templateNameValue = ((WebElement)templateName.get(i)).getText();
//        j = i; if (j < checkboxValue.size())
//        {
//          checked = ((WebElement)checkboxValue.get(j)).getAttribute(DataProvider.OR.getProperty("ATTRIBUTE_CHECKED"));
//        }
//        
//        for (int k = 0; k < allElements.length; k++)
//        {
//          if ((templateNameValue.equals(allElements[k].trim())) && (checked == null))
//          {
//            ((WebElement)checkboxValue.get(j)).click();
//            flag = true;
//            break;
//          } }
//      }
//      if (flag)
//      {
//        return Constants.KEYWORD_PASS + "--" + data + "--is found to check";
//      }
//      
//
//      return Constants.KEYWORD_FAIL + " - no template name is found to check";
//
//    }
//    catch (TimeoutException ex)
//    {
//      return Constants.KEYWORD_FAIL + "Cause: " + ex.getCause();
//    }
//    catch (Exception nse)
//    {
//      return Constants.KEYWORD_FAIL + nse.getLocalizedMessage();
//    }
//  }
//  
//
//
//  public String verifyTempNameWithLessthanSymbol(String object, String data)
//  {
//    DataProvider.logger.debug("verifying Field Exp with Lessthan Symbol");
//    try {
//      List<WebElement> tempName = KeywordEventsUtill.explictWaitForElementList("temp_name_rows");
//      boolean flag = false;
//      String temp = data.trim();
//      for (int i = 0; i < tempName.size(); i++)
//      {
//        String template_name = ((WebElement)tempName.get(i)).getText().trim();
//        if (template_name.equals(temp))
//        {
//          flag = true;
//          break;
//        }
//      }
//      if (flag)
//      {
//        return Constants.KEYWORD_FAIL + "--Temp Name with < symbol is displayed as Blank";
//      }
//      
//    }
//    catch (TimeoutException ex)
//    {
//      return Constants.KEYWORD_FAIL + "Cause: " + ex.getCause();
//    }
//    catch (Exception nse)
//    {
//      return Constants.KEYWORD_FAIL + nse.getLocalizedMessage();
//    }
//    return Constants.KEYWORD_PASS + "--Temp Name starting with '<' symbol is displayed.";
//  }
//  
//
//
//
//
//
//
//
//  public String selectSiteCheckbox(String object, String data)
//  {
//    try
//    {
//      String checked = "";
//      int j = 0;
//      List<WebElement> siteName = KeywordEventsUtill.explictWaitForElementList("site_name_rows");
//      List<WebElement> checkboxValue = KeywordEventsUtill.explictWaitForElementList(object);
//      boolean flag = false;
//      String temp = data;
//      String[] allElements = temp.split(Constants.Object_SPLIT);
//      for (int i = 0; i < siteName.size(); i++)
//      {
//        String ColumnNameValue = ((WebElement)siteName.get(i)).getText();
//        j = i; if (j < checkboxValue.size())
//        {
//          checked = ((WebElement)checkboxValue.get(j)).getAttribute(DataProvider.OR.getProperty("ATTRIBUTE_CHECKED"));
//        }
//        
//        for (int k = 0; k < allElements.length; k++)
//        {
//          if ((ColumnNameValue.equals(allElements[k].trim())) && (checked == null))
//          {
//            ((WebElement)checkboxValue.get(j)).click();
//            flag = true;
//            break;
//          } }
//      }
//      if (flag)
//      {
//        return Constants.KEYWORD_PASS + " -- " + data + "--is found to delete";
//      }
//      
//
//      return Constants.KEYWORD_FAIL + "--" + "Correct site name is not found to delete";
//
//    }
//    catch (TimeoutException ex)
//    {
//
//      return Constants.KEYWORD_FAIL + "Cause: " + ex.getCause();
//    }
//    catch (Exception nse)
//    {
//      return Constants.KEYWORD_FAIL + nse.getLocalizedMessage();
//    }
//  }
//  
//
//  public String clickOnSiteName(String object, String data)
//  {
//    DataProvider.logger.debug("click on the Sites name link");
//    
//    try
//    {
//      String sName = "";
//      List<WebElement> siteName = KeywordEventsUtill.explictWaitForElementList("site_name_rows");
//      String site_name = DataProvider.OR.getProperty("site_name");
//      boolean flag = false;
//      
//      for (int j = 0; j < siteName.size(); j++)
//      {
//        sName = ((WebElement)siteName.get(j)).getText();
//        if (sName.equals(site_name))
//        {
//          flag = true;
//          KeywordEventsUtill.driver.findElement(By.linkText(((WebElement)siteName.get(j)).getText())).click();
//          if (flag)
//          {
//            return Constants.KEYWORD_PASS;
//          }
//        }
//      }
//    }
//    catch (TimeoutException ex)
//    {
//      return Constants.KEYWORD_FAIL + "Cause: " + ex.getCause();
//    }
//    catch (Exception nse)
//    {
//      return Constants.KEYWORD_FAIL + nse.getLocalizedMessage();
//    }
//    return Constants.KEYWORD_FAIL + " Site name is not displayd .";
//  }
//  
//
//
//
//  public String clickOnSiteNamebyDistrict(String object, String data)
//  {
//    try
//    {
//      List<WebElement> siteName = KeywordEventsUtill.explictWaitForElementList("site_name1_rows");
//      List<WebElement> distName = KeywordEventsUtill.explictWaitForElementList("site_dist_rows");
//      boolean flag = false;
//      String[] temp = data.split(Constants.Object_SPLIT);
//      String actSiteName = temp[0];
//      String actDisName = temp[1];
//      
//      for (int i = 0; i < siteName.size(); i++)
//      {
//        String expSite = ((WebElement)siteName.get(i)).getText().trim();
//        String expDist = ((WebElement)distName.get(i)).getText().trim();
//        if ((expSite.equals(actSiteName.trim())) && (expDist.equals(actDisName.trim())))
//        {
//          ((WebElement)siteName.get(i)).click();
//          flag = true;
//          break;
//        }
//      }
//      if (flag)
//      {
//        return Constants.KEYWORD_PASS + "--" + data + "--is found to click";
//      }
//      
//
//      return Constants.KEYWORD_FAIL + "Correct site name is not found click";
//
//    }
//    catch (TimeoutException ex)
//    {
//      return Constants.KEYWORD_FAIL + "Cause: " + ex.getCause();
//    }
//    catch (Exception nse)
//    {
//      return Constants.KEYWORD_FAIL + nse.getLocalizedMessage();
//    }
//  }
//  
//
//
//
//  public String selectYearCheckbox(String object, String data)
//  {
//    try
//    {
//      List<WebElement> yearName = KeywordEventsUtill.explictWaitForElementList("site_year_rows");
//      List<WebElement> checkboxValue = KeywordEventsUtill.explictWaitForElementList(object);
//      boolean flag = false;
//      String temp = data;
//      for (int i = 1; i < yearName.size(); i++)
//      {
//        String actYearName = ((WebElement)yearName.get(i)).getText().trim();
//        if (actYearName.equals(temp.trim()))
//        {
//          ((WebElement)checkboxValue.get(i - 1)).click();
//          flag = true;
//          break;
//        }
//      }
//      if (flag)
//      {
//        return Constants.KEYWORD_PASS + "--" + data + "   " + "--is found to check";
//      }
//      
//
//      return Constants.KEYWORD_PASS + "Correct year name is not found to check";
//
//    }
//    catch (TimeoutException ex)
//    {
//      return Constants.KEYWORD_FAIL + "Cause: " + ex.getCause();
//    }
//    catch (Exception nse)
//    {
//      return Constants.KEYWORD_FAIL + nse.getLocalizedMessage();
//    }
//  }
//  
//
//
//
//  public String selectFileNameCheckBox(String object, String data)
//  {
//    try
//    {
//      List<WebElement> fileName = KeywordEventsUtill.explictWaitForElementList("site_year_rows");
//      List<WebElement> checkboxValue = KeywordEventsUtill.explictWaitForElementList(object);
//      boolean flag = false;
//      String temp = data;
//      for (int i = 1; i < fileName.size(); i++)
//      {
//        String actFileName = ((WebElement)fileName.get(i)).getText().trim();
//        if (actFileName.equals(temp.trim()))
//        {
//          ((WebElement)checkboxValue.get(i - 1)).click();
//          flag = true;
//          break;
//        }
//      }
//      if (flag)
//      {
//        return Constants.KEYWORD_PASS + "--" + data + "--is found to check";
//      }
//      
//
//      return Constants.KEYWORD_PASS + "---Correct file name is not found to check";
//
//    }
//    catch (TimeoutException ex)
//    {
//      return Constants.KEYWORD_FAIL + "Cause: " + ex.getCause();
//    }
//    catch (Exception nse)
//    {
//      return Constants.KEYWORD_FAIL + nse.getLocalizedMessage();
//    }
//  }
//  
//
//
//  public String selectStaff(String object, String data)
//  {
//    try
//    {
//      List<WebElement> staffName = KeywordEventsUtill.explictWaitForElementList("site_year_rows");
//      List<WebElement> checkboxValue = KeywordEventsUtill.explictWaitForElementList(object);
//      boolean flag = false;
//      String temp = data;
//      for (int i = 1; i < staffName.size(); i++)
//      {
//        String actStaffName = ((WebElement)staffName.get(i)).getText().trim();
//        if (actStaffName.equals(temp.trim()))
//        {
//          ((WebElement)checkboxValue.get(i - 1)).click();
//          flag = true;
//          break;
//        }
//      }
//      if (flag)
//      {
//        return Constants.KEYWORD_PASS + "--" + data + "--is found to check";
//      }
//      
//
//      return Constants.KEYWORD_PASS + "---Correct staff name is not found to check";
//
//    }
//    catch (TimeoutException ex)
//    {
//      return Constants.KEYWORD_FAIL + "Cause: " + ex.getCause();
//    }
//    catch (Exception nse)
//    {
//      return Constants.KEYWORD_FAIL + nse.getLocalizedMessage();
//    }
//  }
//  
//
//  public String verifySiteNameWithLessthanSymbol(String object, String data)
//  {
//    DataProvider.logger.debug("click on the Sites name link");
//    try
//    {
//      Boolean flag = Boolean.valueOf(false);
//      
//      String sName = "";
//      List<WebElement> siteName = KeywordEventsUtill.explictWaitForElementList("site_search_rows");
//      String temp = data.trim();
//      
//      for (int j = 0; j < siteName.size(); j++)
//      {
//        sName = ((WebElement)siteName.get(j)).getText().trim();
//        if (sName.equals(temp))
//        {
//          flag = Boolean.valueOf(true);
//          return Constants.KEYWORD_FAIL + "--Site name with '<' symbol is displayed as Blank";
//        }
//      }
//      if (!flag.booleanValue())
//      {
//        return Constants.KEYWORD_PASS + " Site name is displayed .";
//      }
//    }
//    catch (TimeoutException ex)
//    {
//      return Constants.KEYWORD_FAIL + "Cause: " + ex.getCause();
//    }
//    catch (Exception nse)
//    {
//      return Constants.KEYWORD_FAIL + nse.getLocalizedMessage();
//    }
//    return Constants.KEYWORD_FAIL + " Correct Site name is not found to search.";
//  }
//  
//
//
//
//  public String selectDistrictNameCheckbox(String object, String data)
//  {
//    DataProvider.logger.debug("select the checkbox to delete the District name link ");
//    try {
//      String checked = "";
//      int j = 0;
//      List<WebElement> dictrictCode = KeywordEventsUtill.explictWaitForElementList("dist_code_rows");
//      List<WebElement> checkboxValue = KeywordEventsUtill.explictWaitForElementList(object);
//      boolean flag = false;
//      String temp = data;
//      String[] allElements = temp.split(Constants.Object_SPLIT);
//      for (int i = 0; i < dictrictCode.size(); i++) {
//        String codeValue = ((WebElement)dictrictCode.get(i)).getText();
//        j = i; if (j < checkboxValue.size()) {
//          checked = ((WebElement)checkboxValue.get(j)).getAttribute(DataProvider.OR.getProperty("ATTRIBUTE_CHECKED"));
//        }
//        
//        for (int k = 0; k < allElements.length; k++)
//        {
//          if ((codeValue.equals(allElements[k].trim())) && (checked == null)) {
//            ((WebElement)checkboxValue.get(j)).click();
//            flag = true;
//            break;
//          } }
//      }
//      if (flag) {
//        return Constants.KEYWORD_PASS;
//      }
//      return 
//        Constants.KEYWORD_PASS + "----Districts that are in use cannot be deleted.";
//
//    }
//    catch (TimeoutException ex)
//    {
//      return Constants.KEYWORD_FAIL + "Cause: " + ex.getCause();
//    }
//    catch (Exception nse)
//    {
//      return Constants.KEYWORD_FAIL + nse.getLocalizedMessage();
//    }
//  }
//  
//
//
//
//
//
//  public String searchDistrictWithLessthanSymbol(String object, String data)
//  {
//    DataProvider.logger.debug("check the district name  by doing the pagination.");
//    try
//    {
//      List<WebElement> ColumnName = KeywordEventsUtill.explictWaitForElementList("dist_name_rows");
//      boolean flag = false;
//      String temp = data.trim();
//      for (int i = 0; i < ColumnName.size(); i++)
//      {
//        String districtName = ((WebElement)ColumnName.get(i)).getText();
//        if (districtName.equals(temp))
//        {
//          flag = true;
//          return Constants.KEYWORD_FAIL + "---District name starting with '<' symbol is displayed as Blank ";
//        }
//      }
//      if (!flag)
//      {
//        int size = KeywordEventsUtill.explictWaitForElementList(object).size();
//        if (size > 0)
//        {
//          ((WebElement)KeywordEventsUtill.wait.until(KeywordEventsUtill.explicitWaitForElement(By.linkText("next_link")))).click();
//          return searchDistrictWithLessthanSymbol(object, data);
//        }
//        
//
//
//        return Constants.KEYWORD_PASS + "--district name starting with '<' symbol is found.";
//      }
//      
//    }
//    catch (TimeoutException ex)
//    {
//      return Constants.KEYWORD_FAIL + "Cause: " + ex.getCause();
//    }
//    catch (Exception nse)
//    {
//      return Constants.KEYWORD_FAIL + nse.getLocalizedMessage();
//    }
//    return Constants.KEYWORD_PASS + "--district name starting with '<' symbol is found.";
//  }
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
//  public String checkForElementExistance(String object, String data)
//    throws InterruptedException
//  {
//    try
//    {
//      KeywordEventsUtill.driver.manage().timeouts().implicitlyWait(30L, java.util.concurrent.TimeUnit.SECONDS);
//      String[] objArr = object.split(Constants.DATA_SPLIT);
//      
//
//      String ERROR_MSG_XPATH = DataProvider.OR.getProperty(objArr[0]);
//      String EXPECTED_ERROR_MSG_TEXT = DataProvider.OR.getProperty(objArr[1]);
//      String INPUT_FIELD_XPATH = DataProvider.OR.getProperty(objArr[2]);
//      String BUTTON_XPATH = DataProvider.OR.getProperty(objArr[3]);
//      
//
//      if ((ERROR_MSG_XPATH == null) || (ERROR_MSG_XPATH.equals("")))
//      {
//        return Constants.KEYWORD_FAIL + "--\"" + objArr[0] + "\" is not a valid xpath please check in property file";
//      }
//      if ((EXPECTED_ERROR_MSG_TEXT == null) || (EXPECTED_ERROR_MSG_TEXT.equals("")))
//      {
//        return Constants.KEYWORD_FAIL + "--\"" + objArr[1] + "\" is not a valid value Please check in property file";
//      }
//      if ((INPUT_FIELD_XPATH == null) || (INPUT_FIELD_XPATH.equals("")))
//      {
//        return Constants.KEYWORD_FAIL + "--\"" + objArr[2] + "\" is not a valid xpath Please check in property file";
//      }
//      if ((BUTTON_XPATH == null) || (BUTTON_XPATH.equals("")))
//      {
//        return Constants.KEYWORD_FAIL + "--\"" + objArr[3] + "\" is not a valid xpath please check in property file";
//      }
//      
//
//      String randomNum = KeywordEventsUtill.createRandomNum();
//      
//      String actualErrorMsg = "";
//      
//      int error_msg_size = KeywordEventsUtill.driver.findElements(By.xpath(ERROR_MSG_XPATH)).size();
//      
//
//      if (error_msg_size != 0)
//      {
//        actualErrorMsg = KeywordEventsUtill.driver.findElement(By.xpath(ERROR_MSG_XPATH)).getText();
//        
//        if (!actualErrorMsg.contains(EXPECTED_ERROR_MSG_TEXT))
//        {
//          return 
//            Constants.KEYWORD_FAIL + "--Error message \"" + actualErrorMsg + "\"is being displayed due to some other reason" + "\n it is not matching with expected msg i.e. " + EXPECTED_ERROR_MSG_TEXT;
//        }
//        
//        String updatedData = data.concat(randomNum);
//        KeywordEventsUtill.driver.findElement(By.xpath(INPUT_FIELD_XPATH)).clear();
//        KeywordEventsUtill.driver.findElement(By.xpath(INPUT_FIELD_XPATH)).sendKeys(new CharSequence[] { updatedData });
//        DataProvider.logger.debug("Entered " + updatedData + " into the text field");
//        KeywordEventsUtill.driver.findElement(By.xpath(BUTTON_XPATH)).click();
//        DataProvider.logger.debug("Clicked on " + objArr[3]);
//        Thread.sleep(2000L);
//        return Constants.KEYWORD_PASS + "--Entered \"" + updatedData + "\" to the input field";
//      }
//      
//
//      return Constants.KEYWORD_PASS + "-- There is no error message";
//    }
//    catch (TimeoutException ex)
//    {
//      return Constants.KEYWORD_FAIL + "Cause: " + ex.getCause();
//    }
//    catch (Exception nse)
//    {
//      return Constants.KEYWORD_FAIL + nse.getLocalizedMessage();
//    }
//  }
//  
//
//
//  public String selectPlaceholderCheckbox(String object, String data)
//  {
//    try
//    {
//      List<WebElement> ptPlaceholderName = KeywordEventsUtill.explictWaitForElementList("pt_place_holder_rows");
//      List<WebElement> checkboxValue = KeywordEventsUtill.explictWaitForElementList(object);
//      boolean flag = false;
//      String temp = data;
//      for (int i = 0; i < ptPlaceholderName.size(); i++)
//      {
//        String PlaceholderName = ((WebElement)ptPlaceholderName.get(i)).getText();
//        if (PlaceholderName.equals(temp))
//        {
//          ((WebElement)checkboxValue.get(i)).click();
//          flag = true;
//          break;
//        }
//      }
//      if (flag) {
//        return Constants.KEYWORD_PASS + "--" + data + "-- is found to click";
//      }
//      return Constants.KEYWORD_PASS + "--Correct Placeholder name is not found to delete";
//
//    }
//    catch (TimeoutException ex)
//    {
//      return Constants.KEYWORD_FAIL + "Cause: " + ex.getCause();
//    }
//    catch (Exception nse)
//    {
//      return Constants.KEYWORD_FAIL + nse.getLocalizedMessage();
//    }
//  }
//  
//
//
//
//  public String verifyPTwithLessthanSymbol(String object, String data)
//  {
//    try
//    {
//      List<WebElement> placementTempName = KeywordEventsUtill.explictWaitForElementList("pt_temp_name_rows");
//      boolean flag = false;
//      String temp = data;
//      
//      for (int i = 2; i < placementTempName.size(); i++)
//      {
//        String ColumnNameValue = KeywordEventsUtill.driver.findElement(By.xpath(DataProvider.OR.getProperty("pt_temp_start_link") + i + DataProvider.OR.getProperty("pt_temp_end_link"))).getText();
//        if (ColumnNameValue.equals(temp))
//        {
//          flag = true;
//          break;
//        }
//      }
//      
//      if (flag)
//      {
//        return Constants.KEYWORD_FAIL + "--Placement Temp with '<' symbol is displayed as Blank";
//      }
//      
//
//      return Constants.KEYWORD_PASS + "--placement template with '<' symbol is displayed";
//
//    }
//    catch (TimeoutException ex)
//    {
//      return Constants.KEYWORD_FAIL + "Cause: " + ex.getCause();
//    }
//    catch (Exception nse)
//    {
//      return Constants.KEYWORD_FAIL + nse.getLocalizedMessage();
//    }
//  }
//  
//
//
//
//
//
//  public String clickOnPlacementTemplatelink(String object, String data)
//  {
//    DataProvider.logger.debug("click on the placement template name link");
//    try {
//      List<WebElement> tempName = KeywordEventsUtill.explictWaitForElementList("pt_place_holder_rows");
//      boolean flag = false;
//      String temp = data.trim();
//      for (int i = 0; i < tempName.size(); i++)
//      {
//        String template_name = ((WebElement)tempName.get(i)).getText().trim();
//        if (template_name.equals(temp))
//        {
//          ((WebElement)tempName.get(i)).click();
//          flag = true;
//          break;
//        }
//      }
//      if (flag)
//      {
//        return Constants.KEYWORD_PASS + "--" + data + "---is found to click";
//      }
//      
//    }
//    catch (TimeoutException ex)
//    {
//      return Constants.KEYWORD_FAIL + "Cause: " + ex.getCause();
//    }
//    catch (Exception nse)
//    {
//      return Constants.KEYWORD_FAIL + nse.getLocalizedMessage();
//    }
//    return Constants.KEYWORD_FAIL + " ---placement template name  is not found to click.";
//  }
//  
//
//
//
//
//
//  public String verifyAttachmentDateTimeFormat(String object, String data)
//  {
//    DataProvider.logger.debug("verifying the date format");
//    
//    String date_text = ((WebElement)KeywordEventsUtill.wait.until(KeywordEventsUtill.explicitWaitForElement(By.xpath(DataProvider.OR.getProperty(object))))).getText();
//    String[] xpath = date_text.split("on");
//    String expected_date_time = xpath[1].trim();
//    DataProvider.logger.debug(expected_date_time);
//    
//
//    SimpleDateFormat sdf = new SimpleDateFormat(data.trim());
//    boolean flag = false;
//    try {
//      sdf.setLenient(false);
//      sdf.parse(expected_date_time.trim());
//      flag = true;
//
//    }
//    catch (TimeoutException ex)
//    {
//      return Constants.KEYWORD_FAIL + "Cause: " + ex.getCause();
//    }
//    catch (ParseException e)
//    {
//      e.printStackTrace();
//      return Constants.KEYWORD_FAIL + " -- date is not in correct format";
//    }
//    if (flag) {
//      return Constants.KEYWORD_PASS + " -- date is in correct format";
//    }
//    return Constants.KEYWORD_FAIL + " -- date and time is not in correct format";
//  }
//  
//
//
//
//
//
//
//  public String adminOrgCount(String object, String data)
//  {
//    DataProvider.logger.debug("Entered into verifyOrgCount method");
//    admin_org_cb = KeywordEventsUtill.explictWaitForElementSize(object);
//    DataProvider.logger.debug("count of org is=" + org_cb);
//    return Constants.KEYWORD_PASS + "count of Org is=" + admin_org_cb;
//  }
//  
//
//
//
//
//
//  public String verifyOrgCount(String object, String data)
//  {
//    DataProvider.logger.debug("Entered into verifyOrgCount method");
//    
//    org_cb = KeywordEventsUtill.explictWaitForElementSize(object);
//    DataProvider.logger.debug("count of org is=" + org_cb);
//    
//    if (org_cb == admin_org_cb) {
//      return Constants.KEYWORD_PASS + "All the " + org_cb + "Organizations are displayed";
//    }
//    
//    return Constants.KEYWORD_FAIL + "All Organizations are not displayed";
//  }
//}
//
