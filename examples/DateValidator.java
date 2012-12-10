package examples;

import java.text.DateFormat;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import examples.Unfinished.Priority;
 
//import com.annotation.UnderConstruction;
//import com.annotation.Unfinished;
//import com.annotation.Unfinished.Priority;
//import com.util.Util;
 
@UnderConstruction(owner="Navin Gujarish")
public class DateValidator implements Validator{
   
   public static void main (String[]args) {
      FacesContext context = null;
      UIComponent component = null;
      new DateValidator().validate(context, component, "");
   }
 
      public void validate(FacesContext context, UIComponent component, Object value)
                        throws ValidatorException 
        {
                String date = (String) value;
                String errorLabel = "Please enter a valid date.";
                if(!component.getAttributes().isEmpty())
                {
                        errorLabel = (String) component.getAttributes().get("errordisplayval");
                }
 
                if(!validateAGivenDate(date))
                //   if(!Util.validateAGivenDate(date))
                {
                        @Unfinished(changedBy = "Steve"
                                ,value="whether to add message to context or not, confirm"
                                ,priority=Priority.HIGH
                        )
                        FacesMessage message = new FacesMessage(); 
                        message.setSeverity(FacesMessage.SEVERITY_ERROR); 
                        message.setSummary(errorLabel); 
                        message.setDetail(errorLabel); 
                        throw new ValidatorException(message); 
                }
        }
      
      boolean validateAGivenDate(String possibleDate) {
         DateFormat df = DateFormat.getDateInstance();
         try {
            df.parse(possibleDate);
            return true;
         } catch (Exception e) {
            return false;
         }
      }

}
