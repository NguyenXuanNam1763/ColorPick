package com.example.materialdesignexp;

import android.util.Log;

public class Utils {
    public static void log(String log) {
        if (BuildConfig.DEBUG) {
            final StackTraceElement stackTrace = new Exception().getStackTrace()[1];

            String fullClassName = stackTrace.getClassName();
            String fileName = stackTrace.getFileName();
            if (fileName == null) fileName="";  // It is necessary if you want to use proguard obfuscation.

            final String info = fullClassName + " " + stackTrace.getMethodName() + " (" + fileName + ":"
                    + stackTrace.getLineNumber() + ")";

            Log.e("===M", info + ": " + log);
        }
    }

}
