public class ConversaoDeUnidadesDeTemperatura {
    
    public static float CToF(float c){
        float f = (((c/5)) + 32);
        return f;
    }
    public static float FToC(float f){
        float c = ((f-32)*(5/9));
        return c;
    }
    public static  float CToK(float c){
        float k = c + 273.15f;
        return k;
    }
    public static  float KToC(float k){
        float c = k - 273.15f;
        return c;
    }
    public static float CToRe(float c){
        float re = c * (4/5);
        return re;
    }
    public static float ReToC(float re){
        float c = re * (5/4);
        return c;
    }
    public static float KToR(float k){
        float r = k * 1.8f;
        return r;
    }
    public static float RToK(float r){
        float k = r/1.8f;
        return k;
    }
}
