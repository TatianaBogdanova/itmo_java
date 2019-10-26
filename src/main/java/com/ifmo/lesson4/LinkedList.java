package main.java.com.ifmo.lesson4;

/**
 * Односвязный список, где каждый предыдущий
 * элемент харнит ссылку на следующий. Список
 * оканчивается ссылкой со значением {@code null}.
 */
public class LinkedList {
    /** Ссылка на первый элемент списка. */
    private Item head;

    /**
     * Добавляет значение в конец списка.
     *
     * @param val Значение, которое будет добавлено.
     */
    public void add(Object val) {
        // TODO implement
        if (head == null){
            head = new Item(val);
        }
        else{
            Item temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new Item(val);
        }
    }

    /**
     * Извлекает значение из списка по индексу.
     *
     * @param i Индекс значения в списке.
     * @return Значение, которое находится по индексу
     * или {@code null}, если не найдено.
     */
    public Object get(int i) {
        // TODO implement
        if (i==0){
            if (this == null){
                return null;
            }
            else{
                return this.head;
            }
        }
        else{
            Item temp = this.head;
            int count = 0;
            while (count != (i-1)){
                count++;
                temp = temp.next;
                if (temp == null){
                    return null;
                }
            }
            return temp.value;
        }
    }

    public Object getlink(int i) {
        // TODO implement
        Item temp = this.head;
        if (i==0){
            return temp.next;
        }
        else{
            int count = 1;
            while (count != (i-1)){
                temp = temp.next;
                count++;
                if (temp == null){
                    return null;
                }
            }
            return temp.next;
        }
    }

    /**
     * Удаляет значение по индексу и возвращает
     * удаленный элемент.
     *
     * @param i Индекс, по которому будет удален элемент.
     * @return Удаленное значение или {@code null}, если не найдено.
     */
    public Object remove(int i) {
        // TODO implement
        if (i==0){
            if (this == null){
                return null;
            }
            else{
                Item temp = new Item(this.head.value);
                this.head = null;
                return temp;
            }
        }
        else{
            Item temp = this.head;
            Item previos = temp;
            int count = 0;
            while (count != (i-1)){
                count++;
                previos = temp;
                temp = temp.next;
                if (temp == null){
                    return null;
                }
            }
            previos.next = temp.next;
            return temp.value;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.get(0);

        list.add("String1");
        list.add("String2");
        list.add("String3");

        String string = (String)list.get(3);

        System.out.println(string);

        list.remove(2);


        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

    }
}
