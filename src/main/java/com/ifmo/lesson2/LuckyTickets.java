package com.ifmo.lesson2;

public class LuckyTickets {
    /*
    В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую
    неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от
    000001 до 999999. «Счастливым» считается билетик у которого сумма первых трёх цифр
    номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или
    567576. Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета
    и теперь раздумывает, как много сувениров потребуется. С помощью программы подсчитайте
    сколько счастливых билетов в одном рулоне?
     */
    public static void main(String[] args) {
        System.out.println(luckyTickets());
    }

    public static int luckyTickets() {
        int gift = 0;
        // TODO implement
        for ( int count =1; count <= 999999; count++){
            int firstPart = count/100000 + (count - 100000*(count/100000))/10000 +
                    (count - 100000*(count/100000) - ((count - 100000*(count/100000))/10000)* 10000 )/1000 ;
            int temp = count%1000;
            int secondPart = temp/100000 + (temp - 100000*(temp/100000))/10000 +
                    (temp - 100000*(temp/100000) - ((temp - 100000*(temp/100000))/10000)* 10000 )/1000 ;
            if ( firstPart == secondPart){
                System.out.println("f"+firstPart +"s"+secondPart);
                gift++;
            }

        }

        return gift;
    }
}
