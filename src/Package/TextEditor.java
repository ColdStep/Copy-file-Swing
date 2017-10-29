package Package;



public class TextEditor {

    String textEdit(String link1 , String link2) {
        char[] list1 = new char[120];
        char[] list2 = new char[120];
        char[] list3 = new char[120];

        String first = link1;
        String second = link2;
        int number = first.length();

        for (int i =0; i<first.length(); i++){
            if (first.charAt(i) == '\\'){
                list1[i] = '/';
            }else list1[i] = first.charAt(i);
        }
        for (int i =0; i<second.length(); i++){
            if (second.charAt(i) == '\\'){
                list2[i] = '/';
            }else list2[i] = second.charAt(i);
        }

        for (int i=list1.length-1; i>0; i--){
            if (list1[i] == '/'){
                break;
            }else{
                number--;
            }
        }
        for (int i = list1.length-1; i >= number-1; i--){
            list3[i] = list1[i];
        }

        first = new String(list3);
        second = new String(list2);
        second  += first ;

        return second;
    }
}
