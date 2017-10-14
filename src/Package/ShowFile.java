package Package;


        import java.io.File;
        import java.io.FileInputStream;
        import java.io.FileOutputStream;
        import java.io.IOException;

class ShowFile {
  public  void Copy(String link1, String link2){
        File file =new File(link1);

        //Створюємо змінну для циклу
       int i;
        //відкриваємо txt файл для зчитування який при закінченні процедури try сам закриється
        try(FileInputStream first = new FileInputStream(file)) {
            //Створюємо поток виводу для запису копії файлу
            FileOutputStream second = new FileOutputStream(link2);      //Створюємо цикл для зчитування і запису інформації
            do {
                i =  first.read();
                second.write(i);
            }while(i != -1);
            //Закриваємо поток виводу
            second.close();
            System.out.println("Complete");
        } catch (IOException e) {
            System.out.println("Can't open"+ e);
        }
        //При закінченні виконання роботи виводиться надпис в консоль


    }
    String textEdit(String link1 , String link2) {
        char[] list1 = link1.toCharArray();
        char[] list2 = link2.toCharArray();



        int number1 = list1.length;
        int j=0;

        for (int i =0; i<number1; i++){
            if (list1[i] == '\\'){
                list1[i] = '/';
            }
        }

        for (int i =0; i<list2.length; i++){
            if (list2[i] == '\\'){
                list2[i] = '/';
            }
        }



        for (int i=list1.length-1; i>0; i--){
            if (list1[i] == '/'){
                break;
            }else{
                number1--;
            }
        }
        int number2 = list1.length - number1;



        char[] list3 = new char[number2+1];
        for (int i = number1-1; i <= list1.length-1; i++){
            list3[j] = list1[i];
            j++;
        }

        String first = new String(list3);
        String second = new String(list2);
        second  += first ;


        return second;
    }
}
