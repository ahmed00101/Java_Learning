package eu.mcapp.java.console;

/**
 * Created by waqar on 13/06/15.
 */
public class consoleMenuItem {
    private String key;
    private String name;
    private String description;
    private String className;
    private String functionName;



    public consoleMenuItem()
    {
    }

    /**
     *
     * @param key
     * @param name
     * @param description
     * @param className
     * @param functionName
     */
    public consoleMenuItem(String key,String name, String description, String className, String functionName)
    {

        this.key = key;
        this.name = name;
        this.description = description;
        this.className = className;
        this.functionName = functionName;

    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public void print()
    {
        System.out.println("");
    }
}
