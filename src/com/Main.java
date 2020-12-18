import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.printf("Введите название файла: ");
        Scanner input = new Scanner(System.in);
        String filename = input.nextLine();

      File file = new File(filename);
      if(file.isDirectory()){
          System.out.println("Это каталог. Файлы:");
          File[] files = file.listFiles();
          for(File f : files)
              System.out.println(f.getName());
      }else if(file.isFile()){
          System.out.println("Файл найден. Содержимое файла:");
          FileReader reader = new FileReader(file);
          int data = reader.read();
          while(data != -1){
              System.out.print((char)data);
              data = reader.read();
          }
          reader.close();
      }else if(!file.exists()){
          System.out.println("Такого файла не существует.");
          System.out.println("1. Создать новый файл");
          System.out.println("2. Выход");
          System.out.print("Введите число: ");
          int choice = input.nextInt();
          input.nextLine();

          switch (choice){
              case 1:
                  file.createNewFile();
                  System.out.println("Файл " + file.getName() + " создан.");
                  FileWriter writer = new FileWriter(file);
                  System.out.println("Введите информацию в файл:");
                  writer.write(input.nextLine());
                  writer.close();
                  break;
              case 2:
                  return;
          }
      }
    }
}
