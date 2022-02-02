public class JvmComprehension {     // метаданные о классах загружаются в metaspace

    public static void main(String[] args) {
        int i = 1;                      // данные отправляются в stack
        Object o = new Object();        // создается новый объект типа "Object", он отправляется в heap,
                                        // a ссылка на него записывается в переменную "o" и отправляется в stack
        Integer ii = 2;                 // создается новый объект типа "Integer", он отправляется в heap,
                                        // а ссылка на него записывается в переменную "ii" и отправляется в stack
        printAll(o, i, ii);             // создается новый фрейм printAll в stack
        System.out.println("finished"); // создается новый фрейм в stack
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // создается новый объект типа "Integer", он отправляется в heap,
                                                    // а ссылка на него записывается в переменную "uselessVar" и отправляется в stack
        System.out.println(o.toString() + i + ii);  // создается новый фрейм в stack
    }

}
