package converter.ejb;

import java.text.DecimalFormat;
import jakarta.ejb.Stateless;
import jakarta.ejb.LocalBean;

@Stateless
@LocalBean
public class ConverterBean implements ConverterBeanLocal {

    private final DecimalFormat twoDigits = new DecimalFormat("0.00");
    
    public String ctor(double c) {
        String result = twoDigits.format(0.8 * (c));
        return result;
    }
    
    public String rtoc(double r) {
        String result = twoDigits.format(r / 0.8);
        return result;
    }
}
