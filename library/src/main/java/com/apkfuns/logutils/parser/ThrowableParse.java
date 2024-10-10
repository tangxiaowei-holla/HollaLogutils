package com.apkfuns.logutils.parser;

import android.util.Log;

import androidx.annotation.NonNull;

import com.apkfuns.logutils.Parser;

/**
 * Created by pengwei on 16/3/8.
 */
class ThrowableParse implements Parser<Throwable> {
    @NonNull
    @Override
    public Class<Throwable> parseClassType() {
        return Throwable.class;
    }

    @Override
    public String parseString(@NonNull Throwable throwable) {
        return Log.getStackTraceString(throwable);
    }
}
