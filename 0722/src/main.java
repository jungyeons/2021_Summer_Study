
public class main {

	public static void main(String[] args) {
		Car car = new Car();
		car.color = "����";
		car.name = "���������";
		car.number = 1;
		
		
        Bus bus = new Bus();
        bus.color = "����";
        bus.money = "1200��";
        bus.number = 4444;
        
        Otobai otobai = new Otobai();
        otobai.color ="�ʷ�";
        otobai.name = "�θ�";
        otobai.number = 3;
        
        car.move();
        otobai.sleep();

}
}
