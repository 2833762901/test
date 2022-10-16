package wcx3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) {
        //��������
        KWICSubject kwicSubject = new KWICSubject();
        //�����۲���
        Input input = new Input("E:\\input.txt");
        Shift shift = new Shift(input.getLineTxt());
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        Output output = new Output(alphabetizer.getKwicList(), "E:\\output.txt");

        // ���۲��߼�������
        kwicSubject.addObserver(input);
        kwicSubject.addObserver(shift);
        kwicSubject.addObserver(alphabetizer);
        kwicSubject.addObserver(output);
        // �𲽵��ø����۲���
        kwicSubject.startKWIC();
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
