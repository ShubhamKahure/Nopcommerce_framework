package Com.Ecommerce.Utilities;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.ITestAnnotation;

public class Mytransfomer implements IAnnotationTransformer{

       public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		    
    	   annotation.setRetryAnalyzer(RetryAnalyzer.class);
    	   
		  }
}
