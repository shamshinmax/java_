package dz4_20JUNE;

// 2. Создать телефонный справочник с возможностью импорта и экспорта данных в нескольких форматах.
// под форматами понимаем структуру файлов, например:
// - в файле на одной строке хранится одна часть записи, пустая строка - разделитель



public class program {
    public static void main(String[] args) {
        Boolean flag = true;
        String input;

        while (flag){
            action.start();
            input = action.input();
                if (input.equals("imp")){
                    action.imp();
                } else if(input.equals("exp")){
                    System.out.println(action.exp());
                } else if(input.equals("end")){
                    flag = action.end();
                } else{
                    System.out.println("No such operation");
                }

              
            
            } 
        }

}
        




    
