package test;

public class Test1 {
    public static void main(String[] args)  {
        String res = http.Get.sendGet(27874938);

        String[] strings = res.split("\\[|\\]");
        for(String str : strings){
            System.out.println(str);
        }
    }
}

