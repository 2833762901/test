package wcx2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        input.input("E:\\input.txt");
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        output.output("E:\\output.txt");
        String pathname = "E:\\output.txt";
        try (FileReader reader = new FileReader(pathname);
                BufferedReader br = new BufferedReader(reader) // ����һ�����������ļ�����ת�ɼ�����ܶ���������
           ) {
               String line;
               //�����Ƽ����Ӽ���д��
               while ((line = br.readLine()) != null) {
                   // һ�ζ���һ������
                   System.out.println(line);
               }
           } catch (IOException e) {
               e.printStackTrace();
           }
    }
}
