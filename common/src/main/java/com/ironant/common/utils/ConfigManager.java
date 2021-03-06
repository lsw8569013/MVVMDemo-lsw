package com.ironant.common.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import java.util.Map;

/**
 * some method about configure
 * @author bing
 *
 */
public class ConfigManager {
	public static final String LOCK_PWD = "lock_pwd";
	public static final String LOCK_TYPE = "lockType";
	/**
	 * Set a value in the preferences editor and commit it
	 * @param context
	 * @param key The name of the preference to modify
	 * @param value The new value for the preference
	 * @return Returns true if the new values were successfully written to persistent storage
	 */
    public static final boolean put(Context context, String key, Object value){
    	SharedPreferences sp = context.getSharedPreferences(Constant.PREF_NAME, Context.MODE_PRIVATE);
    	Editor editor = sp.edit();
    	if(value instanceof Boolean){
    		editor.putBoolean(key, (Boolean) value);
    	}else if(value instanceof Float){
    		editor.putFloat(key, (Float) value);
    	}else if(value instanceof Integer){
    		editor.putInt(key, (Integer)value);
    	}else if(value instanceof Long){
    		editor.putFloat(key, (Long) value);
    	}else if(value instanceof String){
    		editor.putString(key, (String) value);
    	}else{
    		throw new RuntimeException("unSupported type:" + value.getClass().getName());
    	}
    	return editor.commit();
    }
    /**
     * remove a preference value and commit it
     * @param context
     * @param key The name of the preference to remove.
     * @return Returns true if the new values were successfully written to persistent storage
     */
    public static final boolean remove(Context context, String key){
    	return context.getSharedPreferences(Constant.PREF_NAME, Context.MODE_PRIVATE).edit().remove(key).commit();
    }
    /**
     * Retrieve a string value from the preferences.
     * @param context
     * @param key The name of the preference to retrieve.
     * @param defaltValue Value to return if this preference does not exist.
     * @return
     */
    public static final String getString(Context context, String key, String defaltValue){
    	return context.getSharedPreferences(Constant.PREF_NAME, Context.MODE_PRIVATE).getString(key, defaltValue);
    }
    /**
     * Retrieve a int value from the preferences.
     * @param context
     * @param key The name of the preference to retrieve.
     * @param defaltValue Value to return if this preference does not exist.
     * @return
     */
    public static final int getInt(Context context, String key, int defaltValue){
    	return context.getSharedPreferences(Constant.PREF_NAME, Context.MODE_PRIVATE).getInt(key, defaltValue);
    }
    /**
     * Retrieve a float value from the preferences.
     * @param context
     * @param key The name of the preference to retrieve.
     * @param defaltValue Value to return if this preference does not exist.
     * @return
     */
    public static final Float getFloat(Context context, String key, Float defaltValue){
    	return context.getSharedPreferences(Constant.PREF_NAME, Context.MODE_PRIVATE).getFloat(key, defaltValue);
    }
    /**
     * Retrieve a long value from the preferences.
     * @param context
     * @param key The name of the preference to retrieve.
     * @param defaltValue Value to return if this preference does not exist.
     * @return
     */
    public static final Long getLong(Context context, String key, Long defaltValue){
    	return context.getSharedPreferences(Constant.PREF_NAME, Context.MODE_PRIVATE).getLong(key, defaltValue);
    }
    /**
     * Retrieve a boolean value from the preferences.
     * @param context
     * @param key The name of the preference to retrieve.
     * @param defaltValue Value to return if this preference does not exist.
     * @return
     */
    public static final Boolean getBoolean(Context context, String key, Boolean defaltValue){
    	return context.getSharedPreferences(Constant.PREF_NAME, Context.MODE_PRIVATE).getBoolean(key, defaltValue);
    }
    /**
     * Retrieve all values from the preferences.
     * @param context
     * @return Returns a map containing a list of pairs key/value representing the preferences.
     */
    public static final Map<String, ?> getAll(Context context){
    	return context.getSharedPreferences(Constant.PREF_NAME, Context.MODE_PRIVATE).getAll();
    }
    
    
//	/**
//	 * 加载资源文件
//	 * @param context
//	 * @return
//	 */
//    public static Properties loadProperties(Context context) {
//
//        Properties props = new Properties();
//        try {
////            int id = context.getResources().getIdentifier("androidpn", "raw",
////                    context.getPackageName());
//            props.load(context.getResources().openRawResource(R.raw.portal));
//        } catch (Exception e) {
//        	e.printStackTrace();
//        }
//        return props;
//    }
    
}
