package web;
import java.util.*;
import org.springframework.ui.*;
import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {
	
	@RequestMapping("/")
	String index() {
		return "index";
	}
	
	@RequestMapping("/jsp")
	String jsp() {
		return "index-jsp";
	}
        
        @RequestMapping("/highestCommonFactor") @ResponseBody
        ArrayList highestCommonFactor(int n){
            ArrayList result = new ArrayList();
            for(int i=1; i<=n; i++){
                if(n%i==0) result.add(i);                           
            }
            return result;
        }
        
        @RequestMapping("/transpotFee") @ResponseBody
        ArrayList transpotFee(double weight){
            goods temp = new goods();
            ArrayList result = new ArrayList();
            goods temp1 = new goods(), temp2 = new goods(), temp3= new goods();
            temp1.setCarrier("fedex");
            temp1.setWeight(weight);
            temp1.getCost();
            result.add(temp1);
            temp2.setCarrier("ups");
            temp2.setWeight(weight);
            temp2.getCost();
            result.add(temp2);
            temp3.setCarrier("dhl");
            temp3.setWeight(weight);
            temp3.getCost();
            result.add(temp3);
            return result;
        }
}

