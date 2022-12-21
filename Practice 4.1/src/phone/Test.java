package phone;

public class Test
{
    public static void main(String[] args)
    {
        Phone phone1=new Phone("84959528833","LG",450);
        Phone phone2=new Phone("89093151825","HTC",560);
        Phone phone3=new Phone("89167223163","iPhone",435);

        System.out.println(phone1.toString()+"\n"+phone2.toString()+"\n"+phone3.toString());
        System.out.println("\n");
        phone1.receiveCall("Андрей");
        System.out.print("\n");
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        System.out.print("\n");
        phone2.receiveCall("Виктор", "89094498472");
        System.out.print("\n");
        System.out.println("Сообщения будуь отправлены следующим номерам:");
        phone3.sendMessage("89342352445","89348345242","89991457390");
    }
}