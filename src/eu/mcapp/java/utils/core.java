package eu.mcapp.java.utils;

import java.lang.reflect.Method;

/**
 * Created by waqar on 13/06/15.
 */
public class core {

    public static void runDemo(String className, String functionName) {
        Class noparams[] = {};
        try {
            //load the AppTest at runtime
            Class cls = Class.forName("eu.mcapp.java." + className);
            Object obj = cls.newInstance();

            if(functionName != null && !functionName.isEmpty()) {
                //call the printIt method
                Method method = cls.getDeclaredMethod(functionName, noparams);
                method.invoke(obj, null);
            }else{}

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void reflect(String className, String functionName)
    {
        Class noparams[] = {};
        try {
            //load the AppTest at runtime
            Class cls = Class.forName("eu.mcapp.java." + className);
            Object obj = cls.newInstance();

            if(functionName != null && !functionName.isEmpty()) {
                //call the printIt method
                Method method = cls.getDeclaredMethod(functionName, noparams);
                method.invoke(obj, null);
            }else{}

        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
