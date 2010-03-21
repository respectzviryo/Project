package ca.project.constants;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
 
public class Globals extends HashMap<String, Object> { 
	private static final long serialVersionUID = 1L;
	
	// private members to facilitate constants management...
    private Map<String, Object> map = null;
 
    public Globals() {

        map = new HashMap<String, Object>();
        Class<? extends Globals> c = this.getClass();
        Field[] fields = c.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            int modifier = field.getModifiers();
            if (Modifier.isFinal(modifier) && !Modifier.isPrivate(modifier)) {
                try {
                    this.put(field.getName(), field.get(this));
                } catch (IllegalAccessException e) {

                }
            }
        }
    }
 
    @Override
	public Object get(Object key) {
        return map.get(key);
    }
 
    public Object getConst(String name) {
    	return get(name);
    }
    
    @Override
	public Object put(String key, Object value) {
        return map.put(key, value);
    }
}