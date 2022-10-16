package wcx4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
        File inFile = new File("E:\\input.txt");
        File outFile = new File("E:\\output.txt");
        Pipe pipe1 = new Pipe();
        Pipe pipe2 = new Pipe();
        Pipe pipe3 = new Pipe();
        Input input = new Input(inFile, pipe1);
        Shift shift = new Shift(pipe1, pipe2);
        Alphabetizer alphabetizer  = new Alphabetizer(pipe2, pipe3);
        Output output = new Output(outFile,pipe3);
        input.transform();
        shift.transform();
        alphabetizer.transform();
        output.transform();
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
