package programmer.zaman.now.maven;

import com.google.gson.Gson;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Gson gson = new Gson();

        Person brian = new Person("brian");
        String json = gson.toJson(brian);

        System.out.println(json);
    }
}
