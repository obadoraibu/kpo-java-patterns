import java.util.Scanner;


/*Фабричный метод - порождающий паттерн, определяет общий интерфейс создания обьектов в суперклассе,
позволяя подкласам самим определять тип создаваемых обьектов.

Допустим, мы пишем код для пользования автоматами с напитками. Сначала мы можем захотеть выпить квас, и подойдем к соответствующему автомату,
 а затем выпить березового сока, который продается в другом автомате. В будущем легко будет поставить рядом и третий автомат. (Только дружественные напитки)
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Налить квас или березовый сок?(Квас/Сок)");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        in.close();
        Drink drink;
        VendingMachine machine;
        switch (input) {
            case "Квас":
                machine = new KvassVendingMachine("Автомат с квасом");
                drink = machine.Create();
                break;
            case "Сок":
                machine = new BirchSapVendingMachine("Автомат с березовым соком");
                drink = machine.Create();
                break;
            default:
                System.out.println("Такое у нас пить не принято...");
                break;
        }
    }
}

