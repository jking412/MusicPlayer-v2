package pkg.http;


import com.google.gson.Gson;

public class Json {
    public static String deserializeJson(String json){
        Gson gson = new Gson();

        Result result = gson.fromJson(json,Result.class);

        return result.lyric;
    }
}

class Result{
    public String lyric;
}
