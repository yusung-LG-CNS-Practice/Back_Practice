import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class IOStreamApp {

    public static void main(String[] args) {
        System.out.println("debug >>>> io stream 이용한 데이터 입출력 : ");
        // try{
        //     int input = System.in.read();
        //     System.out.println((char)input);
        // }catch(IOException e){
        //     e.printStackTrace();
        // }

        System.out.println("debug >>>> io stream 이용한 데이터 입출력 char : ");

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // try{
        //     String input = br.readLine();
        //     System.out.println(input);
        // }catch(Exception e){
        //     e.printStackTrace();
        // }finally{
        //     try{
        //         if(br != null){
        //             br.close();
        //         }
        //     }catch(Exception e){
        //         e.printStackTrace();
        //     }
        // }

        System.out.println("debug >>>> autocloseable : ");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            System.out.println(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
