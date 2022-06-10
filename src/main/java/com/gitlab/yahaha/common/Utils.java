package com.gitlab.yahaha.common;

import okhttp3.MediaType;

public class Utils {
    public final static MediaType getJsonMediaType(){
        return MediaType.get("application/json; charset=utf-8");
    }
}
